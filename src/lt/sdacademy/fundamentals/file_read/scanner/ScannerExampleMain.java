package lt.sdacademy.fundamentals.file_read.scanner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExampleMain {
    public static void main(String[] args) {

        String dataPath = "C:\\Users\\Arnas\\IdeaProjects\\IntroProject\\src\\lt\\sdacademy\\fundamentals\\file_read\\scanner\\Duomenys.txt";

        try(Scanner fileScanner = new Scanner(new File(dataPath))){
             List<String> text = new ArrayList<>();

             while (fileScanner.hasNext()) {
                 text.add(fileScanner.nextLine());
             // System.out.println(fileScanner.nextLine());
}

            for(String line : text){
                System.out.println(line);
            }
        }


        catch(IOException e){
            System.out.println(e.getMessage());



        }


    }
}
