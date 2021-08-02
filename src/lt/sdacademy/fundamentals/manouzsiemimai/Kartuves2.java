package lt.sdacademy.fundamentals.manouzsiemimai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Kartuves2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char endGame = 0;
        int totalLives = 5;
        boolean afk = false;

         String selectedWord = "zodis";
        HashSet<Character> enteredLettersArray = new HashSet<>();


        while (totalLives > 0) {
            char firstLetter = scanner.next().charAt(0);

           // String enteredLetter = Character.toString(firstLetter);
            System.out.println("Ivesta Raide: " + firstLetter);



            if (enteredLettersArray.contains(firstLetter)) {

                 System.out.println("raide jau vesta ");




            } else {
                System.out.println("raide nevesta, viskas ok" );
                enteredLettersArray.add(firstLetter);

            }




        }
    }
}


