import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testDeckCanShuffle() {
        deck.printCards();
        deck.shuffle();
        deck.printCards();
    }
}
