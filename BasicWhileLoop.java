
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/3/24
 * Assignment: Assignment: 3.8.1 Basic While Loop
 * Purpose:  Learning and understanding while loops.
 */

import java.util.Scanner;
public class BasicWhileLoop
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/3/24");
        System.out.println("Assignment: 3.8.1 Basic While Loop");
        System.out.println("Purpose: Learning and understanding while loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        int upper = 9;
        int lower = 0;
        int counter = 0;
        
        // 
        System.out.println("The single numeric digits in ascending order: ");
        while (counter <= upper) {
            System.out.println("\t"+counter);
            counter++;
        }
        
        System.out.println("The single numeric digits in descending order: ");
        counter--;
        while (counter >= lower) {
            System.out.println("\t"+counter);
            counter--;
        }
        // 
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.1>: Basic While Loop");
    }
}
