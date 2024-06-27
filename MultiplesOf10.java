/**
 * Name/Programmer: I love Kotoha
 * Date: March 5, 2024
 * Assignment: 4.2.1 Multiples of Ten
 * Purpose: Traversing & Printing Arrays
 */

import java.util.Scanner;
public class MultiplesOf10
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: March 5, 2024");
        System.out.println("Assignment: 4.2.1 Multiples of Ten");
        System.out.println("Purpose: Traversing & Printing Arrays");
        System.out.println();
        System.out.println("**************************************************");

        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input = 0;

        // Check for valid input between 10 and 100
        do {
            System.out.print("\nEnter a whole number from 10 and 100, inclusive: ");
            input = keyboard.nextInt();
            if (input < 10 || input > 100) {
                System.out.println(input+" is invalid, please try again.");
            }
        } while (input < 10 || input > 100);

        // Create and populate the array
        int[] array = new int[input];
        for (int i = 0; i < input; i++) {
            array[i] = i * 10;
        }
        System.out.println();

        
        System.out.println("The length of the array is: "+array.length
            +" and contains the "
            +"\n\tfollowing numbers: ");
        System.out.println();
        // Print out the array
        for (int i = 0; i < input; i++) {
            // Check if it is the start of a new line
            if (i % 5 == 0) {
                System.out.print("\t");
            }
            System.out.print(array[i] + " ");
            // Check if we need to print a new line
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.2.1> Multiples of Ten");
    }
}