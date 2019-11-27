import java.util.Scanner; 

class Play {
    public static void main(String[] args) {

        final String CARD_DOWN = " \u001B[47m\u001B[31m" + new String(new int[] {0x1F0A0}, 0, 1) + " \u001B[0m";

        Participant dealer = new Participant();
        Participant player = new Participant();

        int drawCounterPlayer = 0; // limits how often the player draws cards

        // shuffles the card deck
        Stack.shuffle();

        // Player's turn
        System.out.println("Player:");
        while (drawCounterPlayer < 2) { // two cards given to player
            Card tempCard = Stack.giveCard(); // card extracted from stack
            // System.out.println("Ok, hier kommt die nächste Karte:" + tempCard.getValue() + " - " + tempCard.getNumber() + " - " + tempCard.getColor());

            player.takeCard(tempCard); // this very card given to player
            System.out.print(player.toString()); // print out hand
            System.out.println(" " + player.getSum()); // print out sum
            // Code für Wert von Assen
            drawCounterPlayer++;
        }
        System.out.println();

        if (player.getSum() > 21) {
            System.out.println("Sorry. You lost!");
            // code for restarting game
        }

        // Dealer's turn
        System.out.println("Dealer:");
        Card tempCard = Stack.giveCard();
        dealer.takeCard(tempCard);
        System.out.print(dealer.toString());
        tempCard = Stack.giveCard();
        dealer.takeCard(tempCard);
        System.out.println(CARD_DOWN);
        System.out.println();
        
        if (dealer.getSum() > 21) {
            System.out.println("The dealer lost! You win!!!");
            System.out.println("Dealer:");
            System.out.print(dealer.toString());
            // code for restarting game
        }

        boolean wannaDraw = true;
        while (wannaDraw) {
            Scanner playerChoice = new Scanner(System.in);
            char yesOrNo;
            System.out.print("Möchtest du eine Karte ziehen? Tippe j oder n: ");
            yesOrNo = playerChoice.next().charAt(0);
            if (yesOrNo == 'j') {
                tempCard = Stack.giveCard(); // card extracted from stack
                player.takeCard(tempCard); // this very card given to player

                System.out.println("Ok, hier ist dein neues Blatt:");
                System.out.print(player.toString()); // print out hand
                System.out.println(" " + player.getSum()); // print out sum
                System.out.println();

                if (player.getSum() > 21) {
                    System.out.println("Sorry. You lost!");
                    wannaDraw = false;
                    // code for restarting game
                }

                //System.out.println("Ok, hier kommt die nächste Karte:" + tempCard.getValue() + tempCard.getNumber() + tempCard.getColor());
            } else {
                wannaDraw = false;
            }

        }
        
        // Dealer's turn
        System.out.println("Dealer:");
        System.out.print(dealer.toString());

        wannaDraw = true;
        while (wannaDraw) {
            if (dealer.getSum() >= 17) {
            System.out.println("The dealer stops");
            wannaDraw = false;
            }
            else if (dealer.getSum() <= 16) {
                tempCard = Stack.giveCard();
                dealer.takeCard(tempCard);
                System.out.print(dealer.toString());
                
                if (dealer.getSum() > 21) {
                    System.out.println("Du gewinnst mit " + player.getSum() + " " + dealer.getSum());
            }
            if (tempCard.getNumber() == 0 && (dealer.getSum() + 11) >= 17 && (dealer.getSum() + 11) <= 21) {
                wannaDraw = false;
            }
            System.out.print(dealer.toString());
            }

        if (player.getSum() > dealer.getSum()) {
            System.out.println("Du gewinnst mit " + player.getSum() + " zu " + dealer.getSum());
            wannaDraw = false;
        }
        else if (player.getSum() < dealer.getSum()) {
            System.out.println("Du verlierst mit " + dealer.getSum() + " zu " + player.getSum());
            wannaDraw = false;
        }
        else {

        }

        }
    }
}                        