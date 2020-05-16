package lt.sdacademy.fundamentals.homework.antra_pask;

public class SudejusGauti4 {
    public static void main(String[] args) {
        int[] ieskomArray = {5,3,5,7,8,6,4};
        int arrIlgis = ieskomArray.length;

        for (int n = 0; n < arrIlgis; n++)
            for (int m = n + 1; m < arrIlgis; m++)
                if(ieskomArray[n] + ieskomArray[m] == 10)
                    System.out.println(ieskomArray[n]  + "ir" + ieskomArray[m]);




    }
}
