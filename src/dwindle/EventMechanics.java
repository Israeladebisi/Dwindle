package dwindle;

/**
 *
 * @author Yu Tsai Su
 */
public class EventMechanics {
    public static String factor;
    public static int val;
    
    public void Choice1(){
        factor = EventCard.mech1;
        val = EventCard.mechAmount1;
        
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
        factor = EventCard.mech2;
        val = EventCard.mechAmount2;
        
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
        factor = EventCard.mech3;
        val = EventCard.mechAmount3;
        
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
        factor = EventCard.mech4;
        val = EventCard.mechAmount4;
        
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
