package dwindle;

import java.io.IOException;

/**
 * @author YuTsai
 */
public class Dwindle{
    
    //create game deck
    public static EventDeck deck;
    
    public static void main(String[] args) throws IOException{   
        deck = new EventDeck();        
        
        StartScreen  ss = new StartScreen();
        ss.setVisible(true);
    }    
}
