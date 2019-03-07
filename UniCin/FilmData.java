import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class FilmData {

    private ArrayList <Film>films;

    public FilmData() {

        films = new ArrayList<>();

        films.add(new Film("How to Train Your Dragon", "PG", 3.50, "98 minutes",
                "2010", "Animation", "Action", "Adventure", 8.1));

        Film f2 = new Film("The Lord of the Rings: The Fellowship of the Ring", "PG-13", 3.00,
                "178 minutes", "2001", "Adventure", "Drama", "Fantasy",
                8.8);

        Film f3 = new Film ("Star Wars: The Return of the Jedi", "PG", 2.00, "131 minutes",
                "1983", "Action", "Adventure", "Fantasy", 8.3);

        Film f4 = new Film("Pacific Rim", "PG-13", 3.50, "131 minutes", "2013",
                "Action", "Adventure", "Sci-Fi", 6.9);

        Film f5 = new Film("Moana", "PG", 4.00,"2016","107 minutes",
                "Action","Adventure", "Comedy", 7.6);

        Film f6 = new Film ("The Avengers", "PG-13",3.50, "143 minutes","2012",
                "Action", "Adventure", "Sci-Fi", 8.1);

        Film f7 = new Film("Bridget Jones's Baby", "15", 4.00, "123 minutes",
                "2016", "Comedy", "Drama", "Romance", 6.5);

        Film f8 = new Film("10 Things I Hate About You", "PG-13", 2.50, "97 minutes",
                "1999", "Comedy", "Drama", "Romance", 7.3);

        Film f9 = new Film ("Dante's Peak", "PG-13", 2.50, "108 minutes",
                "1997", "Action", "Adventure", "Thriller", 5.9);

        Film f10 = new Film ("The Wolf of Wall Street", "18", 3.50, "180 minutes",
                "2013", "Biography", "Comedy", "Crime", 8.2);

    }

    public ArrayList<Film> getFilms() {
        return films;
    }
}
