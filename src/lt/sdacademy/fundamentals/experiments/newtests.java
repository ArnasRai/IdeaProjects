package lt.sdacademy.fundamentals.experiments;

import java.util.Scanner;

public class newtests {
    public static void main(String[] args) {


        Scanner textScanner = new Scanner(System.in);
        String answer = textScanner.nextLine();
        String chexh = "TOLIAU";





            switch(answer.toLowerCase())
            {
                case "toliau":
                    System.out.println("one");
                    break;
                case "two":
                    System.out.println("two");
                    break;
                case "three":
                    System.out.println("three");
                    break;
                default:
                    System.out.println("no match");
            }

    }

}
