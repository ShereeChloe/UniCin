package sample.Pages;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
import javafx.stage.Window;
import sample.Controllers.ItemController;
import sample.Item;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by u1257802 on 25/03/2019.
 */
public class RefreshmentsPage extends Stage {

    private Scene refreshmentScene;
    private DropShadow ds;
    private Item item;
    private ItemController ic = new ItemController();
    private ObservableList<Item> obListItems;
    private ArrayList<Item> tempObList = new ArrayList<>();

    public RefreshmentsPage (Item item){
        this.item = item;
        initialize();
    }

    @FXML
    public void initialize() {
        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,15,15));
        root.setStyle("-fx-background-color: #B0E0E6");
        root.setHgap(20);
        root.setVgap(40);
        root.getColumnConstraints().add(new ColumnConstraints(300));
        root.getColumnConstraints().add(new ColumnConstraints(150));
        root.getColumnConstraints().add(new ColumnConstraints(300));
        root.getColumnConstraints().add(new ColumnConstraints(100));

        refreshmentScene = new Scene(root, 850, 500);

        ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        Text pageTitle = new Text("Welcome to the Refreshments Page");
        pageTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        pageTitle.setTextAlignment(TextAlignment.CENTER);
        pageTitle.setFill(Color.CORAL);
        pageTitle.setEffect(ds);
        pageTitle.setCache(true);

        Label refreshmentListLbl = new Label("Available Refreshments");
        refreshmentListLbl.setTextFill(Color.color(0.4f, 0.4f, 1.0f));
        refreshmentListLbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));

        ListView refreshmentList = new ListView(ic.getItems());
        obListItems = ic.getItems();
        refreshmentList.setItems(obListItems);
        System.out.println(obListItems + " refreeshments");
        refreshmentList.setOrientation(Orientation.VERTICAL);
        refreshmentList.setPrefSize(300, 250);

        Button addBtn = new Button("Add Item");
        addBtn.setEffect(ds);

        Label tempListLbl = new Label("Your Refreshments");
        tempListLbl.setTextFill(Color.color(0.4f, 0.4f, 1.0f));
        tempListLbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));

        ListView tempList = new ListView();

        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Item item = (Item) refreshmentList.getSelectionModel().getSelectedItem();
                if(item != null){
                    tempObList.add(item);

                    tempList.setItems(FXCollections.observableArrayList(tempObList));
                }else{
                    System.out.println("Please select item");
                    Alert pleaseSelect = new Alert(Alert.AlertType.ERROR);
                    pleaseSelect.setTitle("No selection");
                    pleaseSelect.setHeaderText("Please select an item to add to the basket");
                    pleaseSelect.showAndWait();
                }
            }
        });

        Button removeBtn = new Button("Remove Item");
        removeBtn.setEffect(ds);

        removeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Item item = (Item) tempList.getSelectionModel().getSelectedItem();
                if(item != null){
                    tempObList.remove(item);

                    tempList.setItems(FXCollections.observableArrayList(tempObList));
                }else{
                    System.out.println("Please select item");
                    Alert pleaseSelect = new Alert(Alert.AlertType.ERROR);
                    pleaseSelect.setTitle("No selection");
                    pleaseSelect.setHeaderText("Please select an item to remove the basket");
                    pleaseSelect.showAndWait();
                }
            }
        });

        Button addToBasket = new Button("Add To Basket");
        addToBasket.setEffect(ds);

        addToBasket.setOnAction(new EventHandler<ActionEvent>()  {
            @Override
            public void handle(ActionEvent event) {

               MainPage.setItems(tempObList);
                close();
                BasketPage bp = new BasketPage();
                bp.show();
            }
        });

        VBox buttonsVbox = new VBox(20);
        buttonsVbox.setAlignment(Pos.CENTER);
        buttonsVbox.getChildren().addAll(addBtn, removeBtn, addToBasket);

        VBox refreshmentVbox = new VBox(20);
        refreshmentVbox.setAlignment(Pos.TOP_CENTER);
        refreshmentVbox.getChildren().addAll(refreshmentListLbl, refreshmentList);

        VBox refreahmentOrderVbox = new VBox(20);
        refreahmentOrderVbox.setAlignment(Pos.TOP_CENTER);
        refreahmentOrderVbox.getChildren().addAll(tempListLbl, tempList);

        Image popcorn = new Image("sample/images/PopcornBlue.jpg", 150, 200,
                true, true);
        ImageView pop = new ImageView(popcorn);

        root.add(pageTitle,0,0,5,1);
        root.add(refreshmentVbox, 0,1,1, 1);
        root.add(buttonsVbox, 1, 1, 1,1);
        root.add(refreahmentOrderVbox, 2, 1,1,1);
        root.add(pop,3,1,1,2);

        setScene(refreshmentScene);
        System.out.println(MainPage.getItems());

    }
}
