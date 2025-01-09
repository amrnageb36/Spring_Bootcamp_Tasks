package DB;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DB_connectionSingleton db_connectionSingleton=DB_connectionSingleton.getDbConnectionSingleton();
        db_connectionSingleton.openConnection();
        System.out.println("connection established");
        CRUD_Operation crudOperation=new CRUD_OperationImp();
        crudOperation.search(1);
    }


}
