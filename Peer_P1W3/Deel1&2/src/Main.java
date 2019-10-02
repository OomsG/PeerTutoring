import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double MIN_DONATIE = 0.45;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Heb je de laatste 4 maanden een tatoeage laten zetten? (J/N): ");
        char tattoo = keyboard.nextLine().charAt(0);

        if (tattoo == 'J') {
            System.out.println("Jammer, je komt niet in aanmerking om bloed te geven.");
        } else if (tattoo == 'N') {
            char gender;
            do {
                System.out.print("Ben je een man of vrouw (M/V): ");
                gender = keyboard.nextLine().charAt(0);
            } while (gender != 'M' && gender != 'V');

            if (gender == 'V') {
                System.out.print("Ben je zwanger? (J/N): ");
            } else {
                System.out.print("Heb je seksuele betrekkingen gehad met een andere man? (J/N): ");
            }

            char answer = keyboard.nextLine().charAt(0);

            if (answer == 'J') {
                System.out.println("Jammer, je komt niet in aanmerking om bloed te geven.");
            } else if (answer == 'N') {
                System.out.print("Wat is je leeftijd? ");
                int age = keyboard.nextInt();

                if (age < 18 || age > 71) {
                    System.out.println("Jammer, je komt niet in aanmerking om bloed te geven.");
                } else {
                    int lastTime = 0;

                    if (age > 66) {
                        System.out.print("Hoeveel jaren geleden heb je voor 't laatst bloed gegeven (0 voor nooit): ");
                        lastTime = keyboard.nextInt();

                        if (lastTime > 3) {
                            System.out.println("Jammer, je komt niet in aanmerking om bloed te geven.");
                        }
                    }

                    if (age < 66 || (lastTime < 3 && lastTime != 0)) {
                        System.out.print("Wat is je lengte (in m): ");
                        double height = keyboard.nextDouble();

                        System.out.print("Wat is je gewicht (in kg): ");
                        double weight = keyboard.nextDouble();

                        double volume = 0.0;
                        switch (gender) {
                            case 'M':
                                volume = 0.3669 * Math.pow(height, 3) + (0.03219 * weight + 0.6041);
                                break;
                            case 'V':
                                volume = 0.3561 * Math.pow(height, 3) + (0.03308 * weight + 0.1833);
                                break;
                        }

                        double maxDonation = volume * 0.13;
                        boolean allowed = maxDonation > MIN_DONATIE;

                        System.out.println("\nBloedvolume: " + volume);
                        System.out.println("Max donatie: " + maxDonation);
                        System.out.println("Min donatie: " + MIN_DONATIE);
                        System.out.println("Je mag " + (allowed ? "WEL" : "GEEN") + " bloed geven");

                        System.out.printf("\nBloedvolume: %5.2f ", volume);
                        for (int i = 0; i < volume * 10; i++) {
                            System.out.print("*");
                        }

                        System.out.printf("\nMax donatie: %5.2f ", maxDonation);
                        for (int i = 0; i < maxDonation * 10; i++) {
                            System.out.print("*");
                        }

                        System.out.printf("\nMin donatie: %5.2f ", MIN_DONATIE);
                        for (int i = 0; i < MIN_DONATIE * 10; i++) {
                            System.out.print("*");
                        }
                    }
                }
            }
        }
    }
}
