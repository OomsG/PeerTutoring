import java.util.Scanner;

public class Galgje3 {
    public static void main(String[] args) {
        final String HANGMAN =
                        "----- \n" +
                        "|   | \n" +
                        "|   O \n" +
                        "|  /|\\\n" +
                        "|   | \n" +
                        "|  / \\\n" +
                        "|      \n" +
                        "-------";
        String word;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Geef een woord (max 10 letters): ");
            word = keyboard.nextLine();
        } while (word.length() < 5 || word.length() > 10);

        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        StringBuilder builder = new StringBuilder();
        builder.append(".".repeat(word.length()));

        char guess;
        int counter = 0;

        while (!builder.toString().equals(word) && counter != 8) {
            System.out.printf("Het te zoeken woord: %s", builder.toString());

            System.out.print("\nRaad een letter: ");
            guess = keyboard.next().charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    builder.setCharAt(i, guess);
                }
            }

            counter++;

            System.out.println(HANGMAN.substring(0, 7 * counter));
        }

        if (builder.toString().equals(word)) {
            System.out.printf("Proficiat, je hebt het woord geraden in %d beurten!", counter);
        } else {
            System.out.println("Helaas, het woord was: " + word);
        }
    }
}
