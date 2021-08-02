package lt.sdacademy.fundamentals.manouzsiemimai;

public class HamburgerJoint {
    public static void main(String[] args) {
        Food firstPlate = new Food("Banana", "d", "d");
        firstPlate.foodMessage();
       // System.out.println(firstPlate.get());  // <-- tostring yra getfood
        firstPlate.foodPrice();

    }
}
