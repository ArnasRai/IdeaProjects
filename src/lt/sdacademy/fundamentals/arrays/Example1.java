package lt.sdacademy.fundamentals.arrays;

public class Example1 {

    public static void main(String[] args){
        int number = 4;
        int[] array = new int[5];

        //ini
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;


        for (int index = 0; index < array.length; index++){
            System.out.println(array[index]);
        }
    }
}
