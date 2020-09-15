package lt.sdacademy.fundamentals.oriented.bicycle;

public class Bicycle {

    int gear;
    int maxSpeed;


    public Bicycle(int gear, int maxSpeed) {
        this.gear = gear;
        this.maxSpeed = maxSpeed;

    }

    public String toString() {
        return "Bicycle{" +
                "gear = " + gear +
                " maxSpeed = " + maxSpeed +
                "}";

    }
}
