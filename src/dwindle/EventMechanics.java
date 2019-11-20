package dwindle;

/**
 *
 * @author Yu Tsai Su
 */
public class EventMechanics {
    public static String factor;
    public static int val;
   
    public void Choice1(){
        //factor = EventCard.getMech1();
        factor = EventDeck.currentCard.mech1;
        val = EventDeck.currentCard.mechAmount1;
        
        if("Health".equals(factor)){
            if(val < 0){
                Stats.health += val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
        else if("Resources".equals(factor)){
            if(val < 0){
                Stats.health += val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
    }
    
    public void Choice2(){
        factor = EventDeck.currentCard.mech2;
        val = EventDeck.currentCard.mechAmount2;
        
        if("Health".equals(factor)){
            if(val < 0){
                Stats.health += val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
        else if("Resources".equals(factor)){
            if(val < 0){
                Stats.health += val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
    }
    
    public void Choice3(){
        factor = EventDeck.currentCard.mech3;
        val = EventDeck.currentCard.mechAmount3;
        
        if("Health".equals(factor)){
            if(val < 0){
                Stats.health += val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
        else if("Resources".equals(factor)){
            if(val < 0){
                Stats.health += val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
    }
    
    public void Choice4(){
        factor = EventDeck.currentCard.mech4;
        val = EventDeck.currentCard.mechAmount4;
        
        if("Health".equals(factor)){
            if(val < 0){
                Stats.health += val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
        else if("Resources".equals(factor)){
            if(val < 0){
                Stats.health -= val;
            }
            else if(val >= 0){
                Stats.health += val;
            }
        }
    }
    
    
}
