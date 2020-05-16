package lt.sdacademy.fundamentals.homework.antra_pask;

public class ApverstString {
    public static void main(String[] args) {
        String[] stringas = {"kate", "ejo", "per", "kelia"};
        int stringoIlgis = stringas.length;


        for (int i = 0; i < stringoIlgis; i++) {
            System.out.println(stringas[i]);
        }
        while (0 < stringoIlgis) {
            stringoIlgis--;
            System.out.println(stringas[stringoIlgis]);
        }
    }
}