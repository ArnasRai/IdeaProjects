package lt.sdacademy.fundamentals.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example5 {

    public static void main(String[] args) {
        List<String> strings2 = Arrays.asList("text1", "text2", "text3");


        List<String> strings = new ArrayList<>();

        strings.add("tekstas 1");
        strings.add("tekstas 2");

        try {

            strings.remove(0);
            strings.get(1);
            System.out.println("wtf");
            strings.get(0);

        } catch (IndexOutOfBoundsException exception){

            System.out.println("Klaida: " + exception.getMessage());
        }

       // strings.remove(0);
      //  strings.get(1);
      //  strings.get(0);

        for (String text: strings){
            System.out.printf(text);

        }
    }
}
