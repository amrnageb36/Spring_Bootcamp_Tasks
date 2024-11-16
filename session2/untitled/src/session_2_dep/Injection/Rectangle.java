package session_2_dep.Injection;

public class Rectangle implements Shape {
   Darw2d darw2d;
   Draw3d draw3d;


    public Rectangle(Darw2d darw2d, Draw3d draw3d) {
        this.darw2d = darw2d;
        this.draw3d = draw3d;
    }

    public void setDarw2d(Darw2d darw2d) {
        this.darw2d = darw2d;
    }


    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    @Override
    public void drawShape2d(){darw2d.draw("rectangle");}

    @Override
    public void drawShape3d(){draw3d.draw("rectangle");}

}
