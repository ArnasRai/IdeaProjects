package lt.sdacademy.fundamentals.oriented.car;

public class Car {

    String model;
    double engine;
    int numberOfDoors;
    boolean isRunAndDrive;


    public Car(String model,
               double engine,
               int numberOfDoors,
               Boolean isRunAndDrive) {
        this.model = model;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.isRunAndDrive = isRunAndDrive;

    }
}
