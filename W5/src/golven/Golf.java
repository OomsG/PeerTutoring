package golven;

/**
 * @author Glenn Ooms
 * @version 1.0 17/10/2019 14:36
 */
public class Golf {
    private double amplitude;
    private double frequentie;

    public Golf() {
        amplitude = 1.0;
        frequentie = 1.0;
    }

    @Override
    public String toString() {
        if (amplitude == 1) {
            return String.format("y= sin (%.2f x)", frequentie);
        } else if (frequentie == 1) {
            return String.format("y= %.2f sin (x)", amplitude);
        } else {
            return String.format("y= %.2f sin (%.2f x)", amplitude, frequentie);
        }
    }

    public void setAmplitude(double amplitude) {
        if (amplitude == 0) {
            System.out.println("mag niet 0 zijn, hebben 1.0 genomen");
            this.amplitude = 1.0;
        } else {
            this.amplitude = amplitude;
        }
    }

    public void setFrequentie(double frequentie) {
        if (frequentie == 0) {
            System.out.println("mag niet 0 zijn, hebben 1.0 genomen");
            this.frequentie = 1.0;
        } else {
            this.frequentie = frequentie;
        }
    }

    public double getYwaarde(double x) {
        return amplitude * Math.sin(frequentie * x);
    }
}
