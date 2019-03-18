package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class ItemController {

    private ArrayList<Film> items = new ArrayList<>();

    public ObservableList<Film> getItems() {
        return FXCollections.observableArrayList(items);
    }
}
