import java.util.Scanner; 

class Play {
    public static void main(String[] args) {

        Participant dealer = new Participant();
        Participant player = new Participant();

        int drawCounterPlayer = 0; // limits how often the player draws cards
        int drawCounterDealer = 0; // limits how often the dealer draws cards
        // int playerScore = 0; // the score of the player's cards
        // int dealerScore = 0; // the score of the dealer's cards

        Stack.shuffle();

        // Player's turn
        while (drawCounterPlayer < 2) {
            Card tempCard = Stack.giveCard();
            player.drawCard(tempCard);
            System.out.println(player.toString());
            // Code für Wert von Assen
            drawCounterPlayer++;
        }

        if (player.getSum() > 21) {
            System.out.println("Sorry. You lost!");
            // code for restarting game
        }

        // Dealer's turn
        while (drawCounterDealer < 2) {
            Card tempCard = Stack.giveCard();
            dealer.drawCard(tempCard);
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
            yesOrNo = playerChoice.nextChar();
            if (yesOrNo == "j") {
                Participant.drawCard();
                System.out.println("Ok, hier kommt die nächste Karte:" + Card.value + Card.number + Card. color);
            }
           
        }

    }
}                        