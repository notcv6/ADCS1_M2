
/**
 * Name/Programmer: I love Kotoha
 * Date: 1/3/24
 * Assignment: Assignment: 3.8.2 Basic Do While Loop
 * Purpose:  Learning and understanding while loops.
 */

import java.util.Scanner;
public class BasicDoWhileLoop
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 1/3/24");
        System.out.println("Assignment: 3.8.2 Basic Do While Loop");
        System.out.println("Purpose: Learning and understanding while loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        int upper = 9;
        int lower = 0;
        int i = 0;
        int x = 9;
        
        // Print output
        System.out.println("The single numeric digits in ascending order: ");
        do {
            System.out.println("\t"+i);
            i++;
        } while (i <= upper);
        
        System.out.println("The single numeric digits in descending order: ");
        do {
            System.out.println("\t"+x);
            x--;
        } while (x >= lower);
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.2>: Basic Do While Loop");
    }
}
