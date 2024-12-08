package VehicleSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Component
public class OrderDto {
    Scanner scanner = new Scanner(System.in);

    private final databaseOperations databaseOperations;

    @Autowired
    public OrderDto(databaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void searchOrder() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter order ID :");
        int orderID = scanner.nextInt();
        databaseOperations.searchOrder(orderID);
    }

    public void viewAll() throws SQLException, ClassNotFoundException {
        databaseOperations.viewAll();
    }

    public void insertOrder() throws SQLException, ClassNotFoundException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter order ID :");
        int orderID = scanner.nextInt();
        System.out.println("Enter vehicle ID :");
        int vehicleID = scanner.nextInt();
        System.out.println("Enter price :");
        double price = scanner.nextDouble();
        System.out.println("Enter date :");
        String input= scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate=LocalDate.parse(input, formatter);
        databaseOperations.insertOrder(orderID, localDate,price,vehicleID);
    }

    public void deleteOrder() throws SQLException, ClassNotFoundException {
        System.out.print("Enter order ID that you want to deleteVehicle: ");
        int orderId = scanner.nextInt();
        databaseOperations.deleteOrder(orderId);
        System.out.println("the order deleted successfully");
    }

    public void updateOrder() throws SQLException, ClassNotFoundException {
        System.out.print("Enter order ID that you want to updateVehicle: ");
        int orderID = scanner.nextInt();
        System.out.println("Enter new price :");
        double price = scanner.nextDouble();
        System.out.println("Enter new vehicle ID :");
        int vehicleID = scanner.nextInt();
        String input= scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
        LocalDate localDate=LocalDate.parse(input, formatter);
        databaseOperations.insertOrder(orderID, localDate,price,vehicleID);

        databaseOperations.updateOrder(orderID,price,localDate,vehicleID);
    }


    }
