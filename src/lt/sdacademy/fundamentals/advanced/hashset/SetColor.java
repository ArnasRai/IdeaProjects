package lt.sdacademy.fundamentals.advanced.hashset;

import java.util.Scanner;

public class SetColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String number;

        if (String.valueOf(text).contains("[a-zA-Z]+"))
            System.out.println("Contains letters");
         else if (!text.contains("^[0-9]*$"))
            System.out.println("Contains numbers");
        else
            System.out.println("default");
    }





}
