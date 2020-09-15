package lt.sdacademy.fundamentals.homework.pagrindai;

import java.util.Scanner;

public class Uzdavinys4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        double firstDouble = firstNumber;
        double secondDouble = secondNumber;
       double finalnumber = firstDouble/secondDouble;
        System.out.printf("%.3f", finalnumber);
//        double finalnumber = (double)firstNumber/(double)secondNumber;         <------taip paprasciau.
//        System.out.printf("%.3f", finalnumber);


    }
}
