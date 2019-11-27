class Play {
    public static void main(String[] args) {

        Participant dealer = new Participant("Dealer");
        Participant player = new Participant("Player");

        int drawCounterPlayer = 0; // limits how often the player draws cards
        int drawCounterDealer = 0; // limits how often the dealer draws cards
        // int playerScore = 0; // the score of the player's cards
        // int dealerScore = 0; // the score of the dealer's cards

        Stack stack = new Stack();
        Card tempCard = new Card();

        // Player's turn
        while (drawCounterPlayer < 2) {
            tempCard = stack.giveCard();
            player.takeCard(tempCard);
            System.out.println(player.toString());
            drawCounterPlayer++;
        }

        if (player.getSum() > 21) {
            System.out.println("Sorry. You lost!");
            // code for restarting game
        }

        // Dealer's turn
        while (drawCounterDealer < 2) {
            tempCard = stack.giveCard();
            dealer.takeCard(tempCard);
            System.out.println(dealer.toString());
            drawCounterDealer++;
        }

        if (dealer.getSum() > 21) {
            System.out.println("The dealer lost! You win!!!");
            // code for restarting game
        }

        /*boolean wannaDraw = true;
        while (wannaDraw) {
            drawCard(card);
            showCard(card);
        }*/

    }
}                        