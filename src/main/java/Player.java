import java.util.ArrayList;

public class Player {

    ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<Card>();
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    public int numberOfCards() {
        return hand.size();
    }


    public void showHand() {
        for (Card card : hand) {
            System.out.println(card.getRank() + " " + card.getSuit());
        }
    }

    public int returnCard(int index) {
        return hand.get(index).getRank().getValue();
    }
}