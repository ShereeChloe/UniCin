package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class FilmPage extends Stage {

    Cinema cinema;
    private GridPane filmGrid;

    private Scene filmScene;
    private Scene getfilmDetailScene;
    private DropShadow ds;
    private Text uniCinTitle;
    private Text pickFilm;
    private Image i1;
    private Image i2;
    private Image i3;
    private Image i4;
    private Image i5;
    private Image i6;
    private Image i7;
    private Image i8;
    private Image i9;
    private Image i10;
    private ImageView i1v;
    private ImageView i2v;
    private ImageView i3v;
    private ImageView i4v;
    private ImageView i5v;
    private ImageView i6v;
    private ImageView i7v;
    private ImageView i8v;
    private ImageView i9v;
    private ImageView i10v;
    private Button i1btn;
    private Button i2btn;
    private Button i3btn;
    private Button i4btn;
    private Button i5btn;
    private Button i6btn;
    private Button i7btn;
    private Button i8btn;
    private Button i9btn;
    private Button i10btn;

    public Scene getFilmScene() {
        return filmScene;
    }

    public FilmPage()
    {
        filmGrid = new GridPane();
        cinema = new Cinema();

        filmGrid.setAlignment(Pos.CENTER);
        filmGrid.setHgap(15);
        filmGrid.setVgap(15);
        filmGrid.setPadding(new Insets(15, 15, 15, 15));

        filmScene = new Scene(filmGrid, 800, 500, Color.POWDERBLUE);

        ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        uniCinTitle = new Text("UniCin");
        uniCinTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        uniCinTitle.setTextAlignment(TextAlignment.CENTER);
        uniCinTitle.setFill(Color.CORAL);
        uniCinTitle.setEffect(ds);
        uniCinTitle.setCache(true);
        uniCinTitle.setX(10.0f);
        uniCinTitle.setY(270.0f);

        pickFilm = new Text("Click a film to find out more information");
        pickFilm.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 18));
        pickFilm.setFill(Color.color(0.4f, 0.4f, 1.0f ));

        i1 = new Image("/sample/images/HowToTrainYourDragon.jpg", 120,
                160, true, true);
        i2 = new Image("/sample/images/StarWars.jpg", 120,
                160, true, true);
        i3 = new Image("/sample/images/DantesPeak.jpg", 120,
                160, true, true);
        i4 = new Image("/sample/images/PacificRim.jpg", 120,
                160, true, true);
        i5 = new Image("/sample/images/10ThingsIHateAboutYou.jpg", 120,
                160, true, true);
        i6 = new Image("/sample/images/LordOfTheRings.jpg", 120,
                160, true, true);
        i7 = new Image("/sample/images/Moana.jpg", 120,
                160, true, true);
        i8 = new Image("/sample/images/StarTrek.jpg", 120,
                160, true, true);
        i9 = new Image("/sample/images/TheAvengers.jpg", 120,
                160, true, true);
        i10 = new Image("/sample/images/TheWolfOfWallStreet.jpg", 120,
                160, true, true);

        i1v = new ImageView(i1);
        i2v = new ImageView(i2);
        i3v = new ImageView(i3);
        i4v = new ImageView(i4);
        i5v = new ImageView(i5);
        i6v = new ImageView(i6);
        i7v = new ImageView(i7);
        i8v = new ImageView(i8);
        i9v = new ImageView(i9);
        i10v = new ImageView(i10);

        i1btn = new Button("", i1v);
        i2btn = new Button("", i2v);
        i3btn = new Button("", i3v);
        i4btn = new Button("", i4v);
        i5btn = new Button("", i5v);
        i6btn = new Button("", i6v);
        i7btn = new Button("", i7v);
        i8btn = new Button("", i8v);
        i9btn = new Button("", i9v);
        i10btn = new Button("", i10v);

        // Layout
        filmGrid.add(uniCinTitle, 0, 0, 5, 1);
        filmGrid.add(i1btn,0,2);
        filmGrid.add(i2btn,0,3);
        filmGrid.add(i3btn,1,2);
        filmGrid.add(i4btn,1,3);
        filmGrid.add(i5btn,2,2);
        filmGrid.add(i6btn,2,3);
        filmGrid.add(i7btn,3,2);
        filmGrid.add(i8btn,3,3);
        filmGrid.add(i9btn,4,2);
        filmGrid.add(i10btn,4,3);
        filmGrid.add(pickFilm, 0,5,5,1);

        i1btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                FilmDetailPage fdp = new FilmDetailPage();
//                fdp.initOwner(primaryStage);
                setScene(getfilmDetailScene);
            }
        });


        filmGrid.setGridLinesVisible(false);

        setScene(filmScene);
    }

}
