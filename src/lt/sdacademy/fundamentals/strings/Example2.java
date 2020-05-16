package lt.sdacademy.fundamentals.strings;

public class Example2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for( char letter = 'a'; letter <= 'z'; letter++){
            sb.append(letter);
        }

        System.out.println(sb.toString());

        String s1 = new String("tom");  //heape
        String s2 = new String("tom");

        String s3 = "tom";   //stringpoole
        String s4 = "tom";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


        StringBuilder a = new StringBuilder("tom");
        StringBuilder b = new StringBuilder(a);
        b.append("@jerry");
        System.out.println(a);
        System.out.println(b);


    }

}
