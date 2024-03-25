package s1;


/**
 * Name/Programmer: Andrew Hernandez
 * Date: November 29, 2023
 * Assignment: Assignment: 3.2.6: Triangle Madness
 * Purpose: Review & practice writing methods
 */

import java.util.Scanner;
public class TriangleMadness
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: November 29, 2023");
        System.out.println("Assignment: 3.2.6: Triangle Madness");
        System.out.println("Purpose: Review & practice writing methods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;
        
        // 
        System.out.print("Enter the x coordinate of point #1: ");
        x1 = keyboard.nextInt();
        System.out.print("Enter the y coordinate of point #1: ");
        y1 = keyboard.nextInt();
        System.out.print("Enter the x coordinate of point #2: ");
        x2 = keyboard.nextInt();
        System.out.print("Enter the y coordinate of point #2: ");
        y2 = keyboard.nextInt();
        System.out.print("Enter the x coordinate of point #3: ");
        x3 = keyboard.nextInt();
        System.out.print("Enter the y coordinate of point #3: ");
        y3 = keyboard.nextInt();
        System.out.println("");
        
        System.out.println("Vertex #1 of the triangle is: ("+x1+", "+y1+")");
        System.out.println("Vertex #2 of the triangle is: ("+x2+", "+y2+")");
        System.out.println("Vertex #3 of the triangle is: ("+x3+", "+y3+")");
        
        double s1 = TwoPointDistance.calculateDistance(x1,x2,y1,y2);
        double s2 = TwoPointDistance.calculateDistance(x2,x3,y2,y3);
        double s3 = TwoPointDistance.calculateDistance(x1,x3,y1,y3);
        
        System.out.printf("\nThe distance between points #1 and #2 is: %.2f"
            ,s1);
        System.out.printf("\nThe distance between points #2 and #3 is: %.2f"
            ,s2);
        System.out.printf("\nThe distance between points #3 and #1 is: %.2f"
            ,s3);
        
        System.out.println("");
        System.out.printf("\nThe perimeter of the triangle is: %.2f"
            ,perimeter(s1,s2,s3));
            
        System.out.println("");
        System.out.printf("\nThe centroid of the triangle is: (%.2f, %.2f)"
            ,centroid(x1,x2,x3), centroid(y1,y2,y3));
            
        System.out.println("");
        System.out.printf("\nThe area of the triangle using Heron's formula "
            +"\n\tis: %.2f",areaHeron(perimeter(s1,s2,s3)/2,s1,s2,s3));
            
        System.out.println("");
        System.out.printf("\nThe height of the triangle using the longest "
            +"\n\tside as the base is: %.2f",height(areaHeron(perimeter(s1,s2,s3)/2,s1,s2,s3), s2));
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.2.6>: Triangle Madness");
    }
    // areaHeron; Calculates the area of a triangle using Heron's formula and returns it as a double.
    // takes a double as input for s, s1, s2, and s3.
    public static double areaHeron(double s, double s1, double s2, double s3) {
        return Math.sqrt(s*((s-s1)*(s-s2)*(s-s3)));
    }
    // Calculates the centroid of 3 coordinates of a triangle and returns it as a double.
    // Accepts an integer input for x, y and z.
    public static double centroid(int x, int y, int z) {
        return (x+y+z)/3;
    }
    // Calculates the height of a triangle and returns it as a double.
    // Accepts double inputs for the area and base of the triangle.
    public static double height(double A, double b) {
        return (A/b)*2;
    }
    // Calculates the perimeter of a triangle and returns it as a double.
    // Accepts double inputs for all of the sides.
    public static double perimeter(double s1, double s2, double s3) {
        return s1+s2+s3;
    }
}
