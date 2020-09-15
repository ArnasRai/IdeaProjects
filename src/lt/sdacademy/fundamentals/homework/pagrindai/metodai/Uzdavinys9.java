package lt.sdacademy.fundamentals.homework.pagrindai.metodai;

import java.util.Scanner;

//Parašykite metodą, kuris priima du int tipo parametrus ir patikrina ar pirmas talpina savyje antrąjį.
// Šis metodas turi grąžinti boolean tipo reikšmę. Pavyzdžiui: int p1 = 123; int p2 = 2  //metodas turėtų grąžinti true;
public class Uzdavinys9 {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int enteredText = scanner.nextInt();

        if (String.valueOf(enteredText).contains("2"))
            System.out.println("true");
        else
            System.out.println("false");


    }
}
