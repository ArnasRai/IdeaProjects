package lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store;


import lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store.Product;
import lt.sdacademy.fundamentals.homework.paskaita.parduotuve.store.Store;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Product productMilk = new Product("Pienas", 1.99f);
        Store store = new Store(3);
        store.addProduct(productMilk);
        store.addProduct(new Product("Vanduo", 0.99f));
        store.addProduct(new Product("Makaronai", 1.69f));
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkite produkta");
        while (true) {
            System.out.println("Iveskite 0 jei norite iseiti");
            store.listProduct();
            int value = sc.nextInt();
            if (value == 0) {
                break;
            }
            else
            store.addToCart(value);
        }
        store.pay();
    }
}

