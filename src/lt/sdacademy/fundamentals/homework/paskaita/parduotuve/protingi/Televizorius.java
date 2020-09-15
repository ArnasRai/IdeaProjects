package lt.sdacademy.fundamentals.homework.paskaita.parduotuve.protingi;

import java.util.Scanner;

public class Televizorius {

    private String modelis;    //visi turi but private
    private float istrizaine;
    private String lokacija;
    private TelevizoriauNustatymai nustatymai;



    public Televizorius(String modelis, float istrizaine, String lokacija) {
        this.modelis = modelis;
        this.istrizaine = istrizaine;
        this.lokacija = lokacija;
    }

    public void setNustatymai(TelevizoriauNustatymai nustatymai){
        this.nustatymai = nustatymai;
    }


    public String getZodisSuModeliu (String zodis){
        String value = zodis + " " + modelis;
        return value;
//        return zodis + " " + modelis;   <------------------ taip geriau, bet abu vienodi

    }
//    public void rodykTeksta (String tekstas){
//        System.out.println(tekstas);
//    }


    public void rodyktv3() {
        System.out.println("TV3");


    }

    public void isKurRodai() {
        System.out.println("is miegamo");
    }
    public String getModelis(){
        return modelis;
    }
    public void rodukporn(){
        System.out.println("ar jum 18 metu? koks slaptazodis");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        if (value.equalsIgnoreCase("taip")){
        nustatymai.setNerodytporn(true);
        }
    }
}