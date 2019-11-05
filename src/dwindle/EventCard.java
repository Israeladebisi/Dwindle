package dwindle;

import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author YuTsai
 */
public class EventCard{
    
    public static String[] foundTriggers = new String[40];
    
    public static String title = "";
    public static String story = "";
    public static String option1 = "";
    public static String option2 = "";
    public static String option3 = "";
    public static String option4 = "";
    public static String reaction1 = "";
    public static String reaction2 = "";
    public static String reaction3 = "";
    public static String reaction4 = "";
    public static int mechAmount1 = 0;
    public static int mechAmount2 = 0;
    public static int mechAmount3 = 0;
    public static int mechAmount4 = 0;
    public static String mech1 = "";
    public static String mech2 = "";
    public static String mech3 = "";
    public static String mech4 = "";
    public static String triggerWords = "";
    
 
    public EventCard(String ctitle, String cstory, String coption1, String coption2, String coption3, String coption4, 
                     String creaction1, String creaction2, String creaction3, String creaction4, 
                     int cmechAmount1,  int cmechAmount2, int cmechAmount3, int cmechAmount4, 
                     String cmech1, String cmech2, String cmech3, String cmech4, String ctriggerWords){

        title = ctitle;
        story = cstory; 
        option1 = coption1; 
        option2 = coption2; 
        option3 = coption3; 
        option4 = coption4; 
        reaction1 = creaction1;
        reaction2 = creaction2; 
        reaction3 = creaction3; 
        reaction4 = creaction4;
        mechAmount1 = cmechAmount1; 
        mechAmount2 = cmechAmount2;
        mechAmount3 = cmechAmount3; 
        mechAmount4 = cmechAmount4; 
        mech1 = cmech1;
        mech2 = cmech2;
        mech3 = cmech3; 
        mech4 = cmech4; 
        triggerWords = ctriggerWords;
    }
    
    /*
        reads through file and assigns variables
    */
    public static void assignValues(BufferedReader Buff)throws IOException{
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
    public static String getTriggerWords(){
        return triggerWords;
    }   
}
