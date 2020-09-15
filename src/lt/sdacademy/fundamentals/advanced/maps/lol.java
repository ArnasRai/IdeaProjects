package lt.sdacademy.fundamentals.advanced.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lol {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        for (Map.Entry<String, String> dictionary : countries.entrySet()) {
            String country = dictionary.getKey();
            String capital = dictionary.getValue();
            System.out.printf("%s : %s\n", country, capital);
        }
    }
}
