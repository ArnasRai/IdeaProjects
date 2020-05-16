package lt.sdacademy.fundamentals.arrays;

public class Example2 {
    public static void main(String[] args){
        String[] arrayOfStrings = new String[2];

        arrayOfStrings[0] = "Tree";
        arrayOfStrings[1] = "Forest";

        for (int i = 0; i < arrayOfStrings.length; i++){
            System.out.println(arrayOfStrings[i]);
        }

    }
}
