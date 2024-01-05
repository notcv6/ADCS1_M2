/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: 8/23/2023
 * Assignment: 2.2.3: Calculations
 * Purpose: To solve some calculations.
 * 
 */

public class Calculations
{
    // Output header information.
    public static void main(String[]args) {
        System.out.println("\nName/Programmer: Andrew Hernandez" 
            + "\nDate: 8/23/2023" 
            + "\nAssignment: 2.2.3: Calculations" 
            + "\nPurpose: To solve some calculations."
            + "\n*****************************************************************\n");
//345678901234567890123456789012345678901234567890123456789012345678901234567890123

        float rectLength = 20;
        float rectWidth = 10;
        
        System.out.println("The perimeter of a rectangle with a length of " 
            + rectLength + " and a width of " + rectWidth + " is: " 
            + (2*(rectLength+rectWidth)));
        System.out.println("The area of a rectangle with a length of " 
            + rectLength + " and a width of " + rectWidth + " is: " 
            + (rectLength*rectWidth));
            
        float circleRadius = 5;
        
        System.out.println("The circumference of a circle with a radius of " 
            + circleRadius + " is: " + (2*Math.PI*circleRadius));
        System.out.println("The area of a circle with a radius of " 
            + circleRadius + " is: " + (Math.PI*circleRadius*circleRadius));
            
        float triangleBase = 14;
        float triangleHeight = 7;
        
        System.out.println("The area of a triangle with a base of " 
            + triangleBase + " and a height of " + triangleHeight + " is: " 
            + ((triangleBase*triangleHeight)/2));
            
        float footVar = 8;
        float meterVar = 25;
        
        System.out.println("The conversion of " + footVar + 
            " feet to meters is " + (footVar/3.281));
        System.out.println("The conversion of " + meterVar + 
            " meters to feet is " + (meterVar*3.281));
        
        float celsiusVar = 19;
        float farhrenVar = 90;
        
        System.out.println("The conversion of " + celsiusVar + 
            " celsius to fahrenheit is " + (((celsiusVar*9)/5)+32));
        System.out.println("The conversion of " + farhrenVar + 
            " fahrenheit to celsius is " + ((farhrenVar-32)*5/9));
    }
}
