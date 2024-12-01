package VehicleSystem.dao;

import VehicleSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class VehicleDto {

    private final databaseOperations databaseOperations;

    @Autowired
    public VehicleDto(databaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void searchVehicle(int vehicleId) throws SQLException, ClassNotFoundException {
        databaseOperations.search(vehicleId);
    }
}
