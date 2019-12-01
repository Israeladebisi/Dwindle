package dwindle;

import java.io.*;
import java.util.*;

/**
 * @author YuTsai
 */
public class EventDeck {
    
    public static EventCard currentCard;
    public static BufferedReader Buff;
    
    public static ArrayList<EventCard> eventDeck;
    
    //constructor
    public EventDeck() throws IOException{        
        eventDeck = new ArrayList<>();
        String currentDirectory = System.getProperty("user.dir");
        
        //Create event cards and add them to the deck
        for(int i = 0; i < 8; i++){ 
            
            //read in the files and make them cards
            Buff = new BufferedReader(new FileReader(currentDirectory + "/src/library/" + (101+i) + ".txt"));           
            eventDeck.add(new EventCard(Buff));
        }
    }

    /**
    * Removes the last card from the deck and returns it 
    * 
    * @return   EventCard
    */
    public EventCard deal(){          
        int i = eventDeck.size()-1;
        EventCard drawn = eventDeck.remove(i);
        return drawn;
    }                   
}
