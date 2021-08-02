package lt.sdacademy.fundamentals.horsingaround;

import java.util.ArrayList;
import java.util.HashSet;

public class StringRev {
    public static void main(String[] args) {
        HashSet<Integer> hello = new HashSet<>();

        hello.add(1);
        hello.add(44);
        hello.add(55);
        hello.add(111);

        hello.add(666);

        if (hello.contains(5)) {
            System.out.println("true");
        } else
            System.out.println("false");
        System.out.println(hello);


        String[] strings = {"Audi", "BWM", "Honda"};
        int strLenght = strings.length;
        System.out.println(strLenght);
        for (int i = strLenght - 1; i >= 0; --i) {
            System.out.println(strings[i]);
        }
    }
}
