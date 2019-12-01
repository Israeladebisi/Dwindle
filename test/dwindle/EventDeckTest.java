package dwindle;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Israel
 */
public class EventDeckTest {
    
    EventDeck testDeck, anotherDeck;

    public EventDeckTest() throws IOException {
        this.testDeck = new EventDeck();
        this.anotherDeck = new EventDeck();
    }
 
    @Test
    public void DealShouldDrawFromOneDeck() {
        //Test shows Entire Game uses only one deck because of the static ArrayList Deck
        System.out.println("deal");
        EventCard expResult = testDeck.deal();
        EventCard result = anotherDeck.deal();
        assertNotEquals(expResult.getTitle(), result.getTitle());
    }    
}
