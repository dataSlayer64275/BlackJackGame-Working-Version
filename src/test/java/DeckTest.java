import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void testDeckCanGenerate() {
        assertEquals(52, deck.getCardCount());
    }

//    @Test
//    public void testDeckCanShuffle() {
//        ArrayList<Card> shuffledDeck = deck.shuffle();
//        assertNotEquals(deck.cards(),shuffledDeck);
//    }
}
