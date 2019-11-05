package dwindle;

import java.io.*;
import java.util.*;

/**
 *
 * @author YuTsai
 */
public class EventDeck {
    
    public static EventCard currentCard;
    public static BufferedReader Buff;
    
    public static ArrayList<EventCard> eventDeck;
    
    public EventDeck() throws IOException{
        eventDeck = new ArrayList<>();
        for(int i = 1; i < 9; i++){
            String currentDirectory = System.getProperty("user.dir");
            Buff = new BufferedReader(new FileReader(currentDirectory + "/src/library/" + (100+i) + ".txt"));
            
            currentCard.assignValues(Buff);
            
            eventDeck.add(new EventCard(
                    EventCard.title, EventCard.story, EventCard.option1, 
                    EventCard.option2, EventCard.option3, EventCard.option4, EventCard.reaction1,
                    EventCard.reaction2, EventCard.reaction3, EventCard.reaction4, 
                    EventCard.mechAmount1, EventCard.mechAmount2, EventCard.mechAmount3, 
                    EventCard.mechAmount4, EventCard.mech1, EventCard.mech2, EventCard.mech3, 
                    EventCard.mech4, EventCard.triggerWords
                    ));

        }
    }
/*
    public void shuffle(){
        Collections.shuffle(eventDeck, new Random());
    }
*/ 
    public EventCard deal(){     
        //shuffle();      
        int i = eventDeck.size()-1;
        System.out.println(eventDeck.size());
        EventCard drawn = (EventCard)eventDeck.remove(i);
        System.out.println(eventDeck.size());
        return drawn;
    }
                   
}
