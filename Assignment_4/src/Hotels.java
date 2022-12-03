/*
Hotels class created below
Fields and accessors set. 
*/
public class Hotels {
    
    private String name; 
    private int rating; 
    private double price; 
    
    public Hotels(String name, int rating, double price){
        this.name=name; 
        this.rating = rating; 
        this.price = price;
    }
    // constructor created.
    
    //Accessors below 
    
    public String getName(){
        return name; 
    }
    public int getRating(){
        return rating; 
    }
    public double getPrice(){
        return price; 
    }
    
}
