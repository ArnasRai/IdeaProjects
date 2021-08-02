package lt.sdacademy.fundamentals.manouzsiemimai;

public class Food {

    private String mainDish;
    private String sideDish;
    private String garnish;

    public Food(String mainDish, String sideDish, String garnish) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.garnish = garnish;
    }

   /* public String getFood() {
        return mainDish();
    }

    private String mainDish() {
        public String toString()
        return mainDish.toString(){
            "dfsds " + mainDish;
        }

    }*/

    public void foodMessage() {
        System.out.println("Jus uzsisaket: ");
    }

    public void foodPrice() {
        System.out.println("kaina: 5.99$");
    }
}
