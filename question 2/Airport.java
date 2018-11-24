import java.util.ArrayList;

/**
 * SOFE 2710 Assignment 2 
 * @author 100466561
 */
public class Airport {
    private String city;    //airport city
    private String country; //airport country
    private String id;      //airport id
    /**
     * Airport object constructor
     * @param city (String) - name of city the airport is in
     * @param country (String) - name of country the airport is in
     * @param id (String) - Airport ID code
     */
    public Airport(String city,String country, String id){        
        this.city = city;
        this.country = country;
        this.id = id;        
    }
    /**
     * gets city of airport
     * @return (String) - name of city
     */
    public String getAirportCity(){
        return city;
    }
    /**
     * gets country of airport
     * @return (String) - name of country
     */
    public String getAirportCountry(){
        return country;
    }    
    /**
     * gets ID code of airport
     * @return (String) - ID of city
     */
    public String getAirportId(){
        return id;
    }    
  
  

}