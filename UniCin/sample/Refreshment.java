package sample;

import javafx.scene.control.Alert;

public class Refreshment extends Item{

    private boolean drink;
    private boolean snack;
    private Utility u = new Utility();

    public Refreshment(String name, double price, boolean drink, boolean snack) {
        super(name, price);
        this.drink = drink;
        this.snack = snack;
    }

    public boolean isDrink() {
        return drink;
    }

    public boolean isSnack() {
        return snack;
    }

    public void display(){
        Alert confirmAddedToBasket = new Alert(Alert.AlertType.INFORMATION);
        confirmAddedToBasket.setHeaderText("You have added:" + getName());
        confirmAddedToBasket.showAndWait();
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", price: " + u.formatCurrency(super.getPrice());
    }
}
