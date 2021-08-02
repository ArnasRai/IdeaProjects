package lt.sdacademy.fundamentals.horsingaround;

public class BookTest {
    public static void main(String[] arg)
    {
        int max = 0;
        int high = 0;
        {
            int[] marks = { 125, 132, 95, 116, 110 };

            /*for (int i = 0; i < marks.length ; i++) {
                if (marks[i] > max)
                    max = marks[i];



            }*/
            for (int number : marks) {
                if (number > max)
                    max = number;



            }

            System.out.println(max);

        }
    }


}
