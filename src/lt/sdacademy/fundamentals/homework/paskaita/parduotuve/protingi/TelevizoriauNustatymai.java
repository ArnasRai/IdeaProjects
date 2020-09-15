package lt.sdacademy.fundamentals.homework.paskaita.parduotuve.protingi;

public class TelevizoriauNustatymai {

    int ryskumas;   //daryt private
    int garsas;
    boolean nerodytporn;


    public TelevizoriauNustatymai(int ryskumas, int garsas, boolean nerodytporn) {
        this.ryskumas = ryskumas;
        this.garsas = garsas;
        this.nerodytporn = nerodytporn;
    }

    public int getRyskumas() {
        return ryskumas;
    }

    public void setRyskumas(int ryskumas) {
        this.ryskumas = ryskumas;
    }

    public int getGarsas() {
        return garsas;
    }

    public void setGarsas(int garsas) {
        this.garsas = garsas;
    }

    public boolean isNerodytporn() {
        return nerodytporn;
    }

    public void setNerodytporn(boolean nerodytporn) {
        this.nerodytporn = nerodytporn;
    }
}
//generate-