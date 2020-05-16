package lt.sdacademy.fundamentals.file_read.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExampleMain {
    public static void main(String[] args) {

        String dataPath = "C:\\Users\\Arnas\\IdeaProjects\\IntroProject\\src\\lt\\sdacademy\\fundamentals\\file_read\\bufferedreader\\Duomenys.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(dataPath))) {


       //this is the best method

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

             br.close();

        } catch (IOException e) {
            System.out.println("Ivyko Klaida");
            System.out.println(e.getMessage());

        }
        System.out.println("darbas baigtas");

    }
}
