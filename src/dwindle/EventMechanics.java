package dwindle;

/**
 *
 * @author Yu Tsai Su
 */
public class EventMechanics {
    public static String factor;
    public static int val;
   
    public void Choice1(){
        factor = EventDeck.currentCard.mech1;
        val = EventDeck.currentCard.mechAmount1;
        int temp = 0;
        
        if("Health".equals(factor)){
            Stats.increaseHealth(val);
        }
        else if("Resources".equals(factor)){
            if(val >= 0){
                Stats.addResources(val);
            }
            else{
                if(Math.abs(val) <= Stats.resources){
                    Stats.addResources(val);
                }
                else{
                    temp = Math.abs(Stats.resources + val);
                    Stats.setResources(0);
                    Stats.reduceHealth(temp);
                }
            }
            
        }
    }
    
    public void Choice2(){
        factor = EventDeck.currentCard.mech2;
        val = EventDeck.currentCard.mechAmount2;
        int temp = 0;
        
        if("Health".equals(factor)){
            Stats.increaseHealth(val);
        }
        else if("Resources".equals(factor)){
            if(val >= 0){
                Stats.addResources(val);
            }
            else{
                if(Math.abs(val) <= Stats.resources){
                    Stats.addResources(val);;
                }
                else{
                    temp = Math.abs(Stats.resources + val);
                    Stats.setResources(0);
                    Stats.reduceHealth(temp);
                }
            }
            
        }
    }
    
    public void Choice3(){
        factor = EventDeck.currentCard.mech3;
        val = EventDeck.currentCard.mechAmount3;
        int temp = 0;
        
        if("Health".equals(factor)){
            Stats.increaseHealth(val);
        }
        else if("Resources".equals(factor)){
            if(val >= 0){
                Stats.addResources(val);
            }
            else{
                if(Math.abs(val) <= Stats.resources){
                    Stats.addResources(val);
                }
                else{
                    temp = Math.abs(Stats.resources + val);
                    Stats.setResources(0);
                    Stats.reduceHealth(temp);
                }
            }
            
        }
    }
    
    public void Choice4(){
        factor = EventDeck.currentCard.mech4;
        val = EventDeck.currentCard.mechAmount4;
        int temp = 0;
        
        if("Health".equals(factor)){
            Stats.increaseHealth(val);
        }
        else if("Resources".equals(factor)){
            if(val >= 0){
                Stats.addResources(val);
            }
            else{
                if(Math.abs(val) <= Stats.getResources()){
                    Stats.addResources(val);
                }
                else{
                    temp = Math.abs(Stats.getResources() + val);
                    Stats.setResources(0);
                    Stats.reduceHealth(temp);
                }
            }
            
        }
    }
    
    /*
        Getters
    */
    public static int getValue(){
        return val;
    }
    
    public static String getFactor(){
        return factor;
    }
}
