public class Cards {

    // attributes
    private String card;
    private int value;

    // constructors
    public Cards(String card, int value) {
        this.card = card;
        this.value = value;
    }

    // getters
    public String getCard() {
        return card;
    }
    public int getValue() {
        return value;
    }

    // setters
    public void setCard(String Card) {
        this.card = card;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public static int drawCard() {
        return 11;
    }


}