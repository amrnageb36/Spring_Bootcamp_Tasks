import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import session_2_dep.Injection.Circle;
import session_2_dep.Injection.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");


        Circle circle = (Circle) container.getBean("circle");
        circle.drawShape2d();
        circle.drawShape3d();

        System.out.println("======================");

        Rectangle rectangle=(Rectangle) container.getBean("rectangle");
        rectangle.drawShape2d();
        rectangle.drawShape3d();
    }
}