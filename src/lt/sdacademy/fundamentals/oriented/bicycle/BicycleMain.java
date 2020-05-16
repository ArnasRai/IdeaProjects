package lt.sdacademy.fundamentals.oriented.bicycle;

public class BicycleMain {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(12, 25);
        Bicycle expBicycle = new Bicycle(21, 40);

        System.out.println(bicycle.toString());
        System.out.println(expBicycle.toString());


    }
}
