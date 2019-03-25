package sample.Screens;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.Film;
import sample.Item;

import java.util.ArrayList;

/**
 * Created by u1257802 on 15/03/2019.
 */
public class MainPage extends Application {

    private Stage currentStage;
    private static Film film;
    private static ArrayList<Item> items;

    public static Film getFilm() {
        return film;
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

     private void addItem (Item item) {
         this.items.add(item);
    }



    public static void setFilm(Film film) {
        MainPage.film = film;
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
