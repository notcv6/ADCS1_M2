package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: 9/20/2023
 * Assignment: 3.2.0 CodeAlong
 * Purpose: To generate a template for future use.
 * 
 */

import java.util.Scanner;

public class AddTwoNumbers
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: I love Kotoha"
            + "\nDate: 9/20/23"
            + "\nAssignment: 3.2.0 CodeAlong"
            + "\nPurpose: "
            + "\n****************************************************\n");
        
        // Declare variables.
        
        // Begin program.
        System.out.println("sum1 is: " + sum(2,2));
        System.out.println("sum2 is: " + sum(10,400));
        
        // Ending statement.
        System.out.println("\n****************************************************");
        System.out.println("End program.");
    }
    
    // The sum method takes two integer arguments, adds
    // them together and returns the result.
    public static int sum(int a, int b) {
        return a + b;
    }
}
