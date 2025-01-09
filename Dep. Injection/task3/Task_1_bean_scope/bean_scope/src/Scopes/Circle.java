package Scopes;

public class Circle implements Shape{
    Draw2d draw2d;
    Draw3d draw3d;
    DatabaseOperations dbOperations;

    public Circle(DatabaseOperations dbOperations, Draw3d draw3d, Draw2d draw2d) {
        this.dbOperations = dbOperations;
        this.draw3d = draw3d;
        this.draw2d = draw2d;
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
        dbOperations.connectToDatabase();
    }
    public void disconnectFromDatabase(){
        dbOperations.disconnectFromDatabase();
    }
}
