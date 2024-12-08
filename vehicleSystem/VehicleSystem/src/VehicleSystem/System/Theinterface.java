package VehicleSystem.System;

import VehicleSystem.DAO.VehicleDto;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.Scanner;

@Component
public class Theinterface {
    Scanner sc = new Scanner(System.in);
    public void vehicle_choices(){
        System.out.println("Vehicle choices");
        System.out.println("1) insert vehicle");
        System.out.println("2) delete vehicle");
        System.out.println("3) view vehicle");
        System.out.println("4) update vehicle");
        System.out.println("5) view all vehicles");
        System.out.println("Enter your choice: ");
    }

    public static void handleVehicleChoice(int choice, VehicleDto vehicleDto) throws SQLException, ClassNotFoundException {
        switch (choice) {
            case 1:
                vehicleDto.insertVehicle();
                break;
            case 2:
                vehicleDto.deleteVehicle();
                break;
            case 3:
                vehicleDto.searchVehicle();
                break;
            case 4:
                vehicleDto.updateVehicle();
                break;
            case 5:
                vehicleDto.viewAllv();
                break;
            default:
                System.out.println("Invalid vehicle choice.");
        }
    }
}
