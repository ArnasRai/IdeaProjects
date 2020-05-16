package lt.sdacademy.fundamentals.oriented.room;

import java.util.Scanner;

public class RoomMain {

    public static void main(String[] args) {
        Scanner roomScanner = new Scanner(System.in);
        int ilgis = roomScanner.nextInt();

        System.out.println("kambario plotis");
        int plotis = roomScanner.nextInt();

        Room myRoom = new Room(ilgis, plotis);

        int result = squareOfRoom(myRoom);


        System.out.println("kamb plotis: " + result);
    }


    public static int squareOfRoom(Room myRoom) {
        return myRoom.getWight() * myRoom.getLength();


    }

}














