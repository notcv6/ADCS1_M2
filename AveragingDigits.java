
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/5/24
 * Assignment: Assignment: 3.8.5 Averaging Digits
 * Purpose:  Practice writing while and do-while loops.
 */

import java.util.Scanner;
public class AveragingDigits
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/5/24");
        System.out.println("Assignment: 3.8.5 Averaging Digits");
        System.out.println("Purpose: Practice writing while and do-while");
        System.out.println("loops.");
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;
        
        // Output statement
        do {
            System.out.print("Enter a non-zero, positive integer: ");
            input = keyboard.nextInt();
            System.out.println("The average of the digits in "+input
                +" is "+averageDigits(input));
        } while (input > 0);
        System.out.println("A zero or negative number was entered, "
            +"\tprogram ending. ");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.5>: Averaging Digits");
    }
    // averageDigits; Returns the average amount of digits in a given integer.
    // integer; Accepts an integer.
    public static double averageDigits(int integer) {
        double temp = 0;
        double digits = 0;
        
        if (integer == 0) {
            return 0;
        } else {
            while (integer > 0) {
                double remainder = integer % 10;
                temp += remainder;
                integer = integer / 10;
                digits++;
            }
        
            return temp/digits; 
        }
        
    }
}
