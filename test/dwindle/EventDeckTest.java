/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwindle;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class EventDeckTest {
    
    EventDeck testDeck, anotherDeck;

    public EventDeckTest() throws IOException {
        this.testDeck = new EventDeck();
        this.anotherDeck = new EventDeck();
    }
 
    @Test
    public void DealShouldDrawFromOneDeck() {
        //Test shows Entire Game uses only one deck because of static ArrayList Deck
        System.out.println("deal");
        EventCard expResult = testDeck.deal();
        EventCard result = anotherDeck.deal();
        assertNotEquals(expResult.getTitle(), result.getTitle());
    }    
}
