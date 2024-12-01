package VehicleSystem.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
@Scope("singleton")
public class DB_Connection {

    @Value("${database.url}")
    private String url;

    @Value("${database.user}")
    String user;

    @Value("${database.password}")
    String password;

    @Value("${database.DRIVER_CLASS}")
    String driver;

    public static DB_Connection DB_connection =null;
    public static Statement statement=null;
    private Connection connection;

    private DB_Connection(){}



    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if(connection==null){
            Class.forName(driver);
            connection= DriverManager.getConnection(url,user,password);
            return connection;
        }
        return connection;
    }


    public void closeConnection() throws SQLException{
        connection.close();
    }



}
