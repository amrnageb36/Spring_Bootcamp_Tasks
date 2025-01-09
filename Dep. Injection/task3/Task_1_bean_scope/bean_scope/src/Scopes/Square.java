package Scopes;

public class Square implements Shape {
    Draw2d draw2d;
    Draw3d draw3d;
    DatabaseOperations databaseOperations;

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    public void setDatabaseOperations(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    @Override
    public void darw2d() {
        draw2d.draw("Square ");

    }

    @Override
    public void darw3d() {
        draw3d.draw("Square ");

    }
    public void connectToDatabase(){
        databaseOperations.connectToDatabase();
    }
    public void disconnectFromDatabase(){
        databaseOperations.disconnectFromDatabase();
    }
}
