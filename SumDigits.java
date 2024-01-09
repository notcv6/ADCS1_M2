
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/5/24
 * Assignment: Assignment: 3.8.4 Sum Digits
 * Purpose:  Learning and understanding while loops.
 */

import java.util.Scanner;
public class SumDigits
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/5/24");
        System.out.println("Assignment: 3.8.4 Sum Digits");
        System.out.println("Purpose: Learning and understanding while loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;
        
        // Print output
        do {
            System.out.print("Enter a non-zero, positive integer: ");
            input = keyboard.nextInt();
            System.out.println("There is/are "+sumDigits(input)
                +" digit(s) in "+input);
        } while (input > 0);
        System.out.println("A zero or negative number was entered, "
            +"\tprogram ending. ");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.4>: Sum Digits");
    }
    // sumDigits; Returns the sum of all of the digits in a given integer.
    // integer: Accepts an integer.
    public static int sumDigits(int integer) {
        int temp = 0;
        while (integer > 0) {
            int remainder = integer % 10;
            temp += remainder;
            integer = integer / 10;
        }
        
        return temp;
    }
}
