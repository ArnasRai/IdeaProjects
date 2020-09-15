package lt.sdacademy.fundamentals.homework.didieji;

public class EgleNauja {
    public static void main(String[] args) {
        int sizeTree = 10;
        int sizeTrunk = sizeTree / 3;


        for (int row = 0; row < sizeTree; row++) {
            for (int distance = 0; distance < sizeTree - row; distance++)
                System.out.print(" ");
            for (int column = 0; column < (2 * row + 1); column++)
                if (column % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print("8");

            System.out.println();

        }

        for (int row = 0; row < sizeTrunk; row++) {
            for (int distance = sizeTrunk; distance < sizeTree; distance++)
                System.out.print(" ");
            for (int column = 0; column < (2 * sizeTrunk + 1); column++)
                System.out.print("|");

            System.out.println();

        }

    }
}

//            for (int distance = 0; distance < (sizeTree*0.7); distance++)
//                System.out.print("1");
//        for (int distance = sizeTree; 0 > (distance/1.3); distance--)
//            System.out.print("2");
//        System.out.println();


