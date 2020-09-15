package lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store;

public class Product {
    private String name;
    private float price;
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return name + " - " + price + " EU";
    }
    public float getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}

