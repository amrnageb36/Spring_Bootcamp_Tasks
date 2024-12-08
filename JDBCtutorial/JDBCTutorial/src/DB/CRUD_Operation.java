package DB;

import java.sql.SQLException;

public interface CRUD_Operation {
    public void insert();
    public void update();
    public void delete();
    public void search(int searchKey) throws SQLException;
}
