
package HotelPackage;


// this class contains fields to represent sections of the hotels.txt file 


public class Hotel {
    private String hotelName; 
    private int  rating; 
    private double price; 
    private String  perNight; 
    // fields set to match each description for the hotel 
    
    public Hotel (String hotelName, int rating, double price, String perNight){
        this.hotelName = hotelName; 
        this.rating = rating; 
        this.price = price; 
        this.perNight = perNight; 
    }
    // constructor created. 
}
