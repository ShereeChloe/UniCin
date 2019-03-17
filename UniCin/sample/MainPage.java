package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class MainPage extends Application {

    private Stage currentStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        LoginPage loginPage = new LoginPage(this);
        loginPage.setScene(loginPage.getScene());

        Cinema cinema = new Cinema();

        currentStage = loginPage;
        currentStage.show();
    }




}
