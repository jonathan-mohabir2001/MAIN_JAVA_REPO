/*
This program will convert miles to km 

*/
package EXERCISES;
import java.util.Scanner; 


public class MilesToKm {

    // 1 mile = 1.6 km. 
 
    public static void main(String[] args) {
    
        
        
        Scanner input = new Scanner(System.in); 
        // scanner object created. 
        System.out.println("Please enter your mile reading:");
        
        double miles = input.nextDouble(); 
        System.out.println("Calculation is being done below..."); 
        double conversion = miles * 1.6; 
        System.out.println(miles +" miles" + "In Kilometeres is:" +conversion + "km");
        
        
        
        
        
        
    }
    
}
