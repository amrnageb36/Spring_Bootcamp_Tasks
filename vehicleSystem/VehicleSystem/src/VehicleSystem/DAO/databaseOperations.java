package VehicleSystem.DAO;

import VehicleSystem.DAO.DB_Connection;
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
}