import java.util.ArrayList;
import java.util.Date;


/**
 * SOFE 2710 Assignment 2 
 * @author  Pujan Parikh 100654771
 */
public class Flight {    
    private String id;                     //Flight id
    private Date departureTime;       //Flight departureTime
    private Date arrivalTime;         //Flight arrivalTime
    Airport departureAirport;           //Flight departureAirport
    Airport arrivalAirport;             // Flight arrivalAirport
    Aircraft aircraft;                  // Flight aircraft

    /**
     * Object contructor 
     * @param id (String) - flight ID
     * @param departureTime (Date) - departure time of flight
     * @param arrivalTime (Date) - arrival time of flight
     * @param departureAirport (Airport) - deprature airport name
     * @param arrivalAirport (Airport) - airival airport name
     * @param aircraft (Aircraft) - name of aircraft
     */
    public Flight(String id, Date departureTime, Date arrivalTime, Airport departureAirport, Airport arrivalAirport,Aircraft aircraft) {
        this.id = id;
        this.departureTime.equals(departureTime);
        this.arrivalTime.equals(arrivalTime);
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.aircraft= aircraft;
    }
    /**
     * returns flight ID
     */
    public String getId() {
        return id;
    }
    /**
     * returns departure time
     */
    public Date getDepartureTime() {
        return departureTime;
    }
    /**
     * returns arrival time
     */
    public Date getArrivalTime() {
        return arrivalTime;
    }  
    /**
     * returns aircraft type
     */
    public Aircraft getAircraft() {
        return aircraft;
    }
    /**
     * converts all information about flight into a string
     * @return String - flight information
     */
    public String ConvertToString(){
        return this.getId() + "," + this.getAircraft().getName() + "," + this.getArrivalTime() + "," this.getDepartureTime;
    }
  }