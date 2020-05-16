package lt.sdacademy.fundamentals.coding.house;

public class House {

    private double houseArea;
    private String district;
    private int builtYear;
    private String condition;

    public House( double houseArea, String district, int builtYear, String condition){
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;

    }
    public int getBuiltYear(){
        return builtYear;

}

    public String toString() {
        return "House Specification{" +
                " House Area: " + houseArea +
                " District: " + district +
                " Years Built: " + builtYear +
                " House Condition: " + condition +
                "}";





    }


}
