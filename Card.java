public class Card {

    // attributes
    private int number;
    private int color;
    private int value;

    // constructors
    public Card(int number, int color, int value) {
        this.number = number;
        this.color = color;
        this.value = value;
    }

    // getters
    public int getNumber() {
        return number;
    }
    public int getColor() {
        return color;
    }
    public int getValue() {
        return value;
    }

    // setters
    public void setNumber(int number) {
        this.number = number;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public void setValue(int value) {
        this.value = value;
    }

}