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
    public void playersCanPopulate() {
        assertEquals(1, players.size());
    }

    @Test
    public void dealerHasPlayers() {
        assertEquals(1, dealer.numberOfPlayers());
    }

    @Test
    public void dealerCanDealCards() {
        dealer.deal();
//        assertEquals( 2, player1.numberOfCards());
        assertEquals(2, dealer.numberOfCards());
    }

}
