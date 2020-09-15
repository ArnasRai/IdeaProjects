package lt.sdacademy.fundamentals.experiments;

public class test {public static void main(String[] args) {
    int[] arr = {2, 7, 1, 3, 10, 2, 9};
    int arrLength = arr.length;

    for (int n = 0; n < arrLength; n++)
        for (int m = n + 1; m < arrLength; m++)


            if (arr[n] + arr[m] == 4)
                System.out.println(arr[n] + "-" + arr[m]);




}
}


