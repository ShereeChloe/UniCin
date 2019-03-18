package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by u1257802 on 18/03/2019.
 */
public class FilmDetailPage extends Stage{

    private Scene filmDetailScene;
    private AnchorPane filmDetails;
    private DropShadow ds;
    private ImageView filmImage;

    public FilmDetailPage(Application mainPage){
        filmDetails = new AnchorPane();
        filmDetailScene = new Scene(filmDetails, 800, 500);



        filmDetails.setLayoutX(500.0);
        filmDetails.setLayoutY(800.0);

        ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));


    }

    public Scene getFilmDetailScene() {
        return filmDetailScene;
    }


}
