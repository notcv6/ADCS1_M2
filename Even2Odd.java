/**
 * Name/Programmer: I love Kotoha
 * Date: April 3, 2024
 * Assignment: 5.2.5 Summing Values Greater Than the Last
 * Purpose: Introduction to ArrayLists
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Even2Odd
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
            new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
        ArrayList<Integer> numbers2 = 
            new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
        ArrayList<Integer> numbers3 = 
            new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
        ArrayList<Integer> numbers4 = 
            new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
        ArrayList<Integer> numbers5 = 
            new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
        ArrayList<Integer> numbers6 = 
            new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,1000,3));
        ArrayList<Integer> numbers7 = 
            new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
        ArrayList<Integer> numbers8 = 
            new ArrayList<Integer>(Arrays.asList(2,4,6,8,8));
        ArrayList<Integer> numbers9 = 
            new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,9,9,9,9,9));
        ArrayList<Integer> numbers10 = 
            new ArrayList<Integer>(Arrays.asList(3,3,4,5,5,7,7,9,9,11,12));

        


        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <5.2.5>: Summing Values Greater");
        System.out.println("\tThan the Last");
    }
}