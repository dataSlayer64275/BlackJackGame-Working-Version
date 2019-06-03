import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        this.generateCards();
    }

    public void generateCards() {
        //loop Suit
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public int getCardCount() {
        return cards.size();
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card.getRank() + " " + card.getSuit());
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        //This part was used in the assertNotEquals attempt in the DeckTest
//        return cards;
    }

    public ArrayList<Card> cards() {
        return cards;
    }
}
