package lt.sdacademy.fundamentals.experiments;

import org.w3c.dom.ls.LSOutput;

public class CompDemo {
    public static void main(String[] args) {

        String[] stringArrayName = {"cat", "dog", "mouse"};

        for (int index = 0; index < stringArrayName.length; index++) {
            System.out.println(stringArrayName[index]);
            System.out.println(stringArrayName.length);

        }


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(4);
        stringBuilder.append("mouse");
        stringBuilder.replace(0,0,"dog");
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }


}
