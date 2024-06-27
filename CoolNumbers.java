/**
 * Name/Programmer: I love Kotoha
 * Date: 1/25/24
 * Assignment: 3.9.10 Count Cool Numbers
 * Purpose: Practice writing for loops.
 */

import java.util.Scanner;
public class CoolNumbers
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 1/25/24");
        System.out.println("Assignment: 3.9.10 Count Cool Numbers ");
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
                System.out.println("There are "+countCoolNumbers(input)
                    +" between 6 and "+input+", \n\tinclusive.");
            }
            System.out.println("");
        } while (input > 0);
        System.out.println("Zero or a negative number was entered,"
            +"program ending.");
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.10>: Count Cool Numbers");
    }
    // isCool; Checks if a number can be divided by 
    //  3, 4, 5, and 6 and returns a boolean.
    // Accepts an integer for input.
    public static Boolean isCool(int input) {
        for (int i=3;i<6;i++) {
            if (input%i != 1) {
                return false;
            }
        }
        return true;
    }
    // countCoolNumbers; Checks every number between 6 and a given number 
    //  if it is a cool number and returns the amount.
    // Accepts an integer for input.
    public static int countCoolNumbers(int input) {
        int temp = 0;
        if (input <= 6) {
            return 0;
        }
        for (int i=7;i<input;i++) {
            if (isCool(i)) {
                temp++;
            }
        }
        return temp;
    }
}