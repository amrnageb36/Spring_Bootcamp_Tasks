import Scopes.Circle;
import Scopes.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = (Circle) context.getBean("circle");
        circle.darw2d();
        circle.darw3d();

        System.out.println("=======================================");

        Square square = (Square) context.getBean("square");
        square.darw2d();
        square.darw3d();
        ((ClassPathXmlApplicationContext) context).close();
    }
}