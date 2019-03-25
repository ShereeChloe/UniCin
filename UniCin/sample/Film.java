package sample;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Film {

    private String title;
    private String certificate;
    private double price;
    private String runtime;
    private int releaseYear;
    private ArrayList<String> genres;
    private double rating;
    private int filmAge;
    private String description;
    private String filmImageUrl;
    private int theatre;

    private enum Genre
    {
        ACTION,
        ADVENTURE
    }

    public Film(String title, String certificate, double price, String runtime, int releaseYear,
                ArrayList<String> genres, double rating, String description, String filmImageUrl, int theatre) {
        this.title = title;
        this.certificate = certificate;
        this.price = price;
        this.runtime = runtime;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.rating = rating;
        this.description = description;
        this.filmImageUrl = filmImageUrl;
        this.theatre = theatre;

        filmAge = getAge();
    }

    public String getTitle() {
        return title;
    }

    public String getCertificate() {
        return certificate;
    }

    public double getPrice() {

        if (filmAge <= 5)
        {
            return 5.0;
        }
        else if (filmAge <= 10)
        {
            return 4.0;
        }
        else if (filmAge <=15)
        {
            return 3.0;
        }
        else
        {
            return 2.0;
        }
    }

    private int getAge()
    {
      int year = Calendar.getInstance().get(Calendar.YEAR);
      return year - releaseYear;
    }



    public String getRuntime() {
        return runtime;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription(){return description; }

    public int getFilmAge() {
        return filmAge;
    }

    public String getFilmImageUrl() {
        return filmImageUrl;
    }

    public int getTheatre() {
        return theatre;
    }
}
