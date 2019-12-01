package dwindle;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Israel
 */
public class GameOverTest {
    
    @Before
    public void setVariables (){
     Stats.setDayLimit(1);
     Stats.setDay(1);
     Stats.setHealth(10);
    }

    /**
     * Test of gameOverCheck method, of class GameOver.
     */
    @Test
    public void testGameOverCheck() {
        System.out.println("gameOverCheck");
        String expResult = "You survived!";
        String result = GameOver.gameOverCheck();
        assertEquals(expResult, result);
    }   
}