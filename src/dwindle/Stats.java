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
    
    /*
        getters
    */
    public static int getDay(){
        return day;
    }
    
    public static int getDayLimit(){
        return dayLimit;
    }
    
    public static int getHealth(){
        return health;
    }
    
    public static int getResources(){
        return resources;
    }
    
    public static int getResourceDice(){
        return resourceDice;
    }
    
    /*
        setters
    */
    public static int setDay(int var){
        day = var;
        return day;
    }
    
    public static int setDayLimit(int var){
        dayLimit = var;
        return dayLimit;
    }
    
    public static int setHealth(int var){
        health = var;
        return health;
    }
    
    public static int setResources(int var){
        resources = var;
        return resources;
    }
    
    public static int setResourceDice(int var){
        resourceDice = var;
        return resourceDice;
    }
    
    /*
        Stats increment and decrement methods
    */
    public static int increaseDay(){
        day ++;
        return day;
    }
    
    public static int addDayLimit(int var){
        dayLimit += var;
        return dayLimit;
    }
    
    public static int increaseHealth(int var){
        health += var;
        return health;
    }
    
    public static int addResources(int var){
        resources += var;
        return resources;
    }
    
    public static int addResourceDice(int var){
        resourceDice += var;
        return resourceDice;
    }

    public static int reduceHealth(int var){
        health -= var;
        return health;
    }
}
