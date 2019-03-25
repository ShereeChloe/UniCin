package sample.Controllers;

import sample.Theatre;

import java.util.ArrayList;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class TheatreController {

    private ArrayList<Theatre> theatres = new ArrayList<>();

    public TheatreController() {

        theatres.add(new Theatre("Sir Patrick Stewart", 1, 200));
        theatres.add(new Theatre("Haslett", 2, 150));
        theatres.add(new Theatre("Sparck Jones", 3, 200));
        theatres.add(new Theatre("Bronte", 4, 100));
        theatres.add(new Theatre("Harold Wilson", 5, 150));
        theatres.add(new Theatre("Queen St", 6, 100));
        theatres.add(new Theatre("CockCroft", 7, 150));
        theatres.add(new Theatre("St Pauls", 8, 200));
        theatres.add(new Theatre("Joseph Priestly", 9, 100));
        theatres.add(new Theatre("Oastler", 10, 150));
    }

    public Theatre getTheatreById(int theaterNumber){

        for (Theatre theatre : theatres){
            if (theatre.getTheatreNumber() == theaterNumber){
                return theatre;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TheatreController tc = new TheatreController();
        System.out.println(tc.getTheatreById(6).getTheatreName());
    }
}
