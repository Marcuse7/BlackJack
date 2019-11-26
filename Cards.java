public class Cards {

    // attributes
    private String Card;
    private int value;

    // constructors
    public Cards(String Card, int value) {
        this.Card = Card;
        this.value = value;
    }

    // getters
    public String getCard() {
        return Card;
    }
    public int getValue() {
        return value;
    }

    // setters
    public void setCard(String Card) {
        this.Card = Card;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public int drawCard() {
        return 11;
    }

}