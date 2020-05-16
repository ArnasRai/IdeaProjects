package lt.sdacademy.fundamentals.input_output.basic_input;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Galiu Suskaiciuoti 2 skaicius");
        System.out.println("ivesti pirma skaiciu");
        int firstNumber = scanner.nextInt();


        System.out.println("ivesti antra skaiciu");
        int secondNumber = scanner.nextInt();

        System.out.println("skaiciu suma: " + (firstNumber + secondNumber));


    }
}
