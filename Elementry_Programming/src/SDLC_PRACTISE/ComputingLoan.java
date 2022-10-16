/*
The SDLC 
- determine the requirements 
- Do an analysis for the system 
- Design the system. 
- Implement the system 
- Test 
- Deploy 
- Maintain


 */
package SDLC_PRACTISE;

import java.util.Scanner;
// scanner object imported 

/**
 * STEP 01, Requirements This system will need:
 *
 * Let user enter the interest rate Let user enter Loan amount Let user enter
 * the number of years for which payments will be made
 *
 * OUTPUT WILL BE - The monthly payments and total payment
 */

/*
STEP 2, SYSTEM NEEDS 

create code to caluclate the monthly, and total 

Monthly Payment = loanAmount * monthly Interest rate / 1 
                  / 1 - (1 + monthlyInterestRate, numberofYears * 12 )
Total payment = Monthly Payment * numberOfYears * 12; 

 */
public class ComputingLoan {

    public static void main(String[] args) {
        System.out.println("We will calculate your payments:");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the annual interest rate: 7.23,6.25");
        double annualInterestRate = input.nextDouble();
        // annual interest rate inputted by user. 
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.println("Monthly interest rate is:" + monthlyInterestRate);
        System.out.println("Please enter the number of years for loan:");
        int numOfYears = input.nextInt();
        // integer holding the number of years. 
        System.out.println("Please enter your loan amount:");
        double loanAmount = input.nextDouble();
        // loan ammount stored. 

        //calculation of payments: 
        double monthlyPayment
                = loanAmount * monthlyInterestRate
                / (1 - 1
                / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
        
        double totalPayment = monthlyPayment * numOfYears * 12; 

        
        System.out.println("Monthly payment is $:" + (int)(monthlyPayment * 100)/100);
        System.out.println("Total payment is$:" + (int) (totalPayment * 100)/100);
    }

}
