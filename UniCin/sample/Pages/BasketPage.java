package sample.Pages;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import sample.Basket;
import sample.Film;

/**
 * Created by u1257802 on 25/03/2019.
 */
public class BasketPage extends Stage {

    private Scene basketScene;
    private DropShadow ds;
    private Film film;

    public BasketPage(){
        initialize();
    }

    public BasketPage (Film film){
        this.film = film;
        System.out.println(this.film.getTitle());
        initialize();
    }

    @FXML
    public void initialize() {
        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,15,15));
        root.setStyle("-fx-background-color: #B0E0E6");
        root.setHgap(20);
        root.setVgap(40);
        root.getColumnConstraints().add(new ColumnConstraints(250));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));

        basketScene = new Scene(root, 850, 500);

        ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        Text pageTitle = new Text("Welcome to Your Basket");
        pageTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        pageTitle.setTextAlignment(TextAlignment.CENTER);
        pageTitle.setFill(Color.CORAL);
        pageTitle.setEffect(ds);
        pageTitle.setCache(true);

        ListView basketList = new ListView();
        basketList.setPrefSize(200, 300);
        basketList.setItems(FXCollections.observableArrayList(MainPage.getItems()));

        Label basketListLbl = new Label("Order Summary");
        basketListLbl.setTextFill(Color.color(0.4f, 0.4f, 1.0f));
        basketListLbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));

        VBox basketVbox = new VBox();
        basketVbox.setAlignment(Pos.CENTER);
        basketVbox.getChildren().addAll(basketListLbl, basketList);

//        Image filmImage = new Image("sample/images/" + film.getFilmImageUrl());
//        ImageView filmImageView = new ImageView(filmImage);

        Button backBtn = new Button("Back to Film Options");
        backBtn.setEffect(ds);

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert backConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
                backConfirmation.setTitle("Saved Basket");
                backConfirmation.setHeaderText("Your current items will be saved");
                backConfirmation.showAndWait();

                close();

                FilmPage fp = new FilmPage();
                fp.show();
                System.out.println("hello");
            }
        });

        root.add(pageTitle,0,0,4,1);
        root.add(basketVbox,0,1,1,3);
        root.add(backBtn, 2,2,1,1);

        setScene(basketScene);
    }
}