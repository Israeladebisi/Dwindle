package dwindle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Israel
 */
public class ScavengeMechanicsTest {

    @Test
    public void testRestMech(){
        Stats.setHealth(1);      
        assertEquals(1,Stats.getHealth());
    }
}
