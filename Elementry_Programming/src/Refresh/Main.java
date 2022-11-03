/*
General practise to remember my  Java!
*/
package Refresh;

import java.util.Scanner;
// scanner class imported to use. 

public class Main {

    // variables declared to refer within the tester. 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // variable of scanner class created. 
        // variable specified to take in input from a user. 
        System.out.println("Calculating a Rectangle below...");
        System.out.println("");
        System.out.println("Please enter the length of the rectangle");
        double length = input.nextDouble();
        System.out.println("");
        System.out.println("Please enter the width of the rectangle. ");
        double width = input.nextDouble(); 
        System.out.println("");
        System.out.println("Area calculated below: \n");
         double area = length * width; 
         System.out.println("Area is: " + area);    
         
    }

}
