package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: 9/22/2023
 * Assignment: 2.3.4: Calculations3
 * Purpose: To learn how to create methods by solving calculations.
 * 
 */

import java.util.Scanner;

public class Calculations3
{
    // Output header information.
    public static void main(String[]args) {
        System.out.println("\nName/Programmer: I love Kotoha" 
            + "\nDate: 9/22/2023" 
            + "\nAssignment: 3.2.1: Calculations3" 
            + "\nPurpose: To learn how to create methods by solving calculations."
            + "\n*****************************************************************\n");
    
        // Initialize variables.
        Scanner keyboard = new Scanner(System.in);
        double rectLength;
        double rectWidth;
        double circleRadius;
        double triangleBase;
        double triangleHeight;
        double footVar;
        double meterVar;
        double celsiusVar;
        double fahrenVar;
        
        // Start of Program
        System.out.print("What is the length of the rectangle? ");
        rectLength = keyboard.nextDouble();
        System.out.print("What is the width of the rectangle? ");
        rectWidth = keyboard.nextDouble();
        System.out.printf("The perimeter of a rectangle with a length of "
            +rectLength+" and a width of "+rectWidth+" is: %.2f"
            ,rectanglePerimeter(rectLength,rectWidth));
        System.out.printf("\nThe area of a rectangle with a length of "
            +rectLength+" and a width of "+rectWidth+" is: %.2f"
            ,rectangleArea(rectLength,rectWidth));
        
        System.out.print("\nWhat is the radius of the circle? ");
        circleRadius = keyboard.nextDouble();
        System.out.printf("The circumference of a circle with a radius of "
            +circleRadius+" is: %.2f",circleCircumference(circleRadius));
        System.out.printf("\nThe area of a circle with a radius of "
            +circleRadius+" is: %.2f\n",circleArea(circleRadius));
        
        System.out.print("What is the base of the triangle? ");
        triangleBase = keyboard.nextDouble();
        System.out.print("What is the height of the triangle? ");
        triangleHeight = keyboard.nextDouble();
        System.out.printf("The area of a triangle with a base of "
            +triangleBase+" and a height of "+triangleHeight+" is: %.2f\n"
            ,triangleArea(triangleBase,triangleHeight));
        
        System.out.print("What is the length of your object in feet? ");
        footVar = keyboard.nextDouble();
        System.out.printf(footVar+" feet converted to meters is: %.2f"
            ,feetToMeters(footVar));
        
        System.out.print("\nWhat is the length of your object in meters? ");
        meterVar = keyboard.nextDouble();
        System.out.printf(meterVar+" meters converted to feet is: %.2f"
            ,metersToFeet(meterVar));
        
        System.out.print("\nWhat is the temperature of your object in celsius? ");
        celsiusVar = keyboard.nextDouble();
        System.out.printf(celsiusVar+" degrees celsius converted to fahrenheit"
            +" is: %.2f",celsiusToFahrenheit(celsiusVar));
        
        System.out.print("\nWhat is the temperature of your object in fahrenheit? ");
        fahrenVar = keyboard.nextDouble();
        System.out.printf(fahrenVar+" degrees fahrenheit converted to celsius"
            +" is: %.2f",fahrenheitToCelsius(fahrenVar));
        
    }
    
    // Calculates the perimeter of a rectangle.
    // Accepts a double input for Length and Width.
    public static double rectanglePerimeter(double length, double width) {
        return 2*(length+width);
    }
    // Calculates the area of a rectangle.
    // Accepts a double input for Length and Width.
    public static double rectangleArea(double length, double width) {
        return length*width;
    }
    // Calculates the circumference of a circle.
    // Accepts a double input for the radius.
    public static double circleCircumference(double radius) {
        return 2*Math.PI*radius;
    }
    // Calculates the area of a circle.
    // Accepts a double input for the radius.
    public static double circleArea(double radius) {
        return Math.PI*radius*radius;
    }
    // Calculates the area of a triangle.
    // Accepts a double input for the base and height.
    public static double triangleArea(double base, double height) {
        return (base*height)/2;
    }
    // Converts feet into meters.
    // Accepts a double input for the initial length.
    public static double feetToMeters(double foot) {
        return foot/3.281;
    }
    // Converts feet into meters.
    // Accepts a double input for the initial length.
    public static double metersToFeet(double meter) {
        return meter*3.281;
    }
    // Converts feet into meters.
    // Accepts a double input for the initial temperature.
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }
    // Converts celsius into fahrenheit.
    // Accepts a double input for the initial temperature.
    public static double celsiusToFahrenheit(double celsius) {
        return ((celsius*9)/5)+32;
    }
}
