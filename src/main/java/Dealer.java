import java.util.ArrayList;

public class Dealer {

    private ArrayList<Player> players;
    // This was made public for GameTest: dealer checks cards remaining in deck.
    public Deck deck;
    //3: Why does this need to be static?
    private static ArrayList<Card> dealerHand;
    private ArrayList<Integer> playerHands;


    public Dealer(ArrayList players, Deck deck) {
        this.players = players;
        this.deck = new Deck();
        dealerHand = new ArrayList<Card>();
        this.playerHands = playerHands;
    }

    public int numberOfCards() {
        return dealerHand.size();
    }

    //2: Static error here, resolved by changing dealerHand to static
    public static void addCardToHand(Card card) {
        dealerHand.add(card);
    }

    public int numberOfPlayers() {
        return players.size();
    }

    public void deal() {
        deck.shuffle();
        for (Player player : players) {
            Card card1 = deck.cards.get(0);
            Card card2 = deck.cards.get(1);
            deck.cards.remove(card1);
            deck.cards.remove(card2);
            player.addCardToHand(card1);
            player.addCardToHand(card2);
        }
        Card dealerCard1 = deck.cards.get(0);
        Card dealerCard2 = deck.cards.get(1);
        deck.cards.remove(dealerCard1);
        deck.cards.remove(dealerCard2);
        //1: Static error here, resolved by changing addCardToHand to static
        Dealer.addCardToHand(dealerCard1);
        Dealer.addCardToHand(dealerCard2);
    }

    public void showHand() {
        for (Card card : dealerHand) {
            System.out.println(card.getRank() + " " + card.getSuit());
        }
    }

    public String chooseWinner() {
        for (Player player : players) {
            int playerHand = player.hand.get(0).getRank().getValue() + player.hand.get(1).getRank().getValue();
            playerHands.add(playerHand);
        }
        int dealerHand = Dealer.dealerHand.get(0).getRank().getValue() + Dealer.dealerHand.get(1).getRank().getValue();
        for (int hand : playerHands) {
            if (dealerHand > hand) {
                return "Dealer Wins!";
            }
        }
        return "Player wins!";
    }
}
