package sample;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * Created by u1257802 on 18/03/2019.
 */
public class FilmDetailPage extends Stage{

    private Stage fdStage;
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
        GridPane filmDetails = new GridPane();
        filmDetailScene = new Scene(filmDetails, 800, 500);

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
        descriptionText.setText(film.getDescription());
        descriptionText.setWrappingWidth(300);

        Label priceLbl = new Label();




        Spinner ticketSpinner = new Spinner();


        filmDetails.setStyle("-fx-background-color: #B0E0E6");
        filmDetails.setPadding(new Insets(15,15,15,15));
        filmDetails.setHgap(20);
        filmDetails.setVgap(40);
        filmDetails.add(filmTitle, 1,0,2,1);
        filmDetails.add(filmImageView, 1,1,1,1);
        filmDetails.add(descriptionText, 2, 1, 2,2);

        setScene(filmDetailScene);
        System.out.println("jdgf");
    }
}
