package lt.sdacademy.fundamentals.experiments;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String args[]) {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 5; i++) {
            set.add(count[i]);
        }
        System.out.println(set);

        TreeSet sorted2Set = new TreeSet<Integer>(set);
        System.out.println("The sorted list is:");
        System.out.println(sorted2Set);

        System.out.println("The First element of the set is: " + (Integer) sorted2Set.first());
        System.out.println("The last element of the set is: " + (Integer) sorted2Set.last());


    }
}
