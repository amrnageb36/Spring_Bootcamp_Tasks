package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_connectionSingleton {

    public static DB_connectionSingleton db_connectionSingleton=null;
    public static Statement statement=null;
    private Connection connection;

    private DB_connectionSingleton(){

    }

    public static DB_connectionSingleton getDbConnectionSingleton(){
        if(db_connectionSingleton==null){
            db_connectionSingleton=new DB_connectionSingleton();
        }
        return db_connectionSingleton;
    }

    public Connection openConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        if(connection==null){
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdata?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "01143614968aA*");
            return connection;
        }
        return connection;
    }

    public Statement getStatement() throws SQLException, ClassNotFoundException {
        if(statement==null) {
            statement = openConnection().createStatement();
            return statement;
        }
        return statement;
    }

    public void closeConnection() throws SQLException{
        connection.close();
    }
}


