/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmis141hw4anthonyargentored;

/*
* File: CMIS141HW4AnthonyArgentoRed.java
* Author: Anthony Argento
* Date: July 28, 2016
* Purpose: This program will accept arguments and call various methods to start
*           and stop a clock. Upon completion of the program the user will be
*           informed as to the delta time between the start and stop of the clock.
*/ 

//required imports
import java.time.*;

public class CMIS141HW4AnthonyArgentoRed {

    public static void main(String[] args) {
        
        //define time variables
        LocalTime startTime, endTime;
        String deltaTime;
        //define variables that will govern length of time programe will run
        int x = 0;
        int y = 0;
        
        //statements to ensure valid arguments are entered
        if (args.length > 0) {
            try{
                x = Integer.parseInt(args[0]);
                y = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
            	System.err.println("One or both of the input arguments is not"
                        + " an integer. \nPlease enter 2 valid integers."
                        + "\nNote: The greater the values the longer the program"
                        + " will run. \n10 and 10 will run for approx 10 seconds");
                System.exit(1);
            }
        } else { 
        	System.err.println("No entry is invalid. \nPlease enter 2 valid integers."
                    + " \nNote: The greater the values the longer the program"
                    + " will run. \ne.g. 10 and 10 will run for approx 10 sec");
            System.exit(1);
        }
        
	//intitialize new Clock   
        Clock javaClock = new Clock (); 
        
	//call javaClock start time method
        startTime = javaClock.setStart();
        
	// for loop to extend time program requires to execute
	for (int i = 0; i < x;i++){
             System.out.println("Processing " + i + "th iteration."); 
                for (int j = 0; j < y;j++){
                    javaClock.pause();
                }//end sub for loop
        } //end for loop

	//call javaClock stop time method	
        endTime = javaClock.setStop();
		
        //call javaClock get delta time method
        deltaTime = javaClock.getDelta();
        
	//report pertinent data (start/stop/delta times)
        System.out.println(javaClock.toString());
    }
    
}
