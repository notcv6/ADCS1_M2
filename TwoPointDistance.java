
/**
 * Name/Programmer: Andrew Hernandez
 * Date: November 27, 2023
 * Assignment: 3.2.3: Distance Between Two Points
 * Purpose: Review of Methods
 */

import java.util.Scanner;
public class TwoPointDistance
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: November 27, 2023");
        System.out.println("Assignment: 3.2.3: Distance Between Two Points");
        System.out.println("Purpose: Review of Methods");
        System.out.println("");
    
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        
        // Get input
        System.out.print("Enter the x coordinate of the first point: ");
        x1 = keyboard.nextInt();
        System.out.print("Enter the y coordinate of the first point: ");
        y1 = keyboard.nextInt();
        System.out.print("Enter the x coordinate of the second point: ");
        x2 = keyboard.nextInt();
        System.out.print("Enter the y coordinate of the second point: ");
        y2 = keyboard.nextInt();
        System.out.println("");
        
        // Output statements
        System.out.printf("The distance of the line with coordinates of ("
            +x1+", "+y1+")\n\tand ("+x2+", "+y2+") is: "
            +"%.2f", calculateDistance(x1,x2,y1,y2));
        
        System.out.println("");
        System.out.println("\nSubsequent Runs...");
        
        System.out.printf("\nThe distance of the line with coordinates of (1, 7"
            +")\n\tand (18, 3) is: "
            +"%.2f", calculateDistance(1,18,7,3));
        System.out.printf("\nThe distance of the line with coordinates of (6, 40"
            +")\n\tand (2, 2) is: "
            +"%.2f", calculateDistance(6,2,40,2));
        System.out.printf("\nThe distance of the line with coordinates of (4, 4"
            +")\n\tand (5, 3) is: "
            +"%.2f", calculateDistance(4,5,4,3));
        System.out.printf("\nThe distance of the line with coordinates of (11, -1"
            +")\n\tand (2, 9) is: "
            +"%.2f", calculateDistance(1,2,-1,9));
        System.out.printf("\nThe distance of the line with coordinates of (1, 7"
            +")\n\tand (-2, -9) is: "
            +"%.2f", calculateDistance(1,-2,7,-9));
            
        System.out.println("");
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.2.4>: Distance Between Two Points");
    }
    
    
    public static double calculateDistance(double x1, double x2, double y1, double y2) {
        double a = Math.pow(x2-x1,2);
        double b = Math.pow(y2-y1,2);
        return Math.sqrt(a+b);
    }
}
