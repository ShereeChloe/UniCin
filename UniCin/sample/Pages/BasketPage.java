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
import javafx.scene.layout.HBox;
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
import sample.Item;
import sample.Utility;

/**
 * Created by u1257802 on 25/03/2019.
 */
public class BasketPage extends Stage {

    private Scene basketScene;
    private DropShadow ds;
    private Film film;
    private int numberOfTickets;
    private Utility utility = new Utility();

    public BasketPage(){
        initialize();
    }

    public BasketPage (Film film){
        //this.film = film;
        System.out.println(this.film.getTitle());
        initialize();
    }

    @FXML
    public void initialize() {
        film = MainPage.getFilm();
        numberOfTickets = MainPage.getNumberOfTickets();
        //System.out.println("basket" + film.getTitle());
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

        Button backBtn = new Button("Back to Film Options");
        backBtn.setEffect(ds);

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert backConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
                backConfirmation.setTitle("Saved Basket");
                backConfirmation.setHeaderText("You will lose your current items in your basket");
                backConfirmation.showAndWait();

                close();
                FilmPage fp = new FilmPage();
                fp.show();
            }
        });

        Button payByCashBtn = new Button("Pay By Cash");
        payByCashBtn.setEffect(ds);

        payByCashBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert payByCashConf = new Alert(Alert.AlertType.CONFIRMATION);
                payByCashConf.setTitle("Pay By Cash");
                payByCashConf.setHeaderText("Please go to the box office within the next 48 hours to pay" + "\n" +
                        "Otherwise your order will be cancelled");
                payByCashConf.showAndWait();

                payByCashConf.close();
            }
        });

        Button payByCardBtn = new Button("Pay By Card");
        payByCardBtn.setEffect(ds);

        payByCardBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert payByCardConf = new Alert(Alert.AlertType.CONFIRMATION);
                payByCardConf.setTitle("Pay By Card");
                payByCardConf.setHeaderText("Please have your card ready to enter details on the next screen");
                payByCardConf.showAndWait();

                close();
                CardPaymentPage cpp = new CardPaymentPage();
                cpp.show();
            }
        });

        HBox basketOptionsHbox = new HBox(15);
        basketOptionsHbox.setAlignment(Pos.CENTER);
        basketOptionsHbox.getChildren().addAll(backBtn, payByCashBtn, payByCardBtn);

        Image filmImage = new Image("sample/images/" + film.getFilmImageUrl());
        ImageView filmImageView = new ImageView(filmImage);

        Text descriptionText = new Text("You are booking tickets for:" + "\n" + "\n" + film.getTitle() + "\n" + "\n"
                + "Description:" + "\n" + film.getDescription() + "\n" + "\n" + "Certificate: " + film.getCertificate()
                + "\n" + "\n" + "Runtime: " + film.getRuntime() + "\n" + "\n" + "Genres: " + film.getGenres());
        //  "Available Seats: " + theatre.getSeats()););
        descriptionText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        descriptionText.setWrappingWidth(250);

        Label basketListLbl = new Label("Order Summary");
        basketListLbl.setTextFill(Color.color(0.4f, 0.4f, 1.0f));
        basketListLbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));

        double totalRefreshmentPrice = 0;
        StringBuilder sb = new StringBuilder();
        for (Item item : MainPage.getItems()){
            totalRefreshmentPrice += item.getPrice();
            sb.append(item.getName() );
            sb.append(utility.formatCurrency(item.getPrice()));
            sb.append("\n");
        }

        double totalPrice = 0;

        System.out.println(totalRefreshmentPrice);
        System.out.println(sb);

        Text ticketInfoText = new Text("Amount of Tickets Booked: " + MainPage.getNumberOfTickets() + "\n" + "\n" +
                "Price per Ticket: " + utility.formatCurrency(film.getPrice()));
        ticketInfoText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        ticketInfoText.setWrappingWidth(200);

        Text orderInfoText = new Text("Total Ticket Amount: " + utility.formatCurrency(
                MainPage.getNumberOfTickets() * MainPage.getFilm().getPrice()) + "\n" + "\n" + sb +
                "\n" + "Final Order Total: " + (MainPage.getNumberOfTickets() * MainPage.getFilm().getPrice())
                + MainPage.getItems());
        orderInfoText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        orderInfoText.setWrappingWidth(200);

        VBox ticketInfoVb = new VBox(15);
        ticketInfoVb.setAlignment(Pos.BOTTOM_LEFT);
        ticketInfoVb.getChildren().addAll(descriptionText, ticketInfoText);

        VBox orderInfoVb = new VBox();
        orderInfoVb.setAlignment(Pos.TOP_LEFT);
        orderInfoVb.getChildren().addAll(basketListLbl, orderInfoText);

        root.add(pageTitle,0,0,4,1);
        root.add(filmImageView,1,1,1,1);
        root.add(basketOptionsHbox, 0,2,4,1);
        //root.add(descriptionText,1,1,4,1);
        root.add(ticketInfoVb, 0,1,1,1);
        root.add(orderInfoVb, 2, 1,1,1);

        setScene(basketScene);
    }
}