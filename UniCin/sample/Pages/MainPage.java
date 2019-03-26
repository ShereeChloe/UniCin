package sample.Pages;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.Customer;
import sample.Film;
import sample.Item;
import sample.Theatre;

import java.util.ArrayList;

/**
 * Created by u1257802 on 15/03/2019.
 */
public class MainPage extends Application {

    private Stage currentStage;
    private static Film film;
    private static ArrayList<Item> items;
    private static int numberOfTickets;
    private static Theatre theatre;
    private double totalPrice;

    public static Film getFilm() {
        return film;
    }

    public static Theatre getTheatre(){return theatre; }

    public static ArrayList<Item> getItems() {
        return items;
    }

     private void addItem (Item item) {
         this.items.add(item);
    }

    public static void setItems(ArrayList<Item> items) {
        MainPage.items = items;
    }

    public static void setFilm(Film film) {
        MainPage.film = film;
    }

    public static int getNumberOfTickets() {
        return numberOfTickets;
    }

    private int getTotalPrice(){
        int total = 0;
        for (Item item : MainPage.getItems()){
            total += MainPage.getNumberOfTickets();
        }
        return total;
    }

    public static void setNumberOfTickets(int totalPrice) {
        MainPage.numberOfTickets = totalPrice;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginPage loginPage = new LoginPage(this);
        loginPage.setScene(loginPage.getScene());

        currentStage = loginPage;
        currentStage.show();
    }
}
