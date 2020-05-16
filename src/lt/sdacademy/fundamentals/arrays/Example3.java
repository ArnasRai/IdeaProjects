package lt.sdacademy.fundamentals.arrays;

public class Example3 {

    public static void main(String[] args){

        /*int[] arrayOfInts ={10, 15, 20, 25, 30};

        //arrayOfInts[1] = 555;
        //standard for loop
        for (int i = 0; i < arrayOfInts.length; i++){
            System.out.println(arrayOfInts[i]);
        }
        //adv for loop
        for (int i : arrayOfInts){
            System.out.print(i + " ");
        }*/

        valuesSum();



    }
    public static void valuesSum(){
        double[] arr = {40, 2.5, -15, -240};
        double result = 0;

        for (int i =0; i < arr.length; i++){
            result = result + arr[i];
            //arba result += arr[i];

        }

        /*for (double number : arr){
            result += number;
        }*/
        System.out.println("Result: " + result);
    }


}
