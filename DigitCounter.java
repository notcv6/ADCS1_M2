
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/3/24
 * Assignment: Assignment: 3.8.3 Digit Counter
 * Purpose:  Learning and understanding while loops.
 */

import java.util.Scanner;
public class DigitCounter
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/3/24");
        System.out.println("Assignment: 3.8.3 Digit Counter");
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
            System.out.println("There is/are "+numDigits(input)
                +" digit(s) in "+input);
        } while (input > 0);
        System.out.println("A zero or negative number was entered, "
            +"\tprogram ending. ");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.3>: Digit Counter");
    }
    public static int numDigits(int integer) {
        int temp = 0;
        while (integer > 0) {
            integer = integer/10;
            temp++;
        }
        
        return temp;
    }
}
