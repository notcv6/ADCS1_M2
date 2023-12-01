
/**
 * Name/Programmer: Andrew Hernandez
 * Date: November 27, 2023
 * Assignment: 3.2.3: Slope of a Line
 * Purpose: Review of Methods
 */

import java.util.Scanner;
public class LineSlope
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: November 27, 2023");
        System.out.println("Assignment: 3.2.3: Slope of a Line");
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
        System.out.printf("The slope of the line with coordinates of ("
            +x1+", "+y1+")\n\tand ("+x2+", "+y2+") is: "
            +"%.2f", calculateSlope(x1,x2,y1,y2));
        
        System.out.println("");
        System.out.println("\nSubsequent Runs...");
        
        x1 = 1;
        y1 = 7;
        x2 = 18;
        y2 = 3;
        System.out.printf("\nThe slope of the line with coordinates of ("
            +x1+", "+y1+")\n\tand ("+x2+", "+y2+") is: "
            +"%.2f", calculateSlope(x1,x2,y1,y2));
            
        x1 = 6;
        y1 = 40;
        x2 = 2;
        y2 = 2;
        System.out.printf("\nThe slope of the line with coordinates of ("
            +x1+", "+y1+")\n\tand ("+x2+", "+y2+") is: "
            +"%.2f", calculateSlope(x1,x2,y1,y2));
            
        x1 = 4;
        y1 = 4;
        x2 = 5;
        y2 = 3;
        System.out.printf("\nThe slope of the line with coordinates of ("
            +x1+", "+y1+")\n\tand ("+x2+", "+y2+") is: "
            +"%.2f", calculateSlope(x1,x2,y1,y2));
            
        x1 = 11;
        y1 = -1;
        x2 = 2;
        y2 = 9;
        System.out.printf("\nThe slope of the line with coordinates of ("
            +x1+", "+y1+")\n\tand ("+x2+", "+y2+") is: "
            +"%.2f", calculateSlope(x1,x2,y1,y2));
            
        x1 = 1;
        y1 = 7;
        x2 = -2;
        y2 = -9;
        System.out.printf("\nThe slope of the line with coordinates of ("
            +x1+", "+y1+")\n\tand ("+x2+", "+y2+") is: "
            +"%.2f", calculateSlope(x1,x2,y1,y2));
        
        System.out.println("");
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.2.3>: Slope of a Line");
    }
    
    
    public static double calculateSlope(int x1, int x2, int y1, int y2) {
        double a = y2-y1;
        double b = x2-x1;
        return a/b;
    }
}
