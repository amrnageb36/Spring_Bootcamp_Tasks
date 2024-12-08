package VehicleSystem.System;

import VehicleSystem.dao.OrderDto;
import VehicleSystem.dao.VehicleDto;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

@Component
public class TheInterface {

    Scanner sc = new Scanner(System.in);

   public void vehicel_OR_order(){
        System.out.println("1) Vehicles");
        System.out.println("2) Orders");
        System.out.println("3) Exit");
        System.out.println("Enter your choice: ");
   }

    public void vehicle_choices(){
        System.out.println("Vehicle choices");
        System.out.println("1) insert vehicle");
        System.out.println("2) delete vehicle");
        System.out.println("3) view vehicle");
        System.out.println("4) update vehicle");
        System.out.println("5) view all vehicles");
        System.out.println("Enter your choice: ");

    }

    public void order_choices(){
        System.out.println("order choices");
        System.out.println("1) insert order");
        System.out.println("2) delete order");
        System.out.println("3) view order");
        System.out.println("4) update order");
        System.out.println("5) view all orders");
        System.out.println("Enter your choice: ");

    }

    public static void handleVehicleChoice(int choice, VehicleDto vehicleDto) throws SQLException, ClassNotFoundException {
        switch (choice) {
            case 1 :
                vehicleDto.insertVehicle();
                break;
            case 2 :
                vehicleDto.deleteVehicle();
                break;
            case 3 :
                vehicleDto.searchVehicle();
                break;
            case 4 :
                vehicleDto.updateVehicle();
                break;
            case 5:
                vehicleDto.viewAllv();
                break;
            default : System.out.println("Invalid vehicle choice.");
        }


    }
    public static void handleOrderChoice(int choice, OrderDto orderDto) throws SQLException, ClassNotFoundException, ParseException {
       switch (choice) {
           case 1 :
               orderDto.insertOrder();
               break;
           case 2 :
               orderDto.deleteOrder();
               break;
           case 3 :
               orderDto.searchOrder();
               break;
           case 4 :
               orderDto.updateOrder();
               break;
           case 5 :
               orderDto.viewAll();
               break;
           default : System.out.println("Invalid order choice.");
       }
    }
}

