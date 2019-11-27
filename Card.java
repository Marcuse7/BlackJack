public class Card {

    // attributes
    private int number;
    private int color;
    private int value;
    private String cardName;
    private int symbol;


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

    public String toName() {


        //this.number;
        if (color == 1 || color == 2) {
            cardName = "\u001B[47m\u001B[31m";
        } else {
            cardName = "\u001B[47m\u001B[30m";
        }

        switch (color) {
            case 0:
                symbol = 0;
                break;
            case 1:
                symbol = 16;
                break;
            case 2:
                symbol = 32;
                break;
            case 3:
                symbol = 48;
                break;
        }
        
        cardName = cardName + new String(new int[] {0x1F0A1 + number + symbol}, 0, 1) + " \u001B[0m";

        return cardName;
    }
}