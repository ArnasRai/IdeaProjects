package lt.sdacademy.fundamentals.oriented.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args){

        Scanner modelScanner = new Scanner(System.in);
        System.out.println("Koks modelis?");
        String model = modelScanner.nextLine();

        Scanner engineScanner = new Scanner(System.in);
        System.out.println("Koks variklio turis?");
        double engine = engineScanner.nextDouble();

        Scanner doorsScanner = new Scanner(System.in);
        System.out.println("kiek dureliu?");
        int numberOfDoors = doorsScanner.nextInt();

        Scanner isDriveScanner = new Scanner(System.in);
        System.out.println("ar vaziuoja?");
        boolean isRunAndDrive = isRunAndDrive(isDriveScanner.nextLine());


        Car myCar = new Car(model, engine, numberOfDoors, isRunAndDrive);

        System.out.println(myCar.model + " " + myCar.isRunAndDrive);


    }

    public static boolean isRunAndDrive(String status){
        if (status.equalsIgnoreCase( "vaziuoja")){
            return true;
        }
         else{
             return false;
        }

         //return status.equals("vaziuoja") ? true : false;

         //return status.equals("Vaziuoja");

    }


}
