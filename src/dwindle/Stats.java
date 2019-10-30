/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwindle;

/**
 *
 * @author YuTsai
 */
public class Stats {
    
    /*
        Player Pertinent
    */
    public static int health;
    public static int resources;
    public static int resourceDice;
    
            
    /*
        Cycle Pertinent
    */
    public static int day;
    public static int dayLimit;
    
    //invisible and undisclosed morality variable
    public static int karma;
    
    
    
    
    
    /*
    This is the class that will hold all persistent stat values while the game is
    transisitoning from screen to screen
    
    Values include:
        Health
        Days Passed
        Resources
        Resource Dice
    
    Methods Needed:
        RollResourceDice
            Decrement one resource dice, add x amount to resources
    
        UpdateHealth(int n, int z)
            Increase health by n if z = 1, else decrease by n.
    
        UpdateDay()
            increase day counter by one.
    
        UpdateResources(int n, int z)
            Increase resources by n if z = 1, else decrease by n.
    */
}
