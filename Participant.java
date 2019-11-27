import java.util.ArrayList;

class Participant{

    private ArrayList<Card> cardsHand;

    public String toString(){
        String allCards = "";

        for (Card card: cardsHand){
        allCards = allCards + card.toName();
        } // Ende for

        return allCards;
    } // Ende toString

    public int getSum(){
        int sum = 0;

        for (Card card: cardsHand){
            sum = sum + card.getValue();
        } // Ende for
        
        return sum;
    } // Ende getSum

    public void takeCard(Card card){
        cardsHand.add(Stack.giveCard());

    } // Ende takeCard



} // Ende class