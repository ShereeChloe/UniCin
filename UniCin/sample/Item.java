package sample;

import java.util.ArrayList;

public abstract class Item {

    private String name;
    private double price;
    private ArrayList<String> items;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.items = new ArrayList<>();
    }

    public Item(){}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    private void addItem (String item) {
        this.items.add(item);
    }

    public ArrayList<String> getItems () {
        return items;
    }

    abstract void display ();


}
