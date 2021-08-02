package lt.sdacademy.fundamentals.manouzsiemimai;


import java.util.Random;

public class TypedLetters {

    public static void main(String[] args) {
        myMethod();
        Random lol = new Random();
        int x = lol.nextInt(20);
        System.out.println(x);
    }
    static void myMethod() {

        System.out.println("I just got executed!");

    }
}