/* **********************************************************
 * Programmer:      Parmeet Gill
 * Class:           CS30S
 * 
 * Assignment:      Intro to OOP Alarm Clock 
 *
 * Description:     
 * *************************************************************
 */
 
 // import files here as needed

public class Clock {  // begin class
 	
 	// *********** class variables *********
     
                private String currentTime = "";
                private String alarmTime = "";
                
                private String input = "";
                private int time = 0;
                private int alarmSec = 0;
                
                private int hour = 0;
                private int second = 0;
                private int minute = 0;
                
                private int AlarmHour = 0;
                private int AlarmSecond = 0;
                private int AlarmMinute = 0;
                
 	// ********** instance variable **********
     
 	// ********** constructors ***********
                
           /***************************************************
            * Purpose:    
            * Interface:
            * in:         none
            * return      none
            ****************************************************/
            public Clock(){
                currentTime = "";
                alarmTime = "";
            }//end default constructors    
            
            /***************************************************
            * Purpose:    
            * Interface:
            * in:         current time (String)
            * return      none
            ****************************************************/
            public Clock(String a){
                String[] delim = a.split(":");
                hour = Integer.parseInt(delim[0]); 
                minute = Integer.parseInt(delim[1]);  
                second = Integer.parseInt(delim[2]);
                alarmTime = "";
            }//end default constructors    
            
            /***************************************************
            * Purpose:    
            * Interface:
            * in:         current time (string) and alarm time
            *             (string)
            * return      none
            ****************************************************/
            public Clock(String a, String b){
                String[] delim = a.split(":");
                hour = Integer.parseInt(delim[0]); 
                minute = Integer.parseInt(delim[1]);  
                second = Integer.parseInt(delim[2]);
                
                         delim = b.split(":");
                AlarmHour = Integer.parseInt(delim[0]); 
                AlarmMinute = Integer.parseInt(delim[1]);  
                AlarmSecond = Integer.parseInt(delim[2]);
            }//end default constructors 
            
 	// ********** accessors **********
            
            public String toString(){
                String alarmClock = hour + ":" + minute + ":" + second + "\n";
                alarmClock += AlarmHour + ":" + AlarmMinute + ":" + AlarmSecond + "\n";
                return alarmClock;
            }
           
            
 	// ********** mutators **********
        
        /***********************************
 	* purpose: set the time for the alarm
        *
        * Interface: 
        * in:       alarm (string)
        * return:   none
        //**********************************/
        
        public void setAlarm(String a) {
            String[] delim = a.split(":");
            AlarmHour = Integer.parseInt(delim[0]); 
            AlarmMinute = Integer.parseInt(delim[1]);  
            AlarmSecond = Integer.parseInt(delim[2]); 
        } //end setAlarm()
        
        /***********************************
 	* purpose: set the time
        *
        * Interface: 
        * in:       time (string)
        * return:   none
        //**********************************/
        
        public void setTime(String a) {
            String[] delim = a.split(":");
            hour = Integer.parseInt(delim[0]); 
            minute = Integer.parseInt(delim[1]);  
            second = Integer.parseInt(delim[2]); 
        } //end setTime()
        
        /***********************************
 	* purpose: set the time
        *
        * Interface: 
        * in:       time (string)
        * return:   none
        //**********************************/
        
        public void advTime() {
            second = second + 1;   
        } //end advTime()
        
 }  // end class