class Game {
    public static void main(String[] args) {

        Dealer dealer = new Dealer("Dealer");
        Player player = new Player("Player");

        int drawCounterPlayer = 0; // limits how often the player draws cards
        int drawCounterDealer = 0; // limits how often the dealer draws cards
        int playerScore = 0; // the score of the player's cards
        int dealerScore = 0; // the score of the dealer's cards


        // Player's turn
        while (drawCounterPlayer < 2) {
            drawCard(card);
            showCard(card);
            drawCounterPlayer++;
        }

        if (playerScore > 21) {
            System.out.println("Sorry. You lost!");
            // code for restarting game
        }

        // Dealer's turn
        while (drawCounterDealer < 2) {
            drawCard(card);
            showCard(card);
            drawCounterDealer++;
        }

        if (dealerScore > 21) {
            System.out.println("The dealer lost! You win!!!");
            // code for restarting game
        }

        boolean wannaDraw = true;
        while (wannaDraw) {
            drawCard(card);
            showCard(card);
        }

    }
}