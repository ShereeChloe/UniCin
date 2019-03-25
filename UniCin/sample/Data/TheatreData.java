package sample.Data;

import sample.Theatre;

import java.util.ArrayList;

public class TheatreData {

    private ArrayList<Theatre> theatres;

    public TheatreData(){

        theatres = new ArrayList<>();

        theatres.add(new Theatre("Sparck Jones", 1, 200));
        theatres.add(new Theatre("Haslett", 2, 150));
        theatres.add(new Theatre("Sir Patrick Stewart", 3, 200));
        theatres.add(new Theatre("Bronte", 4, 100));
        theatres.add(new Theatre("Harold Wilson", 5, 150));
        theatres.add(new Theatre("Queen St", 6, 100));
        theatres.add(new Theatre("CockCroft", 7, 150));
        theatres.add(new Theatre("St Pauls", 8, 200));
        theatres.add(new Theatre("Joseph Priestly", 9, 100));
        theatres.add(new Theatre("Oastler", 10, 150));

    }

    public ArrayList<Theatre> getTheatres() {
        return theatres;
    }
}
