package lt.sdacademy.fundamentals.manouzsiemimai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Kartuves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char endGame = 0;
        int totalLives = 5;
        boolean afk = false;
        String selectedWord = "zodis";
        ArrayList<Character> typedLettersArray = new ArrayList<>();
        ArrayList<Character> repeatingLettersArray = new ArrayList<>();
        HashSet<Character> cars = new HashSet<Character>();

        while (totalLives > 0) {
            char firstLetter = scanner.next().charAt(0);
            String enteredLetter = Character.toString(firstLetter);
            System.out.println("Ivesta Raide: " + firstLetter);


            if (!repeatingLettersArray.contains(firstLetter)) {
                repeatingLettersArray.add(firstLetter);
               // System.out.println("raide prideta i pasikartojancius, NEBUVO VESTA " + repeatingLettersArray);


            } else {
                System.out.println("raide jau masyve, JAU VESTA" + repeatingLettersArray);
                afk = true;
            }


            if (afk == true && repeatingLettersArray.contains(firstLetter))
            {
                System.out.println(repeatingLettersArray + "" + totalLives);
                System.out.println("as cia!!!!!!!!");
                afk = false;
            }


        }
    }
}