package lt.sdacademy.fundamentals.arrays;

public class Example4 {

    public static void main(String[] args){
        int[][] matrix = new int[3][2];

        matrix[0][0] = 5;
        matrix[0][1] = 7;
        matrix[1][0] = 6;
        matrix[1][1] = 12;
        matrix[2][0] = 7;
        matrix[2][1] = 14;

        for (int n = 0; n < 3; n++){
            for (int m = 0; m < 2; m++){
                System.out.println(matrix[n][m]);
            }
        }
    }
}
