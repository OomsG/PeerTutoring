package wijnen;

import java.time.LocalDate;

/**
 * PEER opdracht
 * P2W2
 */
public class Likeur extends Wijn{
    private double alcoholGehalte; //in procent


    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcoholGehatlte) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.alcoholGehalte = alcoholGehatlte;
    }


    @Override
    public double berekenPrijs() {
        if (alcoholGehalte*100>=50){
            return getBasisPrijs()*1.25;
        }else{
            return getBasisPrijs();
        }
    }

    @Override
    public String toString() {
        return String.format("%s --> %2.0f%s alc",super.toString(),alcoholGehalte*100,"%");
    }
}
