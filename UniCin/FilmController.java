import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by u1257802 on 25/02/2019.
 */
public class FilmController {

    private ArrayList<Film> films = new ArrayList<>();

    public FilmController() {

        //films.add(f1);
        //addFilm(f3);

        FilmData fd = new FilmData();
        films = fd.getFilms();

//        Film f1 = new Film();
//        for(Film film : films){
//            if(film.getGenre1().equals(f1.getGenre1()) && !film.equals(f1)){
//                //print to screen in some respect
//                }
//        }
//
    }

   // public void addFilm(Film film) {
     //   films.add(film);
    //}

    public void printFilms() {
        for (Film film : films) {
            System.out.println(film);
        }
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public ObservableList<Film> getFilms() {
        return FXCollections.observableArrayList(films);
    }
}