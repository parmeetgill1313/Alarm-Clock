
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// **********************************************************************
// Programmer:          Parmeet Gill
// Class:               CS30S
//
// Assignment:          Intro to OOP Alarm Clock 
//
// Description:
//
// Input:
//
// Output:
// ***********************************************************************



public class clockClient {  // begin class
    
	public static void main(String args[]) {  // begin main
            
	// ***************declaration of constants **************
	
	// **************declaration of variables ***************
            
	// ************create objects ****************
            
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            Date dateobj = new Date();
            
            ProgramInfo progInfo = new ProgramInfo("Lab Ex 2", "Intro to OOP Alarm Clock");
            
            Clock clock1 = new Clock(df.format(dateobj), "10:16:00");
            Clock clock2 = new Clock(df.format(dateobj), "10:20:00");
            Clock clock3 = new Clock(df.format(dateobj), "10:26:00");
        
	// **********create input stream ****************
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** ********Print Banner **************
            System.out.println(progInfo.toString());
            
            System.out.println("Clock 1: \n" + clock1.toString());
        
            clock2.setTime("1:00:50");
            System.out.println("Clock 2: \n" + clock2.toString());
            
            clock3.advTime();
            clock3.setAlarm("1:10:50");
            System.out.println("Clock 3: \n" + clock3.toString());
		
	// *****************get input ******************
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// *************************processing ****************

	// ******************output *********************
       
	// ***************closing message ***************
	
		
	
	}  // end main	
}  // end class