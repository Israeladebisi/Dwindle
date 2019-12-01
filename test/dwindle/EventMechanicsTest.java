
package dwindle;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Israel
 */
public class EventMechanicsTest {
    
    EventDeck testDeck;
    EventCard testCard;
    String factor = "Health";
    int value = -2;
    
    @Before
    public void EventMechanicsTest() throws IOException{
        testDeck = new EventDeck();
        testCard = testDeck.deal();
    }
    
    @Test
    public void testAChoice() {
        assertEquals(factor,testCard.getMech1()); 
        assertEquals(value,testCard.getMechAmount1());
    }
}
