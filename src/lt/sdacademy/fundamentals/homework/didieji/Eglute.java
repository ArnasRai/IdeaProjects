package lt.sdacademy.fundamentals.homework.didieji;

import java.util.Scanner;

public class Eglute {
    public static void main(String[] args) {


        System.out.println("Pasirinkite egles dydi");
        Scanner intScanner = new Scanner(System.in);
        int tarpas  = intScanner.nextInt();

        String slash = "/";
        String backslash = "\\";
        String thevoid = " ";
        String apacia = "_";
        int kunas = 1;

        for (int i =tarpas; i >= 1; i=i-1) {
            String distance = new String(new char[tarpas]).replace("\0", thevoid);
            String kunoPlotis = new String(new char[kunas]).replace("\0", apacia);
            tarpas = tarpas - 1;
            kunas = kunas + 2;
            System.out.println(distance + slash + kunoPlotis + backslash + distance);
        }

    }

}
