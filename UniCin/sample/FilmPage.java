package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.TextAlignment;
import javafx.scene.input.MouseEvent;

/**
 * Created by u1257802 on 15/03/2019.
 */
public class FilmPage extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        GridPane loginGrid = new GridPane();
        loginGrid.setAlignment(Pos.CENTER);
        loginGrid.setHgap(10);
        loginGrid.setVgap(10);
        loginGrid.setPadding(new Insets(15,15,15,15));
//        loginGrid.setMinSize(800,500);
//        loginGrid.setMinHeight(500);
//        loginGrid.setMaxHeight(800);

        Scene loginScene = new Scene(loginGrid,800,500, Color.POWDERBLUE);

        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        Text loginSceneTitle = new Text("Login");
        loginSceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        loginSceneTitle.setTextAlignment(TextAlignment.CENTER);
        loginSceneTitle.setFill(Color.CORAL);
        loginSceneTitle.setEffect(ds);
        loginSceneTitle.setCache(true);
        loginSceneTitle.setX(10.0f);
        loginSceneTitle.setY(270.0f);

        Label userName = new Label("Enter Username");
        userName.setTextFill(Color.web("#9C27B0"));
        TextField UsernameTextField = new TextField();
        Label password = new Label("Enter Password");
        password.setTextFill(Color.web("#9C27B0"));
        PasswordField PasswordTextField = new PasswordField();
        Button guestButton = new Button("Continue as a Guest");
//        guestButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent );

        guestButton.getEffect();


        loginGrid.add(loginSceneTitle,0,0,5,1);
        loginGrid.add(userName,0,2,1,1);
        loginGrid.add(UsernameTextField,2,2,4,1);
        loginGrid.add(password, 0,4,1,1);
        loginGrid.add(PasswordTextField,2,4,4,1);
        loginGrid.add(guestButton,0,5,5,1 );

        loginGrid.setGridLinesVisible(true);

        primaryStage.setTitle("UniCin");
        primaryStage.setScene(loginScene);
        primaryStage.show();

//        GridPane filmGrid = new GridPane();
//
//        filmGrid.setAlignment(Pos.CENTER);
//        filmGrid.setHgap(15);
//        filmGrid.setVgap(15);
//        filmGrid.setPadding(new Insets(15, 15, 15, 15));
//
//        Scene homeScene = new Scene(filmGrid, 800, 500, Color.POWDERBLUE);
//
//        DropShadow ds = new DropShadow();
//        ds.setOffsetY(3.0f);
//        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));
//
//        Text UniCinTitle = new Text("UniCin");
//        UniCinTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
//        UniCinTitle.setTextAlignment(TextAlignment.CENTER);
//        UniCinTitle.setFill(Color.CORAL);
//        UniCinTitle.setEffect(ds);
//        UniCinTitle.setCache(true);
//        UniCinTitle.setX(10.0f);
//        UniCinTitle.setY(270.0f);
//
//
//
//        Text pickFilm = new Text("Click a film to find out more information");
//        pickFilm.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 18));
//        pickFilm.setFill(Color.color(0.4f, 0.4f, 1.0f ));
//
//        Image i1 = new Image("../UniCin/sample/images/HowToTrainYourDragon.jpg", 120,
//                160, true, true);
//        Image i2 = new Image("../UniCin/sample/images/StarWars.jpg", 120,
//                160, true, true);
//        Image i3 = new Image("../UniCin/sample/images/10ThingsIHateAboutYou.jpg", 120,
//                160, true, true);
//        Image i4 = new Image("../UniCin/sample/images/PacificRim.jpg", 120,
//                160, true, true);
//        Image i5 = new Image("../UniCin/sample/images/DantesPeak.jpg", 120,
//                160, true, true);
//        Image i6 = new Image("../UniCin/sample/images/LordOfTheRings.jpg", 120,
//                160, true, true);
//        Image i7 = new Image("../UniCin/sample/images/Moana.jpg", 120,
//                160, true, true);
//        Image i8 = new Image("../UniCin/sample/images/BridgetJonessBaby.jpg", 120,
//                160, true, true);
//        Image i9 = new Image("../UniCin/sample/images/TheAvengers.jpg", 120,
//                160, true, true);
//        Image i10 = new Image("../UniCin/sample/images/TheWolfOfWallStreet.jpg", 120,
//                160, true, true);
//
//        ImageView i1v = new ImageView(i1);
//        ImageView i2v = new ImageView(i2);
//        ImageView i3v = new ImageView(i3);
//        ImageView i4v = new ImageView(i4);
//        ImageView i5v = new ImageView(i5);
//        ImageView i6v = new ImageView(i6);
//        ImageView i7v = new ImageView(i7);
//        ImageView i8v = new ImageView(i8);
//        ImageView i9v = new ImageView(i9);
//        ImageView i10v = new ImageView(i10);
//
//        filmGrid.add(UniCinTitle, 0, 0, 5, 1);
//        filmGrid.add(i1v,0,2);
//        filmGrid.add(i2v,0,3);
//        filmGrid.add(i3v,1,2);
//        filmGrid.add(i4v,1,3);
//        filmGrid.add(i5v,2,2);
//        filmGrid.add(i6v,2,3);
//        filmGrid.add(i7v,3,2);
//        filmGrid.add(i8v,3,3);
//        filmGrid.add(i9v,4,2);
//        filmGrid.add(i10v,4,3);
//        filmGrid.add(pickFilm, 0,5,5,1);
//
//
//        filmGrid.setGridLinesVisible(false);
//
//        primaryStage.setScene(homeScene);
//        primaryStage.show();




    }
}
