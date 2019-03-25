package sample.ScreenControllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import sample.Controllers.FilmController;
import sample.Film;

/**
 * Created by u1257802 on 11/03/2019.
 */
public class HomePageController {
    public ListView lvAllFilms;
    public Label lblFilmTitle;
    private FilmController fc = new FilmController();
    private ObservableList<Film> olFilms;

    @FXML
    public void initialize() {
        olFilms = fc.getFilms();
        lvAllFilms.setItems(olFilms);
    }

    public void lvAllFilmsClick(MouseEvent mouseEvent) {
        int index = lvAllFilms.getSelectionModel().getSelectedIndex();
        System.out.print(olFilms.get(index).getTitle() + "\n");
        lblFilmTitle.setText(olFilms.get(index).getTitle());
    }
}
