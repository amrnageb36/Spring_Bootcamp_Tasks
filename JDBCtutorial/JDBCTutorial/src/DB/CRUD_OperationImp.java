package DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD_OperationImp implements CRUD_Operation {
    private DB_connectionSingleton db_connection;
    private Statement statement=DB_connectionSingleton.getDbConnectionSingleton().getStatement();
    public CRUD_OperationImp() throws SQLException, ClassNotFoundException {

    }

    @Override
    public void insert(){

    }
    @Override
    public void update(){

    }

    @Override
    public void delete(){

    }
    @Override
    public void search(int searchKey) throws SQLException {
        ResultSet rs=statement.executeQuery("select * from student where id = "+searchKey+";");
        System.out.println(rs.next());
    }
}
