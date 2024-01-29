
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/9/24
 * Assignment: Assignment: 3.8.8 Powers
 * Purpose:  Practice writing while and do-while loops.
 */

import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
public class Powers
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/11/24");
        System.out.println("Assignment: 3.8.12 Powers");
        System.out.println("Purpose: Practice writing while and do-while");
        System.out.println("\tloops.");
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;
        
        //
        do {
            System.out.print("Enter a positive integer: ");
            input = keyboard.nextInt();
            if (input >= 0) {
                System.out.println("2 to the power of "+input
                +" is "+two2Power(input));
            }
            System.out.println();
        } while (input >= 0);
        System.out.println("A negative number was entered, program ending.");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.12>: Powers");
    }
    // 
    // integer; Accepts an integer.
    public static int two2Power (int integer) {
        int x = 1;
        int i = 0;
        while (i<integer) {
            x = 2*x;
            i++;
        } 
        return x;
    }
}
