package sample.Pages;

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
import sample.Film;
import sample.Item;
import sample.Utility;

/**
 * Created by u1257802 on 18/03/2019.
 */
public class FilmDetailPage extends Stage{

    private Scene filmDetailScene;
    private DropShadow ds;
    private Film film;
    private Item item;
    private Utility utility = new Utility();

    public FilmDetailPage (Film film){
        this.film = film;
        System.out.println(this.film.getTitle());
        initialize();
    }

    @FXML
    public void initialize() {

        GridPane root = new GridPane();
        root.setStyle("-fx-background-color: #B0E0E6");
        root.setPadding(new Insets(15,15,15,15));
        root.setHgap(20);
        root.setVgap(40);
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));
        root.getColumnConstraints().add(new ColumnConstraints(200));

        filmDetailScene = new Scene(root, 850, 500);

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
                + film.getGenres() + "\n" + "\n" + "Price: " + utility.formatCurrency(film.getPrice()) + "\n" + "\n" +
        "");
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
                Alert zeroAlert = new Alert(Alert.AlertType.ERROR);

                if ((int)ticketSpinner.getValue() == 0) {
                    zeroAlert.setHeaderText("Please select an amount higher than 0 to add to basket");
                    zeroAlert.showAndWait();
                }else{
                    int numberOfTickets = ((int)ticketSpinner.getValue());

                    MainPage.setNumberOfTickets(numberOfTickets);

                    System.out.println(MainPage.getNumberOfTickets());
                    System.out.println(MainPage.getNumberOfTickets() * MainPage.getFilm().getPrice());

                }
                System.out.println((int)ticketSpinner.getValue());
            Alert basketOptions = new Alert(Alert.AlertType.CONFIRMATION);
            basketOptions.setTitle("Add to Basket");
            basketOptions.setContentText("You will now be directed to the Refreshment page");
                basketOptions.showAndWait();

//                (int)ticketSpinner.getValue()
                        // need to get the films added into main array list

//            ButtonType continueBrowsing = new ButtonType("Continue Browsing");
//                ButtonType addRefreshments = new ButtonType("Choose Refreshments");
//                ButtonType goToBasket = new ButtonType("Go to Basket");
//                ButtonType cancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
//
//                basketOptions.getButtonTypes().setAll(continueBrowsing, addRefreshments, goToBasket, cancel);

                close();
                RefreshmentsPage rp = new RefreshmentsPage(item);
                rp.show();

                System.out.println("hello");
            }
        });

        VBox ticketVb = new VBox(10);
        ticketVb.setAlignment(Pos.CENTER);
        ticketVb.getChildren().addAll(selectAmountLbl, ticketSpinner, maxAmountMes, basketBtn);

        VBox filmVb= new VBox(10);
        filmVb.setAlignment(Pos.CENTER);
        filmVb.getChildren().addAll(descriptionText);

        Button backBtn = new Button("Back to Film Options");
        backBtn.setEffect(ds);

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert backConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
                backConfirmation.setTitle("No tickets will be added to basket");
                backConfirmation.setHeaderText("Tickets will not be added to the basket unless the 'Add To Basket'" +
                        " button is pressed");
                backConfirmation.showAndWait();

                close();

                FilmPage fp = new FilmPage();
                fp.show();
                System.out.println("hello");
            }
        });

        root.add(filmTitle, 0,0,2,1);
        root.add(filmImageView, 0,1,1,1);
        root.add(filmVb, 1, 1, 1,2);
        root.add(ticketVb, 2,1,1,2);
        root.add(backBtn,0,2,1,1);

        root.setGridLinesVisible(false);

        setScene(filmDetailScene);
        System.out.println("jdgf");
    }
}
