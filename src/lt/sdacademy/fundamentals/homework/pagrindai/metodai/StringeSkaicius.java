package lt.sdacademy.fundamentals.homework.pagrindai.metodai;

//Parašykite metodą, kuris priima du parametrus: String ir int tipo ir patikrina ar String kintamasis talpina savyje int tipo skaitmenį.
// Šis metodas turi grąžinti boolean tipo reikšmę. Pavyzdžiui: String p1 = "2 obuoliai"; int p2 = 2  //metodas turėtų grąžinti true;

import java.util.Scanner;

public class StringeSkaicius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();

        if (enteredText.contains("2" ))

            System.out.println("true");
        else
            System.out.println("false");
    }
}
