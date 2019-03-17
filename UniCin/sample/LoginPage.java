package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
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
public class LoginPage extends Stage {


    public LoginPage(Application mainPage)
    {

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

        guestButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                close();

                FilmPage filmPage = new FilmPage();
                filmPage.show();
            }
        });


        loginGrid.add(loginSceneTitle,0,0,5,1);
        loginGrid.add(userName,0,2,1,1);
        loginGrid.add(UsernameTextField,2,2,4,1);
        loginGrid.add(password, 0,4,1,1);
        loginGrid.add(PasswordTextField,2,4,4,1);
        loginGrid.add(guestButton,0,5,5,1 );

        loginGrid.setGridLinesVisible(false);

        setScene(loginScene);

    }


}
