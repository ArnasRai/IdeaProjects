package lt.sdacademy.fundamentals.homework.pagrindai.metodai;
//Parašykite metodą, kuris priima du String tipo parametrus ir patikrina ar antrasis savyje talpina pirmajį.
// Šis metodas turi grąžinti boolean tipo reikšmę. Pavyzdžiui: String p1 = "Grąžink tiesa"; String p2 = "tiesa"
// metodas turėtų grąžinti true;
public class StringeZodis {
    public static void main(String[] args) {
        String test = "Grąžink tiesa";



        boolean wordFound = false;
        {
            if (test.contains("tiesa"))

            {
                wordFound = true;
            System.out.println(wordFound);
            }
            else
            {
                wordFound = false;
            System.out.println(wordFound);
            }

//public static boolean arTalpinaSavyje(String p1, String p2 ){
//                return p1.contains(p2);
//        }

//            String p1 = "Grąžink tiesa";
//            String p2 = " tiesa";
//            if(p1.equals(p2))







        }





    }
}
