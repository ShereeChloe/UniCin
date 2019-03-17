package sample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Film {

    private String title;
    private String certificate;
    private double price;
    private String runtime;
    private int releaseYear;
    private ArrayList<String> genres;
    private double rating;
    private int filmAge;

    private enum Genre
    {
        ACTION,
        ADVENTURE
    }

    public Film(String title, String certificate, double price, String runtime, int realeaseYear, ArrayList<String> genres, double rating) {
        this.title = title;
        this.certificate = certificate;
        this.price = price;
        this.runtime = runtime;
        this.releaseYear = realeaseYear;
        this.genres = genres;
        this.rating = rating;

        filmAge = getAge();
    }

    public String getTitle() {
        return title;
    }

    public String getCertificate() {
        return certificate;
    }

    public double getPrice() {

        if (filmAge <= 1)
        {
            return 10.0;
        }
        else if (filmAge <= 5)
        {
            return 5.0;
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




}
