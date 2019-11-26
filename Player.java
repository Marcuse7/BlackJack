import java.util.ArrayList;

public class Player {

    private int score;
    private ArrayList<Integer> mycards;
    
    public int getScore() {
        return score;
    }

    public void drawCard(Cards stack) {
        int newCard = stack.drawCard();
        mycards.add( newCard );
    }

    public void showCard() {
        System.out.println(mycards.toString());
    }

}