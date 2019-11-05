package dwindle;

/**
 * @author YuTsai
 */
public class ScavengeMechanics {
    public static int amount;
    
    
    /*
        80% chance of success, 2+1 max able to find
    */
    public void forestMech(){
        int chance = (int) (Math.random()*10+1);
        amount = (int) (Math.random()*2+1);
        
        if(chance <= 8){
            Stats.resourceDice += amount;
        }
        else{
            amount = 0;
        }
    }
    
    /*
        50% chance of success, 5+1 max able to find
    */
    public void suburbMech(){
        int chance = (int) (Math.random()*10+1);
        amount = (int) (Math.random()*5+1);
        
        if(chance <= 5){
            Stats.resourceDice += amount;
        }
        else{
            amount = 0;
        }
    }
    
    /*
        20% chance of success, 10+1 max able to find
    */
    public void cityMech(){
        int chance = (int) (Math.random()*10+1);
        amount = (int) (Math.random()*10+1);
        
        if(chance <= 2){
            Stats.resourceDice += amount;
        }
        else{
            amount = 0;
        }
    }
    
    /*
        100% regain 1 Health
    */
    public void restMech(){
        Stats.health += 1;
        amount = 999;
    }  
}
