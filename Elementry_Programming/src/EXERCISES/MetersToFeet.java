/*
This program will convert meters into feet. 

 */
package EXERCISES;
import java.util.Scanner; 


public class MetersToFeet {

    // one meter is = to  3.2786 feet. 
    
    
    public static void main(String[] args) {
    
     
        Scanner input = new Scanner(System.in); 
        // input object created. 
        System.out.println("Please enter the amount of meter or meters");
        double meterInput = input.nextDouble(); 
        System.out.println("Conversion into feet is underway... ");
        double conversion = meterInput * 3.2786; 
        double feet = conversion; 
        // conversion assigned the meter input and will enter 
        System.out.println(meterInput + "in feet is:" + feet);
        
    }
    
}
