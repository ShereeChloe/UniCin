public class Refreshment extends Item{

    private String drink;
    private String snack;

    public Refreshment(String name, double price, String drink, String snack) {
        super(name, price);
        this.drink = drink;
        this.snack = snack;
    }

    public String getDrink() {
        return drink;
    }

    public String getSnack() {
        return snack;
    }


}
