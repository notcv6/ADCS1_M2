/**
 * Name/Programmer: I love Kotoha
 * Date: April 3, 2024
 * Assignment: 5.2.2 ArrayList Intro, Pt. 2
 * Purpose: Introduction to ArrayLists
 */

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListIntroPt2
{
    public static void main(String[] args)
    {
        // Print out the header information.
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: April 3, 2024");
        System.out.println("Assignment: 5.2.2 ArrayList Intro, Pt. 2");
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

        // Find the sum of all the even numbers in the ArrayList.
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }

        // Find the average of all the even numbers in the ArrayList.
        double average = (double) sum / numbers.size();

        // Find the count of all the even numbers in the ArrayList.
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                count++;
            }
        }

        // Output the sum, average, and count of all the even numbers in the ArrayList.
        System.out.println();
        System.out.print("\nThe sum of the even indexed elements is: " + sum);
        System.out.printf("\nThe average of the even indexed "
            +"elements is: %.2f", average);
        System.out.print("\nThe number of even elements is: " + count);

        // Find the sum of all the odd numbers in the ArrayList.
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                sum += numbers.get(i);
            }
        }

        // Find the average of all the odd numbers in the ArrayList.
        average = (double) sum / numbers.size();

        // Find the count of all the odd numbers in the ArrayList.
        count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                count++;
            }
        }

        // Output the sum, average, and count of all the odd numbers in the ArrayList.
        System.out.println();
        System.out.print("\nThe sum of the odd indexed elements is: " + sum);
        System.out.printf("\nThe average of the odd indexed "
            + "elements is: %.2f", average);
        System.out.print("\nThe number of odd elements is: " + count);

        // Find the overall average of the elements in the ArrayList.
        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        average = (double) sum / numbers.size();

        // Output the overall average of the elements in the ArrayList.
        System.out.println();
        System.out.print("\nThe sum of all indexed elements is: " + sum);
        System.out.printf("\nThe average of all indexed "
            +"elements is: %.2f", average);

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <5.2.2>: ArrayList Intro, Pt. 2");
    }
}
