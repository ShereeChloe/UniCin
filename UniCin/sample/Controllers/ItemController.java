package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Item;
import sample.Refreshment;

import java.util.ArrayList;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class ItemController {
    private ArrayList<Item> refreshments = new ArrayList<>();

    public ItemController() {
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

    public ObservableList<Item> getItems() {
        return FXCollections.observableArrayList(refreshments);
    }
}
