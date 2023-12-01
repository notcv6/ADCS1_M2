
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 2, 2023
 * Assignment: Assignment: 2.0.0 TriangleMadness
 * Purpose: Make sure our template is correct
 */

import java.util.Scanner;
public class TriangleMadness
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: ");
        System.out.println("Assignment: ");
        System.out.println("Purpose: ");
        System.out.println("");
        System.out.println("");
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
        
        System.out.printf("\nThe distance between points #1 and #2 is: %.2f"
            ,TwoPointDistance.calculateDistance(x1,x2,y1,y2));
        System.out.printf("\nThe distance between points #2 and #3 is: %.2f"
            ,TwoPointDistance.calculateDistance(x2,x3,y2,y3));
        System.out.printf("\nThe distance between points #3 and #1 is: %.2f"
            ,TwoPointDistance.calculateDistance(x1,x3,y1,y3));
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <#.#.#>: ");
    }
    
    public static double areaHeron(double x, int s1, int s2, int s3) {
        return Math.sqrt(x*((x-s1)*(x-s2)*(x-s3)));
    }
    public static double centroid(int x, int y, int z) {
        return (x+y+z)/3;
    }
    public static double height(double A, int b) {
        return (A/b)*2;
    }
    public static double perimieter(int s1, int s2, int s3) {
        return s1+s2+s3;
    }
}
