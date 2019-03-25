package sample.Pages;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.TextAlignment;
import sample.Controllers.CustomerController;
import sample.Customer;
import sample.Data.CustomerData;

import static javafx.scene.control.Alert.*;

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

        Scene loginScene = new Scene(loginGrid,850,500, Color.POWDERBLUE);
        loginScene.setFill(Color.POWDERBLUE);

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
        guestButton.setEffect(ds);

        Button loginButton = new Button("Login");
        loginButton.setEffect(ds);

        guestButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                close();

                FilmPage filmPage = new FilmPage();
                filmPage.show();
            }
        });

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                CustomerData cd = new CustomerData();
                CustomerController cc = new CustomerController();
                Customer c = new Customer("Sheree", "Edgar", null, null,
                        0, null, false, false,
                        10, "12345", "Sheree");
                //System.out.println("in method");
                // get username and pass from text boxes
                // check if there is an text
                // check if text matches hardcoded user

                //System.out.println(UsernameTextField.getText().equals("") + "1");

                if (!UsernameTextField.getText().equals("") ){
                    if (!PasswordTextField.getText().equals("")){
                        //System.out.println(PasswordTextField.getText());
                        //System.out.println(UsernameTextField.getText());

                        //create the controller instance and call the login method
                        Customer customer = cc.checkLoginDetails(UsernameTextField.getText(),
                                PasswordTextField.getText());

//                        close();
//                        fp.show();

                        System.out.println(customer);
//                            if (UsernameTextField.getText().equals(c.getUsername())
//                                    && PasswordTextField.getText().equals(c.getPassword()));
//


                    }else{
                        Alert passwordErrorAlert = new Alert(AlertType.ERROR);
                        passwordErrorAlert.setHeaderText("Please Enter a Password");
                        passwordErrorAlert.showAndWait();
                        //System.out.println("Please Enter a Password.");
                    }
                }else{
                    Alert usernameErrorAlert = new Alert(AlertType.ERROR);
                    usernameErrorAlert.setHeaderText("Please Enter a UserName");
                    usernameErrorAlert.showAndWait();
                    System.out.println("Please Enter a UserName.");
                }
            }
        });

        loginGrid.setStyle("-fx-background-color: #B0E0E6");
        loginGrid.add(loginSceneTitle,0,0,5,1);
        loginGrid.add(userName,0,2,1,1);
        loginGrid.add(UsernameTextField,2,2,4,1);
        loginGrid.add(password, 0,4,1,1);
        loginGrid.add(PasswordTextField,2,4,4,1);
        loginGrid.add(loginButton,0,5,5,1);
        loginGrid.add(guestButton,1,5,5,1 );

        loginGrid.setGridLinesVisible(false);

        setScene(loginScene);
    }
}
