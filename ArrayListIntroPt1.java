/**
 * Name/Programmer: Andrew Hernandez
 * Date: April 3, 2024
 * Assignment: 5.2.1 ArrayList Intro, Pt. 1
 * Purpose: Introduction to ArrayLists
 */

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListIntroPt1
{
    public static void main(String[] args)
    {
        // Print out the header information.
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: April 3, 2024");
        System.out.println("Assignment: 5.2.1 ArrayList Intro, Pt. 1");
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

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <5.2.1>: ArrayList Intro, Pt. 1");
    }
}
