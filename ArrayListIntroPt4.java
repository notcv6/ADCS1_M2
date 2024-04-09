/**
 * Name/Programmer: Andrew Hernandez
 * Date: April 3, 2024
 * Assignment: 5.2.4 ArrayList Intro, Pt. 4
 * Purpose: Introduction to ArrayLists
 */

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListIntroPt4
{
    public static void main(String[] args)
    {
        // Print out the header information.
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: April 3, 2024");
        System.out.println("Assignment: 5.2.4 ArrayList Intro, Pt. 4");
        System.out.println("Purpose: Introduction to ArrayLists");
        System.out.println();
        System.out.println("**************************************************");
        
        // Declarations and initializations.
        Scanner keyboard = new Scanner(System.in);
        int size = 200;

        // Declare an ArrayList of integers.   
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Generate 200 random numbers between 1 and 15
        // and add them to the ArrayList.
        for (int i = 0; i < size; i++) {
            int randomNumber = (int) (Math.random() * 15) + 1;
            numbers.add(randomNumber);
        }

        // Print the contents of the ArrayList, only 10 per line
        // with each number separated by a single space
        System.out.println();
        System.out.println("The ArrayList contains the following numbers: ");
        System.out.println();

        printArray(numbers);

        // Traverse the ArrayList “mod”’ing each number by 4 and 
        // replacing the original by the result.
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) % 4);
        }

        // Print the contents of the ArrayList.
        System.out.println();
        System.out.println("The ArrayList contains the following numbers: ");
        System.out.println();

        printArray(numbers);
        
        // Traverse the ArrayList, adding the next element to 
        // current element, and replacing the current element.
        // The last element will be replaced by adding the 
        // original first element to it.
        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size()-1) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
            } else {
                numbers.set(i, numbers.get(i) + numbers.get(0));
            }
        }

        // Print the contents of the ArrayList.
        System.out.println();
        System.out.println("The ArrayList contains the following numbers: ");
        System.out.println();

        printArray(numbers);

        // Traverse the ArrayList, counting the occurrence of each number 0-6.
        int[] count = new int[7];
        for (int i = 0; i < numbers.size(); i++) {
            count[numbers.get(i)]++;
        }

        // Print out the number of occurrences of each number 0-6.
        System.out.println();
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + " occurs " + count[i] + " times in the ArrayList.");
        }

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <5.2.4>: ArrayList Intro, Pt. 4");
    }

    // Prints out the contents of ArrayList, with 10 numbers per line.
    // Accepts an ArrayList for input.
    public static void printArray(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            // Check if it is the start of a new line
            if (i % 10 == 0) {
                System.out.print("\t");
            }
            System.out.print(" " + numbers.get(i));
            // Check if we need to print a new line
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
