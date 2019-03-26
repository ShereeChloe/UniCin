package sample.Pages;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by u1257802 on 26/03/2019.
 */
public class CardPaymentPage extends Stage {

    private Scene cardPaymentScene;
    private DropShadow ds;

    public CardPaymentPage(){
        initialize();
    }

    @FXML
    public void initialize() {
        GridPane root = new GridPane();
        root.setPadding(new Insets(15, 15, 15, 15));
        root.setStyle("-fx-background-color: #B0E0E6");
        root.setHgap(20);
        root.setVgap(40);
        root.getColumnConstraints().add(new ColumnConstraints(250));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));

        cardPaymentScene = new Scene(root, 600, 400);

        TextField panNumber = new TextField("PAN");

         DatePicker startDate = new DatePicker();
         startDate.show();

         DatePicker endDate = new DatePicker();
         endDate.show();

        ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        root.add(panNumber,0,0,1,1);
        root.add(startDate,0,0,1,2);
        root.add(endDate,0,0,1,3);

        setScene(cardPaymentScene);
    }
}
