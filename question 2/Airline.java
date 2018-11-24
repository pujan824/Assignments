import java.util.ArrayList;

/**
 * SOFE 2710 Assignment 2
 * @author 100466561
 */
public class Airline {
    private String id;              // airline id
    ArrayList<Flight> flights;      // list of fligths for this airline
    ArrayList<Aircraft> aircraft;   // list of aircraft for this airline
/**
 * Object Airline constructor
 * @param ID (String) - airline ID code
 * @param flights (Arraylist<Flight>) - list of flights at airport
 * @param aircraft (Arraylist<Aircraft>) - list of aircrafts at the airport
 */
    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft) {
        this.id = id;
        this.flights = flights;
        this.aircraft = aircraft;
    }
    /**
     * gets ID of airport
     * @return (String) - ID of airline
     */
    public String getId() {
        return id;
    }
    /**
     * gets list of flights
     * @return (Arraylist<Flight>) - list of all flights
     */
    public ArrayList<Flight> getFlights() {
        return flights;
    }
    /**
     * gets list of aircrafts
     * @return (Arraylist<Aircraft>) - list of all aircrafts
     */
    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }
    /**
     * add  an aircraft to an airline
     * If the aircraft is already owned by the airline then the method does nothing.
     * @param aircraft (Aircraft) - aircraft to add
     */
    
    public void owns(Aircraft aircraft){
       if (!this.aircraft.contains(aircraft))
    	  this.aircraft.add(aircraft);
           	
    } 
    /**
     * shows all flight information
     */
   public void printFlightByName(){
	   for (Flight f: flights){
		   System.out.println(f.getId() + " "+ f.getAircraft()+ " " + f.getArrivalTime() + " " + f.getDepartureTime());
	   }   
   } 
   
   
   /**
    * returns an ArrayList containing all pilots who are working in the with the given code. 
    * @param code (int) - pilot code needed
    * @return ar (ArrayList<Pilots>) - array of pilots with code needed
    */  
   public ArrayList<Pilots> pilotsWorkingForAirlines(int code){
         ArrayList<Pilots> ar = new ArrayList<Pilots>();
         for (Aircraft air : aircraft){
             for (Pilots pilot :  air.pilots){
                 if(pilot.getId() == code){
                     ar.add(pilot);
                 }
             }
         }
         return ar;
     }
   /**
    * returns flights departing at a specific time
    * @param airport (Airport) - airport object information
    * @param depratTime (Date) - time flights leave
    * @return list (ArrayList<Flights>) - list of flights
    */  
     public ArrayList<Flight> getDepartureFlightByAirport(Airport airport, String departTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
    	   for (int i=0; i<flights.size();i++){
	    	  if (flights.get(i).departureAirport.equals(airport) & (flights.get(i).getDepartureTime().equals(departTime)))
	    		   list.add(flights.get(i));
	       }  
	   
           return list;
     
     }   
   /**
    * returns flights arriving at a specific time
    * @param airport (Airport) - airport object information
    * @param arrivalTime (Date) - time flights arrive
    * @return list (ArrayList<Flights>) - list of flights
    */ 
     public ArrayList<Flight> getArrivalFlightByAirport(Airport airport, String arrivalTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
  	   for (int i=0; i<flights.size();i++){
	    	  if (flights.get(i).arrivalAirport.equals(airport) & (flights.get(i).getArrivalTime().equals(arrivalTime)))
	    		   list.add(flights.get(i));
	       }  
	   
         return list;
   
   }   



}