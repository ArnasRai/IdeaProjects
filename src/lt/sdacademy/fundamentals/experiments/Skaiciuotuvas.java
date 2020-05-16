package lt.sdacademy.fundamentals.experiments;

import java.util.Scanner;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        boolean skaiciuoti = true;
        while (skaiciuoti) {
            double result = 0;


            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Iveskite pirma skaicu");
            double firstNumb = scanner1.nextDouble();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("iveskite antra skaiciu");
            double secondNumb = scanner2.nextDouble();

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("iveskite: + - / *");
            String action = scanner3.nextLine();

            if (action.equals("+")) {
                result = firstNumb + secondNumb;
            } else if (action.equals("-"))
                result = firstNumb - secondNumb;
            {
                if (action.equals("/")) {
                    result = firstNumb / secondNumb;
                } else if (action.equals("*")) {
                    result = firstNumb * secondNumb;
                }


            }


            System.out.println("jusu atsakymas: " + result);


            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Ar norite testi?");
            String pasirinkinmas = scanner4.nextLine();

            {if (pasirinkinmas.equalsIgnoreCase("TAIP"))
                skaiciuoti = true;
            else if (skaiciuoti = false)
                System.out.println("Programa sustojo");
            }



        }
    }
}
