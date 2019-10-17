package golven;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Glenn Ooms
 * @version 1.0 17/10/2019 14:52
 */
public class GolvenGrafiek {
    private int aantal;
    private Random random;

    private Color[] kleuren = {Color.black,Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.RED};

    public GolvenGrafiek(int aantal) {
        this.aantal = aantal;
        this.random = new Random();
    }

    public void TekenGolven() {
        double min = 0;
        double max = 4;
        GrafiekWindow window = new GrafiekWindow(10, 6);
        Golf golf = new Golf();
        for (int i = 0; i < aantal; i++) {
            golf.setFrequentie(min + (max - min) * random.nextDouble());
            golf.setAmplitude(min + (max - min) * random.nextDouble());
            int r = random.nextInt(kleuren.length);
            for (double j = -5; j < 5; j += 0.001) {
                window.tekenPunt(j, golf.getYwaarde(j), kleuren[r]);
            }
        }
        window.toon();
    }
}
