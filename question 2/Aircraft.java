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
/**
 * constructs aircraft object
 * @param name (String) - name of aircraft
 * @param state (String) - state of aircraft
 * @param flightState (String) - state of flight
 * @param pilots (ArrayList<Pilots>) - list of all pilots for aircraft
 */ 
  public Aircraft(String name, String state, String flightState, ArrayList<Pilots> pilots) {
        this.name = name;
        this.state = state;
        this.flightState = flightState;
        this.pilots = pilots;
    }
    /**
	 * gets name of aircraft
	 * @return name of aircraft
	 */
    public String getName() {
        return name;
    }
    /**
	 * gets state of aircraft
	 * @return state of aircraft
	 */
    public String getState() {
        return state;
    }
    /**
	 * gets flight state of aircraft
	 * @return flight state of aircraft
	 */
    public String getFlightState() {
        return flightState;
    } 
    /**
	 * Adds a pilot 
	 * @param pilot (pilot) - add pilot object
	 */
    public void joinPilot(Pilots pilot){
        pilots.add(pilot);
    }
    /**
     * print out list of pilots and info on aircraft
     */
    public void printPilot(){
        for (Pilots pilot : pilots){
            System.out.println(pilot.ConvertToString());
        }
    }
}