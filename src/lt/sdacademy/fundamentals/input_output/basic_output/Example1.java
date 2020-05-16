package lt.sdacademy.fundamentals.input_output.basic_output;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("spausdina ir nukelia zymekli");
        System.out.println("spausdina, bet zymeklis lieka");

        String sentence = "!!paprastas tekstas!!";
        System.out.printf("printf leidzia spausdinti pranesima %S\n", sentence); //s reiskia teksta
        //%s (jei s bus didzioji tekstas bus didelis)

        int number = 10;
        System.out.printf("..arba skaiciu: %d \n", number);  //    \n sukuria tarpa tekste(eilute) (d reiskia decimal)

        double floatNumber = 12.0922;
        System.out.printf("arba apvalint %.2f \n", floatNumber); // 2 reiskia, apvalint 2 skaicius po kablelio. kitoj % parasius pusej apvalins sveikus

        String otherSentence = "dinamiskai";
        System.out.printf("..arba viska kartu: %d %.2f, %s \n", number, floatNumber, otherSentence);
    }
}
