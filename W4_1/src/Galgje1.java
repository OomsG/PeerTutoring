import java.util.Scanner;

public class Galgje1 {
    public static void main(String[] args) {
        String word;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Geef een woord (max 10 letters): ");
            word = keyboard.nextLine();
        } while (word.length() < 5 || word.length() > 10);

        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        System.out.print("Het te zoeken woord: ");

        for (int i = 0; i < word.length(); i++) {
            System.out.print(".");
        }

        System.out.print("\nDoe een gok: ");
        String guess = keyboard.nextLine();
        int counter = 1;

        while (!guess.equals(word) && counter != 5) {
            System.out.print("Fout! Doe een gok: ");
            guess = keyboard.nextLine();
            counter++;
        }

        if (guess.equals(word)) {
            System.out.printf("Proficiat, je hebt het woord geraden in %d beurten!", counter);
        } else {
            System.out.println("Helaas, het woord was: " + word);
        }
    }
}
