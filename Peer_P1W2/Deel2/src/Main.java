import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double begin;
        double eind;
        double fahr;
        int stap;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Conversietabel °C naar °F");
        System.out.println("=========================");
        System.out.print("Geef de begintemperatuur in °C:");
        begin = keyboard.nextInt();
        System.out.print("Geef de eindtemperatuur in °C:");
        eind = keyboard.nextInt();
        if (begin > eind) {
            System.out.println("De begintemperatuur moet kleiner zijn dan de eindtemperatuur!");
        } else {
            System.out.print("Geef de stapwaarde:");
            stap = keyboard.nextInt();

            System.out.println("===============");
            System.out.println("|  °C  |  °F  |");
            System.out.println("|-------------|");

            while (begin <= eind) {
                fahr = begin * 9 / 5 + 32;
                System.out.println(String.format("| %4.0f | %4.1f |", begin, fahr));
                begin += stap;
            }

            System.out.println("===============");
        }
    }
}
