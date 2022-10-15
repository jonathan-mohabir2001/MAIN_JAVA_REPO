package General;

import java.util.Scanner;
// Scanner class imported. 

public class Computations {

    /* this java File will contain practise for all concepts learned within 
   this mornings session. 
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // object of the scanner class is created above. 

        // determining area of a rectangle below. 
        System.out.println("Please enter the length and width:");
        double width = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("Your width is:" + "" + width);
        System.out.println("Your length is:" + "" + length);
        System.out.println("Area of your rectangle is below:\n");
        double area = length * width;
        System.out.println("Area = " + area);

        System.out.println("Below will be some calculating the average of numbers");
        System.out.println("Enter your number 1");
        double firstNum = input.nextDouble();
        System.out.println("Enter your number 2");
        double secondNum = input.nextDouble();
        System.out.println("Enter your number 3");
        double thirdNum = input.nextDouble();
        System.out.println("Enter your number 4");
        double fourthNum = input.nextDouble();
        System.out.println("Your numbers have been recorded, below is the average");

        double average = firstNum + secondNum + thirdNum + fourthNum / 4;
        // average assigned the 1-4 number values then divided by 4; 

        System.out.println("Average = " + average);

    }

}
