import java.util.ArrayList;

/**
 * Created by u1257802 on 25/02/2019.
 */
public class FilmController {

    private ArrayList<Film> films = new ArrayList<>();

    public FilmController() {
    }

    private void addFilm(Film film) {
        films.add(film);
    }

    private void printFilms() {
        for (Film film : films) {
            System.out.println(film);
        }
    }

}