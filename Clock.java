/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmis141hw4anthonyargentored;

/*
* File: Clock.java
* Author: Anthony Argento
* Date: July 28, 2016
* Purpose: This class contians 5 methods which start and stop the clock
*           determine delta time between the start/stop events, pauses
*           to slow execution of program and a toString method for data
*           reporting.
*/     

//import required java.time.*
import java.time.*;

public class Clock {
  
//define class variables  
LocalTime startTime, endTime;
String deltaTime;

//method to start clock
public LocalTime setStart(){
    this.startTime = LocalTime.now();
    return startTime;
}

//method to stop clock
public LocalTime setStop(){
    this.endTime = LocalTime.now();
    return endTime;
}

//method to get delta time
public String getDelta(){
    deltaTime = Duration.between(startTime, endTime).toString();
    return deltaTime;
}

//method to slow execution of the program
public void pause (){
    try{
        Thread pause = new Thread();
        pause.start();

        Thread.sleep(80);
    } catch (InterruptedException x){
    }
}

//toString method 
@Override
public String toString(){
    return "The clock started at: " + startTime + "\nThe clock stopped at: " +
            endTime + "\nThe delta between these times was: " + deltaTime;
}

}//end class