package VehicleSystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.Scanner;

@Component
public class VehicleDto {
    Scanner scanner = new Scanner(System.in);

    private final databaseOperations databaseOperations;

    @Autowired
    public VehicleDto(databaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void searchVehicle() throws SQLException, ClassNotFoundException {
        System.out.print("Enter vehicle ID: ");
        int vehicleId = scanner.nextInt();
        databaseOperations.searchVehicle(vehicleId);
    }

    public void insertVehicle() throws SQLException, ClassNotFoundException {
        System.out.print("Enter vehicle ID: ");
        int vehicleId = scanner.nextInt();
        System.out.print("Enter vehicle brand: ");
        String brand = scanner.next();
        System.out.print("Enter vehicle model: ");
        String model = scanner.next();
        databaseOperations.insertVehicle(vehicleId, brand, model);
        System.out.println("the vehicle added successfully");
    }

    public void deleteVehicle() throws SQLException, ClassNotFoundException {
        System.out.print("Enter vehicle ID that you want to delete: ");
        int vehicleId = scanner.nextInt();
        databaseOperations.deleteVehicle(vehicleId);
        System.out.println("the vehicle deleted successfully");

    }

    public void updateVehicle() throws SQLException, ClassNotFoundException {
        System.out.print("Enter vehicle ID that you want to update: ");
        int vehicleId = scanner.nextInt();
        System.out.print("Enter new vehicle brand: ");
        String brand = scanner.next();
        System.out.print("Enter new vehicle model: ");
        String model = scanner.next();
        databaseOperations.updateVehicle(vehicleId,brand,model);
        System.out.println("the vehicle updated successfully");

    }

    public void viewAllv() throws SQLException, ClassNotFoundException {
        databaseOperations.viewAllv();
    }
}
