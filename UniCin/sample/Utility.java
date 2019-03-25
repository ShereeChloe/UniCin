package sample;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by u1257802 on 25/03/2019.
 */
public class Utility {

    public Utility() {
    }

    public String formatCurrency(double amount){
            NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);
            final String formatString = "%-4s";

            return (String.format ( formatString, gb.format (amount)));
    }

//    public Effect purpleDropshadow(){
//        DropShadow ds = new DropShadow();
//        ds.setOffsetY(3.0f);
//        ds.setColor(Color.color(0.4f, 0.4f, 1.0f));
//        return effe
//    }

    public static void main(String[] args) {
        Utility u = new Utility();

        System.out.println(u.formatCurrency(2.00));
    }
}
