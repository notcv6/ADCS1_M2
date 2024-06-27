/**
 * Name/Programmer: I love Kotoha
 * Date: April 3, 2024
 * Assignment: 5.2.5 Summing Values Greater Than the Last
 * Purpose: Introduction to ArrayLists
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class SummingValues
{
    public static void main(String[] args)
    {
        // Print out the header information.
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: April 3, 2024");
        System.out.println("Assignment: 5.2.5 Summing Values Greater");
        System.out.println("\tThan the Last");
        System.out.println("Purpose: Introduction to ArrayLists");
        System.out.println();
        System.out.println("**************************************************");
        
        // Declarations and initializations.
        Scanner keyboard = new Scanner(System.in);

        // Prepopulate the ArrayLists of integers.
        ArrayList<Integer> numbers1 = 
            new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
        ArrayList<Integer> numbers2 = 
            new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
        ArrayList<Integer> numbers3 = 
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
        ArrayList<Integer> numbers4 = 
            new ArrayList<Integer>(Arrays.asList(32767));
        ArrayList<Integer> numbers5 = 
            new ArrayList<Integer>(Arrays.asList(255,255));
        ArrayList<Integer> numbers6 = 
            new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));
        ArrayList<Integer> numbers7 = 
            new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
        ArrayList<Integer> numbers8 = 
            new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,1));
        ArrayList<Integer> numbers9 = 
            new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
        ArrayList<Integer> numbers10 = 
            new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
        ArrayList<Integer> numbers11 = 
            new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
        ArrayList<Integer> numbers12 = 
            new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
        ArrayList<Integer> numbers13 = 
            new ArrayList<Integer>(Arrays.asList());

        // Call sumArrayList with each ArrayList of numbers.
        sumArrayList(numbers1);
        sumArrayList(numbers2);
        sumArrayList(numbers3);
        sumArrayList(numbers4);
        sumArrayList(numbers5);
        sumArrayList(numbers6);
        sumArrayList(numbers7);
        sumArrayList(numbers8);
        sumArrayList(numbers9);
        sumArrayList(numbers10);
        sumArrayList(numbers11);
        sumArrayList(numbers12);
        sumArrayList(numbers13);

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <5.2.5>: Summing Values Greater");
        System.out.println("\tThan the Last");
    }

    public static void sumArrayList(ArrayList<Integer> numbers) {
        // Initializations and declarations
        int sum = 0;

        // Print out the ArrayList
        System.out.println();
        System.out.println(numbers);

        // Loop through the ArrayList determining the sum of all numbers greater than the last in the ArrayList
        if (numbers.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > numbers.get(numbers.size()-1)) {
                    sum += numbers.get(i);
                }
            }

            // Print out the sum of all numbers greater than the last in the ArrayList
            System.out.println("The sum of all numbers greater than " + numbers.get(numbers.size()-1) + ": " + sum);
        }
    }
}