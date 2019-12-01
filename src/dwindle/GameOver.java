package dwindle;

/**
 *
 * @author YuTsai
 */
public class GameOver {
    
    public static String gameOverCheck(){
        String result;
        
        if(Stats.getHealth() > 0 && Stats.getDay() == Stats.getDayLimit()){
            result = "You survived!";
        }
        else{
            result = "You died.";
        }
        return result;
    }
}
