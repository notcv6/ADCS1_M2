/**
 * Name/Programmer: Andrew Hernandez
 * Date: March 22, 2024
 * Assignment: 4.3.1 For-Each Prepopulated Array
 * Purpose: Traversing Arrays with the for-each loop
 */

import java.util.Scanner;
public class ForEachPopulatedArray
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: March 22, 2024");
        System.out.println("Assignment: 4.3.1 For-Each Prepopulated Array");
        System.out.println("Purpose: Traversing Arrays with the for-each loop");
        System.out.println();
        System.out.println("**************************************************");

        // Variable declaration
        Scanner keyboard = new Scanner(System.in);
        double[] numbers = {12, 14, 13, 15, 3, 66, 88, 43, 21, 98, 77, 13};
        
        // Print out the contents of array
        System.out.println("The contents of the array are: ");
        for (int i = 0; i < numbers.length; i++) {
            // Check if it is the start of a new line
            if (i % 5 == 0) {
                System.out.print("\t");
            }
            System.out.printf("%.1f  ", numbers[i]);
            // Check if we need to print a new line
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Calculate the total using every number in the array
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        System.out.println("\nThe sum of the array contents are: " + total);

        // Calculate the average using every number in the array
        double average = total / numbers.length;
        System.out.printf("\nThe average of the array contents are: %.2f", average);

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.3.1> For-Each Prepopulated");
        System.out.println("\tArray");
    }
}