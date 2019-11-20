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
        
        for(int i = 0; i < 8; i++){             
            Buff = new BufferedReader(new FileReader(currentDirectory + "/src/library/" + (101+i) + ".txt"));           
            eventDeck.add(new EventCard(Buff));
        }
    }

    public EventCard deal(){          
        int i = eventDeck.size()-1;
        EventCard drawn = eventDeck.remove(i);
        return drawn;
    }                   
}
