import java.util.ArrayList;

public class Dealer {

    private ArrayList<Player> players;
    private Deck deck;
    //3: Why does this need to be static?
    private static ArrayList<Card> dealerHand;

    public Dealer(ArrayList players, Deck deck){
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
        dealerHand = new ArrayList<Card>();
    }

    public int numberOfCards() {
        return dealerHand.size();
    }

    //2: Static error here, resolved by changing dealerHand to static
    public static void addCardToHand(Card card){ dealerHand.add(card); }

    public int numberOfPlayers() {
        return players.size();
    }

    public void deal() {
        deck.shuffle();
        for (Player player : players ){
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


}
