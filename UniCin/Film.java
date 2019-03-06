public class Film {

    private String title;
    private String certificate;
    private double price;
    private String runtime;
    private String releaseYear;
    private String genre1;
    private String genre2;
    private String genre3;
    private double rating;

    public Film(String title, String certificate, double price, String runtime, String realeaseYear, String genre1,
                String genre2, String genre3, double rating) {
        this.title = title;
        this.certificate = certificate;
        this.price = price;
        this.runtime = runtime;
        this.releaseYear = realeaseYear;
        this.genre1 = genre1;
        this.genre2 = genre2;
        this.genre3 = genre3;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getCertificate() {
        return certificate;
    }

    public double getPrice() {
        return price;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getGenre1() {
        return genre1;
    }

    public String getGenre2() {
        return genre2;
    }

    public String getGenre3() {
        return genre3;
    }

    public double getRating() {
        return rating;
    }
}
