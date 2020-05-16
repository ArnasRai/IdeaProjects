package lt.sdacademy.fundamentals.arrays;

import java.math.BigDecimal;
public class FirstClass {
    public static void addTwoNumbers(int a, int b){
        int result;

        if (a > b) {
            result = a - b;
        }else {
                result = b - a;
            }
        System.out.println(result);

    }
    public static void main(String[] args) {
        System.out.println("ifElseStatementsExample called");
        ifElseStatementsExample();

        System.out.println("switchStatementExample called");
        switchStatementExample();

        System.out.println("loopsExample called");
        loopsExample();

        System.out.println("addTwoNumbers called");
        addTwoNumbers( 4,  6);




    }


    public static void ifElseStatementsExample(){
        int a = 8;
        int b = 2;
        int c = -5;
        if (a > b) {
            System.out.println("A daugiau uz B");
        } else if (c > b) {
            System.out.println("C daugiau uz B");
        } else {
            System.out.println("NAN");
        }
        if (a > b) {
            System.out.println("A daugiau uz B");
        } else {
            System.out.println("NAN");
        }
        if (a > b) {
            System.out.println("A daugiau uz B");
        } else if (c > b) {
            System.out.println("C daugiau uz B");
        }

    }



    public static void switchStatementExample() {
        int grade = 5;
        switch (grade) {
            case 10:
                System.out.println("Reiksme lygi DESIMT");
            case 5:
                System.out.println("Reiksme lygi PENKIEMS");
            case 7:
                System.out.println("Reiksme lygi SEPTIINIEMS");
            default:
                System.out.println("Skaicius nerastas! :/ ");
        }
    }
    public static void loopsExample() {
        // While loop
        int a = 0;
        while (a < 10) {
            System.out.println("Hello World!" + a);
            a++;
            a = a + 1;
        }
        // Do while loop
        int b = 1;
        do {
            System.out.println("Hello World!" + b);
        } while (b > 100);
        // For loop
        for (int index = 0; index < 10; index++) {
            System.out.println("Index = " + index);
        }
    }
}