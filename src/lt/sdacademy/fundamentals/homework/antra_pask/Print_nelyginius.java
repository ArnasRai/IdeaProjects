package lt.sdacademy.fundamentals.homework.antra_pask;

public class Print_nelyginius {
    public static void main(String[] args) {
        int[] lygArr = {3, 4, 6, 45, -7};
        for (int paimtasIsArray : lygArr)    //<---- ima skaicius is array po viena ir tikrina?
            if (paimtasIsArray % 2 != 0)
                System.out.println("Odd number: " + paimtasIsArray);


        }
    }