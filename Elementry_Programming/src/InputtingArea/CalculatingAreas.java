package InputtingArea;

import java.util.Scanner;
// TO WORK WITH INPUTS, THE SCANNER CLASS NEEDS TO BE IMPORTED FROM UTIL CLASS

/*
Calculating Area using the scanner class. 

Java relies on this class to determine inputs 
and outputs. 

System.in is used for the input. 
System.out is used for the output. 

 */
// AREA OF CIRCLE AND AREA OF RECTANGLE WILL BE DONE USING SYSTEM.IN for lengths
public class CalculatingAreas {

    public static void main(String[] args) {

        /*
        Task list: 
        
        Declare needed variables. 
        
        Prompt user to enter lengths of radius and length and width
        
        Do calculation necessary for the area of the shape.
        
        Display result 
         */
        double circleArea;
        double pi = 3.14156;
        double rectangleArea;
        // variables declared and ready to use. 

        Scanner input = new Scanner(System.in);
        // an object of the scanner class is created. 
        // Named input and assigend the property IN of the system class. 

        System.out.println("Please enter the radius of the circle:");
        double radius = input.nextDouble();
        //radius is assigned to the input object. 
        circleArea = radius * radius * pi;
        System.out.println("The area of a cricle is:" + circleArea);

        System.out.println("Please enter the width of your rectangle");
        double width = input.nextDouble();
        // width assigned to a double value taken by the input object
        System.out.println("Please enter the length of your rectange:");
        double length = input.nextDouble();
        // the length variable is assigned the input object of double. 

        rectangleArea = width * length;
        // rectangleArea assigned value of width and length. 
        System.out.println("The area of the rectangle is:" + rectangleArea);
    }

}
