/**
 * SOFE 2710 Assignment 2 
 * @author Pujan Parikh 100654771
 */

public class Pilots {
    private String name;   //pilot name
    private int id;        //pilot id 
	private String role;  //Captian, co-pilot, navigator 

    /**
     * Pilot constructor
     * @param name (String) - name of pilot
     * @param id (int) - id of pilot
     * @param role (String) - role of the pilot
     */
    public Pilots(String name, int id, String role) {
        this.name = name;
        this.id = id;
		this.role = role;
    }
    /**
     * returns name of pilot
     */
    public String getName() {
        return name;
    }
    /**
     * returns pilot ID
     */
    public int getId() {
        return id;
    }  

    /**
     * check if pilot is on flight 
     * @param aircraft (object aircraft) - aircraft that is being checked
     * @return (boolean) - if pilot is on or not
     */
    public boolean  isPilotForFlight(Aircraft aircraft){
        return aircraft.pilots.contains(this);
    }
    /**
     * returns all pilot information in a string
     */
    public String ConvertToString(){
        return this.role + "," + this.name + "," + this.id;
    }

        
}