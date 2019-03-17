package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class FilmPage extends Stage {

    Cinema cinema;

    public FilmPage()
    {
        GridPane filmGrid = new GridPane();

        cinema = new Cinema();

        filmGrid.setAlignment(Pos.CENTER);
        filmGrid.setHgap(15);
        filmGrid.setVgap(15);
        filmGrid.setPadding(new Insets(15, 15, 15, 15));


        Scene scene = new Scene(filmGrid, 800, 500, Color.POWDERBLUE);

        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        Text UniCinTitle = new Text("UniCin");
        UniCinTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        UniCinTitle.setTextAlignment(TextAlignment.CENTER);
        UniCinTitle.setFill(Color.CORAL);
        UniCinTitle.setEffect(ds);
        UniCinTitle.setCache(true);
        UniCinTitle.setX(10.0f);
        UniCinTitle.setY(270.0f);



        Text pickFilm = new Text("Click a film to find out more information");
        pickFilm.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 18));
        pickFilm.setFill(Color.color(0.4f, 0.4f, 1.0f ));

        Image i1 = new Image("/sample/images/HowToTrainYourDragon.jpg", 120,
                160, true, true);
        Image i2 = new Image("/sample/images/StarWars.jpg", 120,
                160, true, true);
        Image i3 = new Image("/sample/images/10ThingsIHateAboutYou.jpg", 120,
                160, true, true);
        Image i4 = new Image("/sample/images/PacificRim.jpg", 120,
                160, true, true);
        Image i5 = new Image("/sample/images/DantesPeak.jpg", 120,
                160, true, true);
        Image i6 = new Image("/sample/images/LordOfTheRings.jpg", 120,
                160, true, true);
        Image i7 = new Image("/sample/images/Moana.jpg", 120,
                160, true, true);
        Image i8 = new Image("/sample/images/BridgetJonessBaby.jpg", 120,
                160, true, true);
        Image i9 = new Image("/sample/images/TheAvengers.jpg", 120,
                160, true, true);
        Image i10 = new Image("/sample/images/TheWolfOfWallStreet.jpg", 120,
                160, true, true);

        ImageView i1v = new ImageView(i1);
        ImageView i2v = new ImageView(i2);
        ImageView i3v = new ImageView(i3);
        ImageView i4v = new ImageView(i4);
        ImageView i5v = new ImageView(i5);
        ImageView i6v = new ImageView(i6);
        ImageView i7v = new ImageView(i7);
        ImageView i8v = new ImageView(i8);
        ImageView i9v = new ImageView(i9);
        ImageView i10v = new ImageView(i10);

        Button image1button = new Button("", i1v);
        Button image2button = new Button("", i2v);
        Button image3button = new Button("", i3v);
        Button image4button = new Button("", i4v);
        Button image5button = new Button("", i5v);
        Button image6button = new Button("", i6v);
        Button image7button = new Button("", i7v);
        Button image8button = new Button("", i8v);
        Button image9button = new Button("", i9v);
        Button image10button = new Button("", i10v);


        filmGrid.add(UniCinTitle, 0, 0, 5, 1);
        filmGrid.add(image1button,0,2);
        filmGrid.add(image2button,0,3);
        filmGrid.add(image3button,1,2);
        filmGrid.add(image4button,1,3);
        filmGrid.add(image5button,2,2);
        filmGrid.add(image6button,2,3);
        filmGrid.add(image7button,3,2);
        filmGrid.add(image8button,3,3);
        filmGrid.add(image9button,4,2);
        filmGrid.add(image10button,4,3);
        filmGrid.add(pickFilm, 0,5,5,1);

        image1button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });


        filmGrid.setGridLinesVisible(false);

        setScene(scene);
    }

}
