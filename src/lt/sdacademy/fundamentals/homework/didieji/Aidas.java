package lt.sdacademy.fundamentals.homework.didieji;

import java.util.Scanner;

//Parašyki aplikaciją "Aidas", kuri
//        > atspausdintų atgal į konsolę vartotojo įvestą eilutę (angl. String)
//        > grįžtų į ciklo pradžią, jei vartotojas įveda žodį "toliau". (panaudoti 'continue;')
//        > baigtų darbą ir atspausdintų pranešimą "Iki!", jei vartotojas įveda žodį "stop". (panaudoti 'break;')

public class Aidas {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);


        for (;;) {
            String answer = textScanner.nextLine();

            if (answer.equalsIgnoreCase("TOLIAU")) {

                continue;


            }

             else if (answer.equalsIgnoreCase("STOP")) {
                System.out.println("IKI");
                break;

            }
            else
                System.out.println("Aidas Sako:" + answer);
        }







//        boolean skaiciuoti = true;
//
//
//        while(skaiciuoti) {
//            System.out.println("Aidas Sako:" + answer);
//            if (answer.equalsIgnoreCase("TOLIAU")) {
//                continue;
//            }
//            if (answer.equalsIgnoreCase("STOP")) {
//                System.out.println("iki");
//                break;
//            }



        }

    }



