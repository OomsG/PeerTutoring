package wijnen;

import java.nio.channels.Channel;
import java.sql.SQLOutput;

/**
 * PEER opdracht
 * P2W2
 */
public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private Wijn[] wijnen = new Wijn[MAX_AANTAL];  //voorlopig gevuld met 10 null-objecten
    private String naam;
    private int aantal;

    public WijnHuis(String naam) {
        this.naam = naam;
    }

    public void voegWijnToe(Wijn wijn) {
        if (!zoekWijn(wijn)) {
            if (aantal <= MAX_AANTAL) {
                wijnen[aantal] = wijn;
                aantal++;
                System.out.println("Wijn toegevoegd");
            } else {
                System.out.println("Wijn niet toegevoegd, te veel wijnen ");
            }
        } else {
            System.out.println("Wijn niet toegevoed, naam bestaat al");
        }
    }

    public boolean zoekWijn(Wijn wijn) {
        for (Wijn w : wijnen) {
            if (w != null && w.getNaam().equalsIgnoreCase(wijn.getNaam())) {
                return true;
            }
        }
        return false;
    }

    public Wijn getOudsteWijn() {
        if (aantal == 0) {
            return null;
        } else {
            Wijn oudsteWijn = wijnen[0];
            for (Wijn w : wijnen) {
                if (w.getOogstDatum().isBefore(oudsteWijn.getOogstDatum())) {
                    oudsteWijn = w;
                }
            }
            return oudsteWijn;
        }
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

        StringBuilder wijnenTekst = new StringBuilder();
        StringBuilder champagneTekst = new StringBuilder();
        StringBuilder likeurenTekst = new StringBuilder();

        wijnenTekst.append("Wijnen: \n");
        champagneTekst.append("Champagnes: \n");
        likeurenTekst.append("Likeuren: \n");


        for (Wijn w : wijnen) {

            if (w.getClass() == Wijn.class) {
                wijnenTekst.append(String.format("\t%s\n", w.toString()));
            } else if (w.getClass() == Champagne.class) {
                champagneTekst.append(String.format("\t%s\n", w.toString()));
            } else if (w.getClass() == Likeur.class) {
                likeurenTekst.append(String.format("\t%s\n", w.toString()));
            } else {
                System.out.println("U mama");
            }
        }
        result.append(wijnenTekst).

                append(champagneTekst).

                append(likeurenTekst);
        return result.toString();
    }
}
