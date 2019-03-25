package sample.Screens;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import sample.Controllers.ItemController;
import sample.Item;

/**
 * Created by u1257802 on 25/03/2019.
 */
public class RefreshmentsPage extends Stage {

    private Scene refreshmentScene;
    private DropShadow ds;
    private Item item;
    private ItemController ic = new ItemController();
    private ObservableList<Item> obListItems;

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
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));

        refreshmentScene = new Scene(root, 800, 500);

        ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        Text pageTitle = new Text();
        pageTitle.setText("Welcome to the Refreshments Page");
        pageTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        pageTitle.setTextAlignment(TextAlignment.CENTER);
        pageTitle.setFill(Color.CORAL);
        pageTitle.setEffect(ds);
        pageTitle.setCache(true);

        ListView refreshmentList = new ListView(ic.getItems());
        obListItems = ic.getItems();
        refreshmentList.setItems(obListItems);
        System.out.println(obListItems);
        refreshmentList.setOrientation(Orientation.VERTICAL);
        refreshmentList.setPrefSize(300, 250);

//
//        public ListView lvAllFilms;
//        public Label lblFilmTitle;
//        private FilmController fc = new FilmController();
//        private ObservableList<Film> olFilms;
//
//        @FXML
//        public void initialize() {
//            olFilms = fc.getFilms();
//            lvAllFilms.setItems(olFilms);
//        }

        root.add(pageTitle,0,0,5,1);
        root.add(refreshmentList, 0,1,2, 2);

        setScene(refreshmentScene);
        System.out.println(MainPage.getItems());
    }
}
