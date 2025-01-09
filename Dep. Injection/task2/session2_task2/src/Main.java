import injectingProp.Car;
import injectingProp.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car=(Car)container.getBean("car");
        car.saveDataintoDataBase(car);

        Plane plane=(Plane)container.getBean("plane");
        plane.saveDataintoDataBase(plane);

    }
}