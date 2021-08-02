package lt.sdacademy.fundamentals.homework.trecia_pask;

import java.util.Scanner;

public class faktorialas {
    public static void main(String[] args) {
        double firstNumber = 1;

        boolean dirba = true;
        while (dirba) {


            Scanner skaneris = new Scanner(System.in);
            double inputNumber2 = skaneris.nextDouble();
            firstNumber = inputNumber2 * firstNumber;

            if (firstNumber == 0) {
                System.out.println("reikejo atstatyt");
                firstNumber = 1;
            }


            System.out.println(firstNumber + "Ats");


        }
    }
}