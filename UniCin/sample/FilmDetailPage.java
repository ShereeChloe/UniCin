package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.Optional;

/**
 * Created by u1257802 on 18/03/2019.
 */
public class FilmDetailPage extends Stage{

    private Scene filmDetailScene;
    private DropShadow ds;
    private Film film;




    public FilmDetailPage (Film film){
        this.film = film;
        System.out.println(this.film.getTitle());
        initialize();
    }

    @FXML
    public void initialize() {

        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,15,15));
        root.setVgap(10);
        root.setHgap(10);

        filmDetailScene = new Scene(root, 800, 500);

        ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        Text filmTitle = new Text();
        filmTitle.setText(film.getTitle());
        filmTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        filmTitle.setTextAlignment(TextAlignment.CENTER);
        filmTitle.setFill(Color.CORAL);
        filmTitle.setEffect(ds);
        filmTitle.setCache(true);

        Image filmImage = new Image("sample/images/" + film.getFilmImageUrl());
        ImageView filmImageView = new ImageView(filmImage);


        Text descriptionText = new Text();
        descriptionText.setText("Description:" + "\n" + film.getDescription() + "\n" + "\n" + "Certificate: "
                + film.getCertificate() + "\n" + "\n" + "Runtime: " + film.getRuntime() + "\n" + "\n" + "Genres: "
                + film.getGenres() + "\n" + "\n" + "Price: " + film.getPrice() );
        descriptionText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        descriptionText.setWrappingWidth(200);

        Label selectAmountLbl = new Label();
        selectAmountLbl.setText("Select Amount of Tickets");
        selectAmountLbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));

        Label maxAmountMes = new Label();
        maxAmountMes.setText("Maximum of 20 tickets per booking");
        maxAmountMes.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));

        Spinner ticketSpinner = new Spinner();
        SpinnerValueFactory<Integer> ticketAmountFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory
                (0, 20, 0);
        ticketSpinner.setValueFactory(ticketAmountFactory);

        Button basketBtn = new Button();
        basketBtn.setEffect(ds);
        basketBtn.setText("Add to Basket");

        basketBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            Alert basketOptions = new Alert(Alert.AlertType.CONFIRMATION);
            basketOptions.setTitle("Additional Options");
            basketOptions.setHeaderText("Where would you like to go next?");
            basketOptions.setContentText("Choose your destination");

            basketOptions.showAndWait();

            ButtonType continueBrowsing = new ButtonType("Continue Browsing");
                ButtonType addRefreshments = new ButtonType("Choose Refreshments");
                ButtonType goToBasket = new ButtonType("Go to Basket");
                ButtonType cancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

                basketOptions.getButtonTypes().setAll(continueBrowsing, addRefreshments, goToBasket, cancel);
            }
        });

        VBox ticketVb = new VBox(10);
        ticketVb.setAlignment(Pos.CENTER);
        ticketVb.getChildren().addAll(selectAmountLbl, ticketSpinner, maxAmountMes, basketBtn);

        VBox filmVb= new VBox(10);
        filmVb.setAlignment(Pos.CENTER);
        filmVb.getChildren().addAll(descriptionText);

        root.setStyle("-fx-background-color: #B0E0E6");
        root.setPadding(new Insets(15,15,15,15));
        root.setHgap(20);
        root.setVgap(40);
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.add(filmTitle, 0,0,2,1);
        root.add(filmImageView, 0,1,1,1);
        root.add(filmVb, 1, 1, 1,2);
        root.add(ticketVb, 2,1,1,2);


        root.setGridLinesVisible(true);

        setScene(filmDetailScene);
        System.out.println("jdgf");

    }
}
