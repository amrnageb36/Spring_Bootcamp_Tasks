package injectingProp;

public class Plane implements Vehicle{
    dataBaseOperation dataBaseOperation ;



    public void setDataBaseOperation(dataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

    @Override
    public void saveDataintoDataBase(Vehicle vehicle){
        System.out.println("Plane data is :");
        dataBaseOperation.save(vehicle);
    }
}
