package lt.sdacademy.fundamentals.experiments;

public class Store {
    private String apples = "apples";
    private String banana = "banana";
    private double price = 0;

    public Store (String apples, String banana, double price){
                    this.apples = apples;
                    this.banana = banana;
                    this.price = price;
    }
    public String getProducts (){
        return apples + price ;



    }
    public String getPrice() {
        return banana + price ;

    }

}
