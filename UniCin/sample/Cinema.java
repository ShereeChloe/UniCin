package sample;

//import org.json.JSONArray;
//import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    ArrayList<Theatre> theatres = new ArrayList<>();

//    public Cinema() {
//        JSONObject theatreData = new JSONObject(getJSONFromFile());
//
//        JSONArray theatreArray = new JSONArray("theatres");
//
//        for (int i = 0; i < theatreArray.length(); i++) {
//            JSONObject theatreObject = theatreArray.getJSONObject(i);
//
//            Theatre theatre = new Theatre();
//            theatre.setTheatreName(theatreObject.optString("name"));
//        }
//
//    }
//}

//    private String getJSONFromFile()
//    {
//        String json = "";
//
//        try (Scanner scanner = new Scanner(new File("/TheatreInfo.txt"))) {
//
//            while (scanner.hasNext())
//                json += scanner.next();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(json);
//
//        return json;
//    }
}
