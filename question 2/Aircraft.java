  /*
	SOFE 2710 Assignment 2 
	
 */
 
package airporttest;

import java.util.ArrayList;

/**
 *
 * @author  
 */
public class Aircraft {    
    private String name;            // Aircraft name
    private String state;           //Aircraft state : working/under repair
    private String flightState;     //landed/Airborme
    ArrayList<Pilots> pilots;       //list of all pilots for the aircraft

  public Aircraft(String name, String state, String flightState, ArrayList<Pilots> pilots) {
        this.name = name;
        this.state = state;
        this.flightState = flightState;
        this.pilots = pilots;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getFlightState() {
        return flightState;
    } 
   
}