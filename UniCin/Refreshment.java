public class Refreshment {

    private String drink;
    private String snack;

    public Refreshment(String drink) {
        this.drink = drink;
    }

    public Refreshment(String snack, String drink){
        this.snack = snack;
        this.drink = drink;
    }
}
