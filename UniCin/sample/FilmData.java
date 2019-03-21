package sample;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class FilmData {

    private ArrayList <Film>films;

    public FilmData() {

        films = new ArrayList<>();

        films.add(new Film("Star Trek : First Contact", "PG-13", 2.50, "111 minutes",
                1996, new ArrayList<>(Arrays.asList("Drama", "Action", "Adventure")), 7.6,
                "The Borg travel back in time intent on preventing Earth's first contact with an alien " +
                        "species. Captain Picard and his crew pursue them to ensure that Zefram Cochran makes his" +
                        " maiden flight reaching warp speed.", "StarTrek.jpg"));

        films.add(new Film("How to Train Your Dragon", "PG", 3.50, "98 minutes",
                2010, new ArrayList<>(Arrays.asList("Animation", "Action", "Adventure")),8.1,
                "A hapless young Viking who aspires to hunt dragons becomes the unlikely friend of a" +
                        " young dragon himself, and learns there may be more to the creatures than he assumed.",
                "HowToTrainYourDragon.jpg"));

        films.add(new Film("The Lord of the Rings: The Fellowship of the Ring", "PG-13", 3.00,
                "178 minutes", 2001, new ArrayList<>(Arrays.asList("Adventure", "Drama",
                "Fantasy")),8.8, "A meek Hobbit from the Shire and eight companions set out on a " +
                "journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.",
                "LordOfTheRings.jpg"));

        films.add(new Film ("Star Wars: The Return of the Jedi", "PG", 2.00, "131 minutes",
                1983, new ArrayList<>(Arrays.asList("Action", "Adventure", "Fantasy")), 8.3,
                "After a daring mission to rescue Han Solo from Jabba the Hutt, the rebels dispatch to " +
                        "Endor to destroy a more powerful Death Star. Meanwhile, Luke struggles to help Darth Vader#" +
                        " back from the dark side without falling into the Emperor's trap.", "StarWars.jpg"));

        films.add(new Film("Pacific Rim", "PG-13", 3.50, "131 minutes", 2013,
                new ArrayList<>(Arrays.asList("Action", "Adventure", "Sci-Fi")),6.9, "As a war" +
                " between humankind and monstrous sea creatures wages on, a former pilot and a trainee are paired" +
                " up to drive a seemingly obsolete special weapon in a desperate effort to save the world from the" +
                " apocalypse.", "PacificRim.jpg"));

        films.add(new Film("Moana", "PG", 4.00,"107 minutes", 2016,
                new ArrayList<>(Arrays.asList("Action", "Adventure", "Comedy")), 7.6, "In" +
                " Ancient Polynesia, when a terrible curse incurred by the Demigod Maui reaches Moana's island," +
                " she answers the Ocean's call to seek out the Demigod to set things right.", "Moana.jpg"));

        films.add(new Film ("The Avengers", "PG-13",3.50, "143 minutes",2012,
                new ArrayList<>(Arrays.asList("Action", "Adventure", "Sci-Fi")), 8.1, "Earth's" +
                " mightiest heroes must come together and learn to fight as a team if they are going to stop the" +
                " mischievous Loki and his alien army from enslaving humanity.", "TheAvengers.jpg"));


        films.add(new Film("10 Things I Hate About You", "PG-13", 2.50, "97 minutes",
                1999, new ArrayList<>(Arrays.asList("Comedy", "Drama", "Romance")), 7.3,
                "A pretty, popular teenager can't go out on a date until her ill-tempered older" +
                        " sister does.", "10ThingsIHateAboutYou.jpg"));

        films.add(new Film ("Dante's Peak", "PG-13", 2.50, "108 minutes",
                1997, new ArrayList<>(Arrays.asList("Action", "Adventure", "Thriller")), 5.9,
                "A vulcanologist arrives at a countryside town recently named the second most desirable" +
                        " place to live in America, and discovers that the long dormant volcano, Dante's Peak, " +
                        "may wake up at any moment.", "DantesPeak.jpg"));

        films.add(new Film ("The Wolf of Wall Street", "18", 3.50, "180 minutes",
                2013, new ArrayList<>(Arrays.asList("Biography", "Comedy", "Crime")), 8.2,
                "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker " +
                        "living the high life to his fall involving crime, corruption and the federal government.",
                "TheWolfOfWallStreet.jpg"));

    }

    public ArrayList<Film> getFilms() {
        return films;
    }
}
