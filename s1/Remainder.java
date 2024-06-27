package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: 8/31/2023
 * Assignment: 2.3.5: Remainder
 * Purpose: To perform operations using modulus.
 * 
 */

import java.util.Scanner;

public class Remainder
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: I love Kotoha"
            + "\nDate: 8/31/2023"
            + "\nAssignment: 2.3.5: Remainder"
            + "\nPurpose: To perform operations using modulus."
            + "\n****************************************************\n");
        
        // Declare variables.
        int quotient;
        int remainder;
        
        // Begin program.
        quotient = 9/2;
        remainder = 9%2;
        System.out.println("The quotient of 9 / 2 is: " + quotient);
        System.out.println("The remainder of 9 / 2 is: " + remainder);
        
        quotient = 8/3;
        remainder = 8%3;
        System.out.println("The quotient of 8 / 3 is: " + quotient);
        System.out.println("The remainder of 8 / 3 is: " + remainder);
        
        quotient = 10/3;
        remainder = 10%3;
        System.out.println("The quotient of 10 / 3 is: " + quotient);
        System.out.println("The remainder of 10 / 3 is: " + remainder);
        
        quotient = 12/4;
        remainder = 12%4;
        System.out.println("The quotient of 12 / 4 is: " + quotient);
        System.out.println("The remainder of 12 / 4 is: " + remainder);
        
        quotient = 20/7;
        remainder = 20%7;
        System.out.println("The quotient of 20 / 7 is: " + quotient);
        System.out.println("The remainder of 20 / 7 is: " + remainder);
        
        // Ending statement.
        System.out.println("****************************************************");
        System.out.println("End program.");
    }
}
