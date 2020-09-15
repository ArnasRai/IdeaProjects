package lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store;

import lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store.Cart;
import lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store.Product;

public class Store {
    private Product[] products;
    private Cart cart;
    private int productCount;
    private int counter = 0;
    public Store(int productCount) {
        this.products = new Product[productCount];
        this.cart = new Cart();
        this.productCount = productCount;
    }
    public void addProduct(Product product) {
        if (counter < productCount) {
            products[counter] = product;
            counter++;
        } else {
            System.out.println("Nebetelpa");
        }
    }
    public void listProduct() {
        for (int i = 0; i < counter; i++) {
            System.out.println(i + 1 + ") " + products[i].toString());
        }
    }
    public void addToCart(int index) {
        if(index <= counter) {
            cart.addProduct(products[index - 1]);
        }
    }
    public void pay() {
        System.out.println("Reikiama suma: " + cart.getTotalSum());
    }
}
