package lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store;

public class Cart {
    private float sum;
    public Cart() {
        this.sum = 0;
    }
    public void addProduct(Product product) {
        sum = sum + product.getPrice();
    }
    public float getTotalSum() {
        return sum;
    }
}
