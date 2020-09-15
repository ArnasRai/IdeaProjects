package lt.sdacademy.fundamentals.experiments;

public class dumpingground {
    public static void main(String[] args) {
        String star = "";
        String tree = "";
        String slash = "/";
        String toy = "~";
        String toy1 = "~";
        String backslash = "\\";
//        System.out.println("Pasirinkit egles dydi3-10");
//        Scanner intScanner = new Scanner(System.in);
//        int tarpas  = intScanner.nextInt();
//        int kunas = tarpas - 2;


        String middle = "  ";
        String thevoid = " ";
        String apacia = "_";
        String[] test = {"*", " "};
        int tarpas = 6;     //kaip toli nuo kaires prades
        int kunas = 4;    //kokia "stora" egle bus


        //for (int i =10; i >= 0; i=i-1)


        // \ Backslash
        // /Slash

        //String repeated = new String(new char[tarpas]).replace("\0", thevoid);
        for (int i = kunas; i >= 0; i = i - 1) {
            String distance = new String(new char[tarpas]).replace("\0", thevoid);
            String kunas1 = new String(new char[kunas]).replace("\0", apacia);
            tarpas = tarpas - 1;
            kunas = kunas + 2;
            System.out.println(distance + slash + kunas1 + backslash + distance);

        }
    }
}