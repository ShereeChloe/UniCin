package sample;

/**
 * Created by u1257802 on 11/03/2019.
 */
public class Basket {
    private double total;
    private Item item;

    public Basket(double total, Item item) {
        this.total = total;
        this.item = item;
    }

    public double getTotal() {
        return total;
    }

    public Item getItem() {
        return item;
    }
}
