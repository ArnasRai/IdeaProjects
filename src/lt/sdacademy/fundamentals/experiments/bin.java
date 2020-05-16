package lt.sdacademy.fundamentals.experiments;

import java.util.Scanner;

public class bin {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
     //   String normal = scanner1.nextLine();
       // System.out.println(normal);


        String[] arr = {scanner1.nextLine()};
        int arrLength = arr.length;
        String[] revarray = new String[arr.length];
        int arrLength2 = revarray.length;

        for (int i = 0; i < arrLength; i++) {
            revarray[i] = arr[arrLength - i - 1];
            System.out.println(revarray[arr.length]);

        }


      //  String reverse = normal - reverse - 1;



    }
}