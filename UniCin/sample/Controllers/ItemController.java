package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Item;

import java.util.ArrayList;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class ItemController {

    private ArrayList<Item> items = new ArrayList<>();

    public ObservableList<Item> getItems() {
        return FXCollections.observableArrayList(items);
    }

//    public static void main(String[] args) {
//        System.out.println(this.getItems());
//    }
}
