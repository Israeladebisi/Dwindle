/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwindle;

import java.io.*;
import java.util.*;


/**
 *
 * @author YuTsai
 */
public class EventDeck {
    
    //public File file;
    public static EventCard currentCard;
    public static BufferedReader Buff;
    
    public static ArrayList<EventCard> eventDeck = new ArrayList();
    //private static ArrayList EventCard;

    //constructor    
    public EventDeck(){  
        for(int i = 0; i < 10; i++){  
            eventDeck.add(new EventCard(100+i+1));
            i++;
        }
    }
    
    //will pick an Event Card from the Event Deck at random to be the current card
    public EventCard loadRandomCard() throws IOException{
        //System.out.println("reached load random");
        
        //need to figure out how to adjust to just grab local file using relative path
        String currentDirectory = System.getProperty("user.dir");
        //System.out.println("The current working directory is " + currentDirectory);
        //Buff = new BufferedReader(new FileReader("/Users/YuTsai/NetBeansProjects/Dwindle/src/library/101.txt"));

        
        Random rand = new Random();
        int cardNum = (rand.nextInt(eventDeck.size())+1);
        System.out.println(cardNum);
        currentCard = eventDeck.get(rand.nextInt(cardNum));
        int cardNum2 = cardNum+100;
        
        Buff = new BufferedReader(new FileReader(currentDirectory + "/src/library/" + cardNum2 + ".txt"));
        
        currentCard.assignValues(Buff);
                
        eventDeck.remove(currentCard);
        return currentCard;
    }
    
    
    
    
    
    /*
    The Event Deck is the group of Event Cards that decides what scenario a player will
    go through during the current cycle. Currently, the plan is to use Arrays to hold the information required
    to construct each Event. The information will be written in a plain text file and read into the array.
    The event cards will be held in a Sorted List.
    
    Methods needed:
        LoadEventDeck()
            Take a given text file and convert it into a sorted list of arrays
    
        Shuffle();
            Randomize the order of a sorted list of arrays
        
        RemoveEventCard();
            When an event card has been loaded for the current cycle, it is removed from the array list
            to prevent accidently repeats in a single session.
    
        Triggers();
            Certain eventCards will have keywords that when checked at the end of each cycle, this function will record
            those "triggers" and will load in extra events based on if conditions are met.
            event cards to simulate adjacency and continuity. R
        
    */
}
