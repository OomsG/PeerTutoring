import golven.Golf;
import golven.GolvenGrafiek;
import golven.GrafiekWindow;

import java.awt.*;

/**
 * @author Glenn Ooms
 * @version 1.0 17/10/2019 14:34
 */
public class GolfTest {
    public static void main(String[] args) {
        //Deel 1
        /*
        Golf golf = new Golf();
        for (double i=1.5;i<=5;i+=.5){
            golf.setAmplitude(i);
            golf.setFrequentie(2.0);
            System.out.println(golf.toString());
        }
         */

        //Deel 2
        GolvenGrafiek graf = new GolvenGrafiek(3);
        graf.TekenGolven();
    }
}
