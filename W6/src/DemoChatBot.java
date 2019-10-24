import java.util.Scanner;

public class DemoChatBot {
    public static void main(String[] args) {

//        ChatBot1 bot = new ChatBot1("Veronica"); // OEF 1
//        ChatBot2 bot = new ChatBot2("Veronica"); // OEF 2
//        ChatBot3 bot = new ChatBot3("Veronica"); // OEF 3
        ChatBot4 bot = new ChatBot4("Veronica"); // OEF 4
        Scanner scan = new Scanner(System.in);
        String antwoord;
        boolean check = true;
        int count = 0;
        long startTime =  System.currentTimeMillis();

        System.out.println(bot.toString());
        System.out.println("Tik \"stop\" om te eindigen");
        while (check = true) {
            antwoord = scan.nextLine();
            if (antwoord.equalsIgnoreCase("stop")) {
                System.out.println("Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van Veronica!");
                System.out.println();
                System.out.println("Factuur");
                System.out.printf("%-20s %s","Item","Prijs\n");
                System.out.println("==============================");
                System.out.printf("%-20s %s", "opstart","\u20ac10\n");
                long endTime = System.currentTimeMillis();
                int extra = (int)(endTime-startTime-60000)/15000;
                if (endTime-startTime>60000){
                    System.out.println("Extra Time:");
                    System.out.printf("%-20s %s",extra+"x15seconden","\u20ac"+ extra+"\n");
                }
                if (bot.getScheldCounter()>0){
                    System.out.printf("%-20s %s","Scheldboete","\u20ac"+bot.getScheldCounter()*5+"\n");
                }
                if (bot.getScheldCounter()>0&&extra>0){
                    System.out.printf("%-20s %s","TOTAAL","\u20ac"+(10+extra+bot.getScheldCounter()*5)+"\n");
                }else if(bot.getScheldCounter()>0){
                    System.out.printf("%-20s %s","TOTAAL","\u20ac"+(10+bot.getScheldCounter()*5)+"\n");
                }else if (extra>0){
                    System.out.printf("%-20s %s","TOTAAL","\u20ac"+(10+extra)+"\n");
                }else {
                    System.out.printf("%-20s %s","TOTAAL","\u20ac"+(10)+"\n");
                }

                System.out.println();
                System.out.println("Gelieve binnen de 2 uur te betalen.");
                check = false;
            } else {
                count++;
//              System.out.println(bot.antwoordOpVraagV1(antwoord)); // OEF 1
//              System.out.println(bot.antwoordOPVraagV2(antwoord)); // OEF 2
//              System.out.println(bot.antwoordOPVraagV3(antwoord,count)); // OEF 3
                System.out.println(bot.antwoordOPVraagV4(antwoord,count)); // OEF 4
            }
        }
    }
}
