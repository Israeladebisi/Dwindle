/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwindle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author YuTsai
 */
public class Dwindle {

    /**
     * @param args the command line arguments
     */
    public static EventDeck mainDeck = new EventDeck();
    
    public static void main(String[] args) throws IOException{
        
        StartScreen  ss = new StartScreen();
        ss.setVisible(true);
        
        //System.out.println(EventDeck.currentCard.getStory());
        //System.out.println(System.getProperty("/library/101.txt"));
        //System.out.println(new File("sal.html").getAbsolutePath());
        
        //System.out.println(testing.getTitle());
        //System.out.println(mainDeck.currentCard);
 
    }
    
}

