package VehicleSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

@Component
@Scope("singleton")
public class databaseOperations {

    private final DB_Connection dbConnection;


    @Autowired
    public databaseOperations(DB_Connection dbConnection) throws SQLException, ClassNotFoundException {
        this.dbConnection = dbConnection;
    }

    public void search(int searchKey) throws SQLException, ClassNotFoundException {
       Statement statement=dbConnection.getConnection().createStatement();
       ResultSet rs = statement.executeQuery("select * from vehicle_table where id =" + searchKey + ";");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
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
