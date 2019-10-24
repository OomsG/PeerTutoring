import java.util.Arrays;
import java.util.Random;

public class ChatBot1 {

    private String name;
    private String[] antwoorden;
    private Random random;

    ChatBot1(String name) {
        this.name = name;
        this.antwoorden = new String[]
                {"Ok, probeer eerst al eens te herstarten",
                "Kan je het probleem eens herformuleren?",
                "En is dat al lang zo?",
                "Waarom heb je ons niet eerder gecontacteerd?",
                "Ik denk dat je dat zelf wel kan oplossen, niet?",
                "Die vraag heb ik nog niet vaak gehad!",
                "Sorry, ik was even bezig, kan je de vraag eens herhalen?",
                "Aha, gekend probleem, ik zoek het op en laat je iets weten.",
                "Sorry, daar heb ik niet direct een antwoord op. Wat nu?",
                "En dan?",
                "Dat zal wel, maar er zijn ergere dingen he.",
                "Hmm, die moet ik opzoeken. En wanneer deed dat zich juist voor?"};
        this.random = new Random();
    }

    @Override
    public String toString() {
        return String.format("Hallo, ik ben chatbot %s, stel me een vraag en ik geef je een oplossing!",name);
    }

    String antwoordOpVraagV1(String vraag){
        return antwoorden[random.nextInt(antwoorden.length)];
    }
}
