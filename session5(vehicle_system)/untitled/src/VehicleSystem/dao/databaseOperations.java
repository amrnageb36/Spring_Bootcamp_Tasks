package VehicleSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.PropertyResolver;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;
import java.time.LocalDate;

@Component
@Scope("singleton")
public class databaseOperations {

    private final DB_Connection dbConnection;
    private final PropertyResolver propertyResolver;


    @Autowired
    public databaseOperations(DB_Connection dbConnection, PropertyResolver propertyResolver) throws SQLException, ClassNotFoundException {
        this.dbConnection = dbConnection;
        this.propertyResolver = propertyResolver;
    }

    public void searchVehicle(int searchKey) throws SQLException, ClassNotFoundException {
       Statement statement=dbConnection.getConnection().createStatement();
       ResultSet rs = statement.executeQuery("select * from vehicle where id =" + searchKey + ";");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }

    public void viewAllv() throws SQLException, ClassNotFoundException {
        Statement statement=dbConnection.getConnection().createStatement();
        ResultSet rs = statement.executeQuery("select * from vehicle");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }

    public void insertVehicle(int id ,String brand,String model ) throws SQLException, ClassNotFoundException {
        PreparedStatement statement= dbConnection.getConnection().prepareStatement("insert into vehicle values(?,?,?);");

        statement.setInt(1, id);
        statement.setString(2, brand);
        statement.setString(3, model);

        statement.executeUpdate();
    }

    public void deleteVehicle(int id) throws SQLException, ClassNotFoundException {
        PreparedStatement statement= dbConnection.getConnection().prepareStatement("delete from vehicle where id =" + id);
        statement.executeUpdate();
    }

    public void updateVehicle(int id, String brand, String model) throws SQLException, ClassNotFoundException {
       PreparedStatement statement= dbConnection.getConnection().prepareStatement("UPDATE vehicle SET brand = ?, model = ? WHERE id = ?;");

       statement.setString(1,brand);
       statement.setString(2,model);
       statement.setInt(3, id);

       statement.executeUpdate();
    }
    public void searchOrder(int searchKey) throws SQLException, ClassNotFoundException {
        Statement statement=dbConnection.getConnection().createStatement();
        ResultSet rs = statement.executeQuery("select * from orders where id =" + searchKey + ";");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }

    public void viewAll() throws SQLException, ClassNotFoundException {
        Statement statement=dbConnection.getConnection().createStatement();
        ResultSet rs = statement.executeQuery("select * from orders");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " "+rs.getString(4));
        }
    }

    public void insertOrder(int id , LocalDate orderDate, Double Price, int vehicleID ) throws SQLException, ClassNotFoundException {
        PreparedStatement statement= dbConnection.getConnection().prepareStatement("insert into orders values(?,?,?,?);");

        statement.setInt(1, id);
        statement.setDate(2,Date.valueOf(orderDate));
        statement.setDouble(3, Price);
        statement.setInt(4, vehicleID);

        statement.executeUpdate();
    }

    public void deleteOrder(int id) throws SQLException, ClassNotFoundException {
        PreparedStatement statement= dbConnection.getConnection().prepareStatement("delete from orders where id =" + id);
        statement.executeUpdate();
    }

    public void updateOrder(int orderID,double price,LocalDate date,int vehicleID) throws SQLException, ClassNotFoundException {
        PreparedStatement statement= dbConnection.getConnection().prepareStatement("UPDATE orders SET Price = ?, Date = ?,vehicle_id = ? WHERE id = ?;");
        statement.setDouble(1, price);
        statement.setDate(2, Date.valueOf(date));
        statement.setInt(3, vehicleID);
        statement.setInt(4, orderID);

        statement.executeUpdate();
    }
    @PostConstruct
    public void init(){
        System.out.println("The connection to database established");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("The connection to database is destroyed");
    }
}
