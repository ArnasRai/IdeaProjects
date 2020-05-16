package lt.sdacademy.fundamentals.file_read.filesread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReadExampleMain {
    public static void main(String[] args) {

        String dataPath = "C:\\Users\\Arnas\\IdeaProjects\\IntroProject\\src\\lt\\sdacademy\\fundamentals\\file_read\\filesread\\Duomenys.txt";


        try{
            List<String> text = Files.readAllLines(Paths.get(dataPath));
            for(String line : text)
             System.out.println(line);
        }

        catch (IOException e) {

            System.out.println("Ivyko Klaida");

        }
    }

}
