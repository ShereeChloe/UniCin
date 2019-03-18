package sample;

import java.util.ArrayList;

/**
 * Created by u1257802 on 18/03/2019.
 */
public class RefreshmentData {

    private ArrayList<Refreshment> refreshments;

    public RefreshmentData(){
        refreshments = new ArrayList<>();

        refreshments.add(new Refreshment("Dr Pepper", 1.50, true, false));
        refreshments.add(new Refreshment("Fanta Fruit Twist", 1.50, true, false));
        refreshments.add(new Refreshment("Sprite", 1.50, true, false));
        refreshments.add(new Refreshment("Pepsi Max Cherry", 1.30, true, false));
        refreshments.add(new Refreshment("Sweet Popcorn", 2.00, false, true));
        refreshments.add(new Refreshment("Salted Popcorn", 2.00, false, true));
        refreshments.add(new Refreshment("Caramel Popcorn", 2.00, false, true));
        refreshments.add(new Refreshment("Nachos", 1.80, false, true));
        refreshments.add(new Refreshment("Magic Stars", 2.00, false, true));
        refreshments.add(new Refreshment("Bitsa Wispa", 2.00, false, true));
        refreshments.add(new Refreshment("M&M's", 2.00, false, true));

    }
    public ArrayList<Refreshment> getrefreshments() {
        return refreshments;
    }
}
