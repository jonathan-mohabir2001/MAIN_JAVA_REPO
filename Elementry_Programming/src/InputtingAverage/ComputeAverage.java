package InputtingAverage;

import java.util.Scanner;
// SCANNER class imported. 
/*
This java program will accept multiple inputs from 
a user to determine the average of 4 numbers. 
 */
public class ComputeAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // scanner object created. 
        System.out.println("Please enter your 4 numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        System.out.println("You have entered:\n" + number1 + "" + "" + number2
                + "" + number3 + "" + number4);

        double average = number1 + number2 + number3 + number4 / 4;
        // statement above calculates the average of the 4 numbers 

        System.out.println("The average of your 4 numbers is:" + average);

    }

}
