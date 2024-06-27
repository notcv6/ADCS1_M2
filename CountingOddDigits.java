
/**
 * Name/Programmer: I love Kotoha
 * Date: 1/5/24
 * Assignment: Assignment: 3.8.6 Counting Odd Digits
 * Purpose:  Practice writing while and do-while loops.
 */

import java.util.Scanner;
public class CountingOddDigits
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 1/5/24");
        System.out.println("Assignment: 3.8.6 Counting Odd Digits");
        System.out.println("Purpose: Learning and understanding while loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;
        
        //
        do {
            System.out.print("Enter a non-zero, positive integer: ");
            input = keyboard.nextInt();
            System.out.println("The number of odd digits in "+input
                +" is "+countOddDigits(input));
        } while (input > 0);
        System.out.println("A zero or negative number was entered, "
            +"\tprogram ending. ");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.6>: Counting Odd Digits");
    }
    // countEvenDigits; Returns the number of odd digits in a given integer.
    // integer; Accepts an integer.
    public static int countOddDigits (int integer) {
        int digits = 0;
        
        while (integer > 0) {
            double remainder = integer % 10;
            if (remainder % 2 != 0) {
                digits++;
            }
            integer = integer / 10;
        }
        
        return digits;
    }
}
