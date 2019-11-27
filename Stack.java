import java.util.*;

public class Stack {

    // attributes
    private static ArrayList<Card> cards = new ArrayList<>();
    
    public static void shuffle() {
        // 6 x 52 Blatt (4 Sorten 2 bis Ass)
        int v = 0;
        for (int d = 0; d < 6; d++) {
            for (int c = 0; c < 4; c++) {
                for (int n = 0; n < 14; n++) {
                    if (n != 11) {
                        if (n < 10) {
                           v = n + 1;
                        } else {
                           v = 10;
                        }
                        cards.add(new Card(n, c, v));
                    }
                }
            }
        }

        Collections.shuffle(cards);

    }    

    public static Card giveCard() {
        int number = cards.get(0).getNumber();
        int color = cards.get(0).getColor();
        int value = cards.get(0).getValue();
        cards.remove(0);
        return new Card (number, color, value);
    }


}