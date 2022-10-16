package TaxProgram;

import java.util.Scanner;
// scanner object imported from util package. 

/**
 *
 * This Program will calculate the sales tax and total price for an item entered
 * by the user.
 *
 */
public class CalculateTax {

    // input object created in order to store inputs coming from user

    // tax rate constant declared. 

    public static void main(String[] args) {
            double TAX_RATE = 0.13;
        Scanner input = new Scanner(System.in);
        String firstItem = "Toothpaste";
        // first item stored. 
        String secondItem = "Brush";
        System.out.println("Please enter the cost of:" + firstItem);
        double toothPasteCost = input.nextDouble();
        double taxCost1 = toothPasteCost * TAX_RATE; 
        System.out.println("The tax on:" + firstItem + "is" + taxCost1);
        double itemTotal = toothPasteCost + taxCost1; 
        System.out.println("Your total is:" + itemTotal);
    }

}
