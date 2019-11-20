package dwindle;

/**
 *
 * @author YuTsai
 */
public class GameOver {
    public static String gameOverCheck(){
        String result;
        
        if(Stats.health > 0 && Stats.day == Stats.dayLimit){
            result = "You survived!";
        }
        else{
            result = "You died.";
        }
        return result;
    }
}
