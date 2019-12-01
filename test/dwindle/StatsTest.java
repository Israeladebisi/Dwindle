/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwindle;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Israel
 */
public class StatsTest {
    
    @Before
    public void setVariables (){
     Stats.setResourceDice(5);
     Stats.setResources(10);
     Stats.setDay(1);
     Stats.setHealth(10);
    }
    
    /**
     * Test of increaseDay method, of class Stats.
     */
    @Test
    public void testIncreaseDay() {
        System.out.println("increaseDay");
        int expResult = 2;
        int result = Stats.increaseDay();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testaddResourceDice() {
        System.out.println("addResourceDice");
        int var = 1;
        int expResult = 6;
        int result = Stats.addResourceDice(var);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testaddResources() {
        System.out.println("addResources");
        int var = 5;
        int expResult = 15;
        int result = Stats.addResources(var);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReduceHealth() {
        System.out.println("reduceHealth");
        int var = 5;
        int expResult = 5;
        int result = Stats.reduceHealth(var);
        assertEquals(expResult, result);
    }   
}
