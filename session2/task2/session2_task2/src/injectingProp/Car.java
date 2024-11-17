package injectingProp;

public class Car implements Vehicle {
    dataBaseOperation dataBaseOperation;

    public Car(dataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

    @Override
    public void saveDataintoDataBase(Vehicle vehicle){
        System.out.println("Car data is :");
        dataBaseOperation.save(vehicle);
    }
}
