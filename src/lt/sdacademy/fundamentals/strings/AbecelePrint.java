package lt.sdacademy.fundamentals.strings;

public class AbecelePrint {
    public static void main(String[] args) {
        String textWithoutStringPool = new String("tekstas"); //objektui yra isskirta atmintis heape, kuris nera perpanaudotas

        String textWithStringPool = "tekstas"; //obj yra isskirta atmintis string poole kuris yra perpanaudotas

        String alphabet = "";
        for (char letter = 'a'; letter <= 'z'; letter++){
            alphabet += letter;


        }
        System.out.println(alphabet);
    }

}
