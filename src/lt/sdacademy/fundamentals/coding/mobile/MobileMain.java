package lt.sdacademy.fundamentals.coding.mobile;

import lt.sdacademy.fundamentals.coding.mobile.Mobile;

import java.util.ArrayList;
import java.util.List;

public class MobileMain {
    public static void main(String[] args) {
       Mobile mobile1 = new Mobile("3310", "Nokia", 150.0);
       Mobile mobile2 = new Mobile("x10", "Sony", 500.0);
       Mobile mobile3 = new Mobile("11", "iPhone", 1700.0);

       List<Mobile> mobiles = new ArrayList<>();
       mobiles.add(mobile1);
       mobiles.add(mobile2);
       mobiles.add(mobile3);

       Mobile mostExpensive = getMostExpensive(mobiles);
        System.out.println(mostExpensive);

      // System.out.println(mobile1);
       // System.out.println(mobile2);



    }


    public static Mobile getMostExpensive(List<Mobile> mobiles){
        Mobile mostExpensive = mobiles.get(0);
        for(Mobile m : mobiles){
            if (mostExpensive.getPrice() <m.getPrice()) {
                mostExpensive = m;
            }

        }
        return mostExpensive;
    }


}


// model, manuf, price
