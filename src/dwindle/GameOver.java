package dwindle;

/**
 *
 * @author YuTsai
 */
public class GameOver {
    
    public static String gameOverCheck(){
        String result;
        
        if(Stats.getHealth() > 0 && Stats.getDay() == Stats.getDayLimit()){
            result = "But You Survived!";
        }
        else{
            result = "You died.";
        }
        return result;
    }
}
