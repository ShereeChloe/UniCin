package sample.Pages;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

/**
 * Created by u1257802 on 25/03/2019.
 */
public class BasketPage extends Stage {

    private Scene basketScene;
    private DropShadow ds;

    public BasketPage(){
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

        Text pageTitle = new Text("Welcome to your Basket");
        pageTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        pageTitle.setTextAlignment(TextAlignment.CENTER);
        pageTitle.setFill(Color.CORAL);
        pageTitle.setEffect(ds);
        pageTitle.setCache(true);

        ListView basketList = new ListView();
        basketList.setItems(FXCollections.observableArrayList(MainPage.getItems()));

        root.add(pageTitle,0,0,4,1);
        root.add(basketList,0,1,1,3);

        setScene(basketScene);
    }
}
