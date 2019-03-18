package sample;

import java.util.ArrayList;

public class TheatreData {

    private ArrayList<Theatre> theatres;

    public TheatreData(){

        theatres = new ArrayList<>();

        theatres.add(new Theatre("Sparck Jones", 1, 200));
        theatres.add(new Theatre("Haslett", 2, 150));
        theatres.add(new Theatre("Sir Patrick Stewart", 1, 250));
    }



}
