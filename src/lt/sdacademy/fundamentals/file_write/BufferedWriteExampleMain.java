package lt.sdacademy.fundamentals.file_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExampleMain {
    public static void main(String[] args) {

        String resultPath = "C:\\Users\\Arnas\\IdeaProjects\\IntroProject\\src\\lt\\sdacademy\\fundamentals\\file_write\\Rezultatai.txt";

        String text = "kas atkeliauja i text faila";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(resultPath))){
            bw.write(text);
            



        }
        catch (IOException e){


            System.out.println(e.getMessage());

        }
    }
}
