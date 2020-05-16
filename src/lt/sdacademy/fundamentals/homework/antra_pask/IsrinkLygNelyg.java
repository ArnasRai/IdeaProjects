package lt.sdacademy.fundamentals.homework.antra_pask;

public class IsrinkLygNelyg {
    public static void main(String[] args) {
        int[] lygArr = {76, 55, 6, 44, -65, 6, 8 };
        int lyginiaiSkaiciai = 0;
        int neLyginiaiSkaiciai = 0;
        int arrayIlgis = lygArr.length;

        for(int n = 0; n < arrayIlgis; n++)
            if(n%2==0)
                lyginiaiSkaiciai=lyginiaiSkaiciai+1;

                else
                    if(n%2!=0)
                        neLyginiaiSkaiciai=neLyginiaiSkaiciai+1;


System.out.println("lyginius skaiciu yra: " + lyginiaiSkaiciai);
System.out.println("nelyginius skaiciu yra: " + neLyginiaiSkaiciai);



    }

}

