public class Main {

    public static void main(String[] args) {
        FilmController fc = new FilmController();
        Film f1 = new Film("The Lord of the Rings: The Fellowshipe of the Ring", "PG-13", 3.00,
                "178 minutes", "2001", "Adventure", "Drama", "Fantasy",
                8.8);

        fc.addFilm(f1);

    }
}
