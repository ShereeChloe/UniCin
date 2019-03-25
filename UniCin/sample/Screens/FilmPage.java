package sample.Screens;

import javafx.collections.ObservableList;
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
import sample.Controllers.FilmController;
import sample.Film;

public class FilmPage extends Stage {


    private GridPane filmGrid;

    private Scene filmScene;
    private FilmController fc = new FilmController();
    private ObservableList<Film> filmList;

    public FilmPage()
    {
        filmList = fc.getFilms();
        System.out.println(filmList.size());
        filmGrid = new GridPane();

        filmGrid.setAlignment(Pos.CENTER);
        filmGrid.setHgap(15);
        filmGrid.setVgap(15);
        filmGrid.setPadding(new Insets(15, 15, 15, 15));
        filmGrid.setStyle("-fx-background-color: #B0E0E6");

        filmScene = new Scene(filmGrid, 800, 500, Color.POWDERBLUE);
        filmScene.setFill(Color.POWDERBLUE);

        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));

        Text uniCinTitle = new Text("UniCin");
        uniCinTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 32));
        uniCinTitle.setTextAlignment(TextAlignment.CENTER);
        uniCinTitle.setFill(Color.CORAL);
        uniCinTitle.setEffect(ds);
        uniCinTitle.setCache(true);
        uniCinTitle.setX(10.0f);
        uniCinTitle.setY(270.0f);

        Text pickFilm = new Text("Click a film to find out more information");


        pickFilm.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 18));
        pickFilm.setFill(Color.color(0.4f, 0.4f, 1.0f ));

        filmGrid.add(uniCinTitle, 0, 0, 5, 1);

        int row = 1, col = 0;
        for (Film film : filmList){

            //System.out.println(film.getFilmImageUrl());
            Image i1 = new Image("/sample/images/" + film.getFilmImageUrl(), 120,
                    160, true, true);
            Button button = new Button();
            button.setId(film.getTitle());
            button.setStyle("-fx-background-color: #B0E0E6");
            button.setEffect(ds);
            System.out.println(button.getId());

            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    //System.out.println(event.getSource().toString());
                    MainPage.setFilm(film);
                    //System.out.println(film.getTitle());

                    close();

                    FilmDetailPage fdp = new FilmDetailPage(film);
                    fdp.show();

                }
            });

            button.setGraphic(new ImageView(i1));
            filmGrid.add(button, col, row, 1, 1);
            col++;
            if(col == 5){
                col = 0;
                row++;
            }
        }

        filmGrid.add(pickFilm, 0,5,5,1);

//        button1.addEventHandler(MouseEvent.MOUSE_ENTERED,
//                new EventHandler<MouseEvent>() {
//                    @Override
//                    public void handle(MouseEvent event) {
//                        button1.setEffect(ds);
//
//                    }
//                });
//
//        button1.addEventHandler(MouseEvent.MOUSE_EXITED,
//                new EventHandler<MouseEvent>() {
//                    @Override
//                    public void handle(MouseEvent event) {
//                        button1.setEffect(null);
//                    }
//                });
//
////        button1.addEventHandler(MouseEvent.MOUSE_CLICKED,
////                new EventHandler<MouseEvent>() {
////                    @Override
////                    public void handle(MouseEvent event) {
////                        FilmDetailPage fdp = new FilmDetailPage();
////                        close();
////                        button1.setOnMouseClicked(fdp);
////                        fdp.show();
////
////                    }
////                });
//
//        button1.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                //get the selected film
//
//                //set thew selected film on Main using setter
//
//
//                //then switch to new page
//                close();
//
//                FilmDetailPage fdp = new FilmDetailPage();
//                fdp.show();
//            }
//        });

        filmGrid.setGridLinesVisible(false);

        setScene(filmScene);

    }

    private void buttonClicked() {
        System.out.println("button clicked");
    }
}
