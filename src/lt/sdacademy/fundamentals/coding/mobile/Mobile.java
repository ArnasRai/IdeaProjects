package lt.sdacademy.fundamentals.coding.mobile;

public class Mobile {

   private String model;
   private String manuf;
   private double price;

    public  Mobile(String model, String manuf, Double price){
        this.model = model;
        this.manuf = manuf;
        this.price = price;

    }

    public double getPrice(){
        return price;

    }

    public String toString() {
        return "mobile{" +
                " model: " + model +
                " manuf: " + manuf +
                " price: " + price +
                "}";



    }
}
