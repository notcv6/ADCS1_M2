/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: 8/29/2023
 * Assignment: 2.3.4: Calculations3
 * Purpose: To solve some calculations.
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculations3
{
    // Output header information.
    public static void main(String[]args) {
        System.out.println("\nName/Programmer: Andrew Hernandez" 
            + "\nDate: 8/29/2023" 
            + "\nAssignment: 2.3.4: Calculations3" 
            + "\nPurpose: To solve some calculations."
            + "\n*****************************************************************\n");

        Scanner keyboard = new Scanner(System.in);
        double rectLength;
        double rectWidth;
        double circleRadius;
        double triangleBase;
        double triangleHeight;
        double footVar;
        double meterVar;
        double celsiusVar;
        double farhrenVar;
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("What is the length of the rectangle? ");
        rectLength = keyboard.nextDouble();
        System.out.print("What is the length of the rectangle? ");
        rectWidth = keyboard.nextDouble();
        System.out.print("What is the radius of the circle? ");
        circleRadius = keyboard.nextDouble();
        System.out.print("What is the base of the triangle? ");
        triangleBase = keyboard.nextDouble();
        System.out.print("What is the length of the rectangle? ");
        triangleHeight = keyboard.nextDouble();
        System.out.print("What is the length of your object in feet? ");
        footVar = keyboard.nextDouble();
        System.out.print("What is the length of your object in meters? ");
        meterVar = keyboard.nextDouble();
        System.out.print("What is the temperature of your object in celsius? ");
        celsiusVar = keyboard.nextDouble();
        System.out.print("What is the temperature of your object in fahrenheit? ");
        farhrenVar = keyboard.nextDouble();
        
        System.out.printf("The perimeter of a rectangle with a length of " 
            + rectLength + " and a width of " + rectWidth + 
            " is: %.2f",rectangleMath(rectLength,rectWidth,0));
        System.out.printf("The area of a rectangle with a length of " 
            + rectLength + " and a width of " + rectWidth + 
            " is: %.2f",rectangleMath(rectLength,rectWidth,1));
        
        System.out.println("The circumference of a circle with a radius of " 
            + circleRadius + " is: " 
            + (df.format(2*Math.PI*circleRadius)));
        System.out.println("The area of a circle with a radius of " 
            + circleRadius + " is: " 
            + (df.format(Math.PI*circleRadius*circleRadius)));
        
        System.out.println("The area of a triangle with a base of " 
            + triangleBase + " and a height of " + triangleHeight + " is: " 
            + (df.format((triangleBase*triangleHeight)/2)));
        
        System.out.println("The conversion of " + footVar + 
            " feet to meters is " 
            + (df.format(footVar/3.281)));
        System.out.println("The conversion of " + meterVar + 
            " meters to feet is " 
            + (df.format(meterVar*3.281)));
        
        System.out.println("The conversion of " + celsiusVar + 
            " celsius to fahrenheit is " 
            + (df.format(((celsiusVar*9)/5)+32)));
        System.out.println("The conversion of " + farhrenVar + 
            " fahrenheit to celsius is " 
            + (df.format((farhrenVar-32)*5/9)));
    }
    public static double rectangleMath(double length, double width, int temp) {
        if (temp == 0) {
            return 2*(length+width);
        } else {
            return length*width;
        }
    }
    public static double circleMath(double radius, int temp) {
        if (temp == 0) {
            return 2*Math.PI*radius;
        } else {
            return Math.PI*radius*radius;
        }
    }
    public static double triangleArea(double base, double height) {
        return (base*height)/2;
    }
    public static double fahrenConversion(double base, double height) {
        return (base*height)/2;
    }
    public static double fahrenConversion(double base, double height) {
        return (base*height)/2;
    }
}
