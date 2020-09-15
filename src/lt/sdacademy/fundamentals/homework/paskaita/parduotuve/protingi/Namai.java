package lt.sdacademy.fundamentals.homework.paskaita.parduotuve.protingi;

public class Namai {
    public static void main(String[] args) {


        TelevizoriauNustatymai nustatymai = new TelevizoriauNustatymai(90,87,false);




        String zodelis = new String("labas");
        Ausines ausines = new Ausines("var1");     // ausines yra adresas new Ausines yra objektas.(var1)
        Ausines ausines2 = new Ausines("var2");
        Ausines ausines3 = new Ausines("var3");

        Televizorius PultelisSony = new Televizorius("Sony",1.75f,"miegamas");
        Televizorius PultelisDell = new Televizorius("Dell", 45,"virtuve");



        PultelisSony.rodyktv3();
        PultelisSony.isKurRodai();
        PultelisSony.setNustatymai(nustatymai);
        // sita ijungti poto<----------------              PultelisSony.rodykporn();


        //PultelisSony
       // PultelisDell.getModelis();

       // PultelisSony.lokacija = "koridorius";

        //PultelisSony.rodykTeksta(zodelis);


        String televizoriausZodziai = PultelisDell.getZodisSuModeliu("Labas");
        System.out.println(televizoriausZodziai);


        PultelisDell.rodyktv3();
        PultelisDell.isKurRodai();
        PultelisDell.setNustatymai(nustatymai);
    }
}







