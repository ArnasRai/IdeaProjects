package lt.sdacademy.fundamentals.coding.house;

import lt.sdacademy.fundamentals.coding.mobile.Mobile;

import java.util.Arrays;
import java.util.List;

public class HouseMain {
    public static void main(String[] args) {
        List<House> houses = buildHouses();

        printNewestHouse(houses);
    }

    public static void  printNewestHouse(List<House> houses){
        House newestHouse = houses.get(0);

        for(House h : houses){
            if (newestHouse.getBuiltYear() < h.getBuiltYear()) {
                newestHouse = h;
            }
        }

        for(House h : houses)
            if (h.getBuiltYear() == newestHouse.getBuiltYear())
                System.out.println(h);


//public static void printFittedHousse(List<House> houses) {
   // System.out.println("Fitted Houses");
    //    for (House h : houses){
       //     get
       //     }
     //   }
        //System.out.println(newestHouse);
    }

    public static List<House> buildHouses() {

        House house1 = new House(80, "Senamiestis",  2019  , "fitted" );
        House house2 = new House(130, "dainava",  1990  , "fitted" );
        House house3 = new House(55, "Silainiai",  1985  , "not fitted" );
        House house4 = new House(70, "Siaure",  2020  , "partially fitted" );

        return Arrays.asList(house1,house2,house3,house4);



    }



}
