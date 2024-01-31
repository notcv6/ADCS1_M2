/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/25/24
 * Assignment: 3.9.9 Prime Numbers
 * Purpose: Practice writing for loops.
 */

import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/25/24");
        System.out.println("Assignment: 3.9.9 Prime Numbers ");
        System.out.println("Purpose: Practice writing for loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;

        // Output statement
        do {
            System.out.print("Enter a non-zero, positive integer: ");
            input = keyboard.nextInt();
            if (input > 0) {
                if (isPrime(input)) {
                    System.out.println("The number "+input+" is prime!");
                } else {
                    System.out.println("The number "+input+" is not prime!");
                }
            }
            System.out.println("");
        } while (input > 0);
        System.out.println("Zero or a negative number was entered,"
            +"program ending.");
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.9>: Prime Numbers");
    }
    // isCool; Checks if a number can be divided by 
    //  3, 4, 5, and 6 and returns a boolean.
    // Accepts an integer for input.
    public static Boolean isPrime(int input) {
        for (int i=1;i<input;i++) {
            if (input/i == 1 || input/i == input) {
                
            } else {
                return false;
            }
        }
        return false;
    }
}