import java.util.Scanner; 

class Play {
    public static void main(String[] args) {

        Participant dealer = new Participant();
        Participant player = new Participant();

        int drawCounterPlayer = 0; // limits how often the player draws cards
        int drawCounterDealer = 0; // limits how often the dealer draws cards

        // shuffles the card deck
        Stack.shuffle();

        // Player's turn
        while (drawCounterPlayer < 2) { // two cards given to player
            Card tempCard = Stack.giveCard(); // card extracted from stack
            player.takeCard(tempCard); // this very card given to player
            System.out.println(player.toString()); // print out hand
            System.out.println(player.getSum()); // print out sum
            // Code für Wert von Assen
            drawCounterPlayer++;
        }

        if (player.getSum() > 21) {
            System.out.println("Sorry. You lost!");
            // code for restarting game
        }

        // Dealer's turn
        while (drawCounterDealer < 2) { // two cards given to dealer
            Card tempCard = Stack.giveCard();
            dealer.takeCard(tempCard);
            System.out.println(dealer.toString());
            drawCounterDealer++;
        }

        if (dealer.getSum() > 21) {
            System.out.println("The dealer lost! You win!!!");
            // code for restarting game
        }

        boolean wannaDraw = true;
        while (wannaDraw) {
            Scanner playerChoice = new Scanner(System.in);
            char yesOrNo;
            System.out.print("Möchtest du eine Karte ziehen? Tippe j oder n: ");
            yesOrNo = playerChoice.next().charAt(0);
            if (yesOrNo == 'j') {
                Card tempCard = Stack.giveCard(); // card extracted from stack
                player.takeCard(tempCard); // this very card given to player
                System.out.println("Ok, hier kommt die nächste Karte:" + tempCard.getValue() + tempCard.getNumber() + tempCard.getColor());
            }
           
        }

    }
}                        