package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Film;
import sample.Data.FilmData;

import java.util.ArrayList;

/**
 * Created by u1257802 on 25/02/2019.
 */
public class FilmController {

    private ArrayList<Film> films = new ArrayList<>();

    public FilmController() {
        FilmData fd = new FilmData();
        films = fd.getFilms();
    }

    public void printFilms() {
        for (Film film : films) {
            System.out.println(film.getTitle());
        }
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public ObservableList<Film> filterFilmsByGenre(ArrayList<Film> availableFilms ,String genre)
    {
        ArrayList<Film> matchingFilms = new ArrayList<>();

        for (Film film: availableFilms) {
            if (film.getGenres().contains(genre))
            {
                matchingFilms.add(film);
            }
        }

        return FXCollections.observableArrayList(matchingFilms);
    }

    public ObservableList<Film> getFilms() {
        return FXCollections.observableArrayList(films);
    }




}