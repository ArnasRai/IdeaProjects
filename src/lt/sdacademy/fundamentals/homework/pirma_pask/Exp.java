package lt.sdacademy.fundamentals.homework.pirma_pask;

public class Exp {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 3;
        //kuris didesnis
        if (a > b && a > c) {
            System.out.println("a didziausias");
            System.out.println("a reiksme: " + a);
        }
        else
            System.out.println("a nedidziausias");
        // ar lyginis ar ne
        {
            if (a % 2 == 0)
                System.out.println("a lyginis");
            else
                System.out.println("a nelyginis");
        }
        //keliami ar ne
        {
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)

                System.out.println("keliami");
            else
                System.out.println("nekeliami");


        }
        //fizzbuzz
        {
            if (a % 3 == 0 && a % 5 == 0 )
                System.out.println("fizzbuzz");
            else if ( a % 3 == 0)
                System.out.println("fizz");
            else if (a % 5 == 0)
                System.out.println("buzz");


                

        }


    }
}

