import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player1;
    Dealer dealer;
    ArrayList<Player> players;
    Deck deck;

    @Before
    public void setUp(){
        player1 = new Player();
        players = new ArrayList<Player>();
        players.add(player1);
        deck = new Deck();
        dealer = new Dealer(players, deck);
    }


    @Test
    public void dealerCanDealCards() {
        dealer.deal();
        assertEquals( 2, player1.numberOfCards());
        assertEquals(2, dealer.numberOfCards());
        //Which one is better here:
        assertEquals(48, dealer.deck.getCardCount());
//        assertEquals(48, dealer.getCardCount());
        player1.showHand();
        dealer.showHand();
    }

    @Test
    public void canChooseWinner() {
        dealer.deal();
        assertEquals("Dealer Wins!",dealer.chooseWinner());
        assertEquals("Player wins!",dealer.chooseWinner());

    }
}
