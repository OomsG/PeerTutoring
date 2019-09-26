import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int keuze = -1;
        double waarde;
        double uitkomst;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Conversie graden Celsius - Fahrenheit");
        System.out.println("=====================================");

        while (keuze != 0) {
            System.out.println("Welke conversie wens je te doen?");
            System.out.println("\t 1) °C naar °F");
            System.out.println("\t 2) °F naar °C");
            System.out.print("Uw keuze?");
            keuze = keyboard.nextInt();
            if (keuze == 1 ) {
                System.out.print("Geef de waarde in °C:");
                waarde = keyboard.nextInt();
                uitkomst = waarde * 9 / 5 + 32;
                System.out.println(waarde + "°C = " + uitkomst + "°F");
            } else if (keuze == 2) {
                System.out.print("Geef de waarde in °F:");
                waarde = keyboard.nextInt();
                uitkomst = (waarde - 32) * 5 / 9;
                System.out.println(waarde + "°F = " + uitkomst + "°C");
            }
        }

        System.out.println("Tot ziens!");
    }
}
