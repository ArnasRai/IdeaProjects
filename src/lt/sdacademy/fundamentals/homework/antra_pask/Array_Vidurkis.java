package lt.sdacademy.fundamentals.homework.antra_pask;

import java.util.stream.IntStream;

public class Array_Vidurkis {
    public static void main(String[] args) {
        int[] vidurArr = {76, 55, 6, 44, -65 };
        int arrayIlgis = vidurArr.length;

        int allNumbers = IntStream.of(vidurArr).sum();
        System.out.println("is viso " + allNumbers);

        allNumbers = allNumbers / arrayIlgis;
        System.out.println("vidurkis " + allNumbers);





        }






}
