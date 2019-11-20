package dwindle;

import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author YuTsai
 */
public class EventCard{
    
    public static String[] foundTriggers = new String[40]; 
    public String title = "";
    public String story = "";
    public String option1 = "";
    public String option2 = "";
    public String option3 = "";
    public String option4 = "";
    public String reaction1 = "";
    public String reaction2 = "";
    public String reaction3 = "";
    public String reaction4 = "";
    public int mechAmount1 = 0;
    public int mechAmount2 = 0;
    public int mechAmount3 = 0;
    public int mechAmount4 = 0;
    public String mech1 = "";
    public String mech2 = "";
    public String mech3 = "";
    public String mech4 = "";
    public String triggerWords = "";
    
    public EventCard(BufferedReader Buff)throws IOException{

        title = Buff.readLine();
        story = Buff.readLine();
        option1 = Buff.readLine();
        option2 = Buff.readLine();
        option3 = Buff.readLine();
        option4 = Buff.readLine();
        reaction1 = Buff.readLine();
        reaction2 = Buff.readLine();
        reaction3 = Buff.readLine();
        reaction4 = Buff.readLine();
        mechAmount1 = Integer.valueOf(Buff.readLine());
        mechAmount2 = Integer.valueOf(Buff.readLine());
        mechAmount3 = Integer.valueOf(Buff.readLine());
        mechAmount4 = Integer.valueOf(Buff.readLine());
        mech1 = Buff.readLine();
        mech2 = Buff.readLine();
        mech3 = Buff.readLine();
        mech4 = Buff.readLine();
        triggerWords = Buff.readLine();     
    }
    
    /*
        getters
    */
    public String getTitle(){     
        return title;
    }
    public String getStory(){
        return story;
    }
    public String getOption1(){
        return option1;
    }
    public String getOption2(){
        return option2;
    }
    public String getOption3(){
        return option3;
    }
    public String getOption4(){
        return option4;
    }
    public String getReaction1(){
        return reaction1;
    }
    public String getReaction2(){
        return reaction2;
    }
    public String getReaction3(){
        return reaction3;
    }
    public String getReaction4(){
        return reaction4;
    }    
    public int getMechAmount1(){
        return mechAmount1;
    }
    public int getMechAmount2(){
        return mechAmount2;
    }
    public int getMechAmount3(){
        return mechAmount3;
    }
    public int getMechAmount4(){
        return mechAmount4;
    }
    public String getMech1(){
        return mech1;
    }
    public String getMech2(){
        return mech2;
    }
    public String getMech3(){
        return mech3;
    }
    public String getMech4(){
        return mech4;
    }  
    public String getTriggerWords(){
        return triggerWords;
    }   
}
