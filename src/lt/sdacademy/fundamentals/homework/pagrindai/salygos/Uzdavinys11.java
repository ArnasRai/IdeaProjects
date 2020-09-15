package lt.sdacademy.fundamentals.homework.pagrindai.salygos;

import java.util.Scanner;

public class Uzdavinys11 {
    public static void main(String[] args) {

//        Parašykite programą, kuri rodytų ar dvi įvestos reikšmės yra didesnės, lygios ar mažesnės už 30.
//        Priešingu atveju turėtų būti rodoma "<>".
//                Pavyzdžiui:
//        Įvestis: 22, 25 rezultatas: Mažesni
//        Įvestis: 30, 30 rezultatas: Lygūs
//        Įvestis: 32, 33 rezultatas: Didesni
//        Įvestis: 22, 32 rezultatas: <>
//        Įvestis: 32, 22 rezultatas: <>

        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double x2 = scan.nextDouble();

        if (x1 < 30 && x2 < 30) {
            System.out.println("mazesni");
        } else if (x1 == 30 && x2 == 30) {
            System.out.println("lygus");
        } else if (x1 > 30 && x2 > 30) {
            System.out.println("didesni");
        } else System.out.println("<>");

        //kitas uzdavinys tik su || pask sakinio nereik
        // false ar false = false, kiti true

    }


//        double x3=(x1+x2)/2;
//        System.out.println(x3);
//        if (x3 < 30)
//            System.out.println("Skaiciai mazesni");
//        if (x3 == 30)
//            System.out.println("Skaiciai lygus");
//        if (x3 > 30)
//            System.out.println("Skaiciai didesni");
}

