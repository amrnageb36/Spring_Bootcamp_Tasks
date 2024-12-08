package VehicleSystem;

import VehicleSystem.DAO.VehicleDto;
import VehicleSystem.Config.Config;
import VehicleSystem.System.Theinterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        Scanner scanner = new Scanner(System.in);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Theinterface theinterface = context.getBean(Theinterface.class);

        VehicleDto vehicleDto = context.getBean("vehicleDto", VehicleDto.class);



        boolean flag = true;
        while (flag == true) {
            System.out.println("1) Vehicels system");
            System.out.println("2) Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    theinterface.vehicle_choices();
                    int choice2 = scanner.nextInt();
                    theinterface.handleVehicleChoice(choice2, vehicleDto);
                    break;
                case 2:
                    System.out.println("Exiting the system. Goodbye!");
                    flag=false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            pause();


        }


    }
    public static void pause() {
        System.out.println("Press Enter to continue...");
        try {
            System.in.read(); // Waits for the user to press Enter
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}