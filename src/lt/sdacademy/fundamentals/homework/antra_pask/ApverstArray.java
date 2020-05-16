package lt.sdacademy.fundamentals.homework.antra_pask;

public class ApverstArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 10, 9};
        int arrLength = arr.length;

        int[] reverseArr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            reverseArr[i] = arr[arrLength - i - 1];
        }

        System.out.println("Original array");
        printArr(arr);

        System.out.println("Reversed array");
        printArr(reverseArr);
    }

    public static void printArr(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

