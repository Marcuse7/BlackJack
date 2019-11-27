import java.util.*;

public class Stack {

    // attributes
    //private static String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};
    //private static String[] colors = {"Kreuz", "Karo", "Herz", "Pik"};
    private static ArrayList<Card> cards = new ArrayList<>();

    public static void shuffle() {
    	// 6 x 52 Blatt (4 Sorten 2 bis Ass)
        int v;
    	int s = 0;
    	for (int d = 0; d < 6; d++) {
    		for (int c = 0; c < 4; c++) {
    			for (int n = 0; n < 13; n++) {
    				if (n < 9) {
    					v = n + 2;
    				} else if (n > 8 && n < 12) {
    					v = 10;
    				} else {
    					v = 11;
    				}
    				cards.add(new Card(n, c, v));
    				s++;
    			}
    		}
    	}

        /*
        Collections.shuffle(cards);

        for (Card c : cards) {
            System.out.println("Karte: " + colors[c.getColor()] + " " + numbers[c.getNumber()] + " - Wert: " + c.getValue());
        }
        System.out.println(s + " Karten gemischt");
        */
    }    

    public static Card giveCard() {
        int number = cards.get(0).getNumber();
        int color = cards.get(0).getColor();
        int value = cards.get(0).getValue();
        cards.remove(0);
        return new Card (number, color, value);
    }

}