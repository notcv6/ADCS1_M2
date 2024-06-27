/**
 * Name/Programmer: I love Kotoha
 * Date: April 3, 2024
 * Assignment: 5.2.7 Sorted Names
 * Purpose: Introduction to ArrayLists
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class SortedNames
{
    public static void main(String[] args)
    {
        // Print out the header information.
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: April 3, 2024");
        System.out.println("Assignment: 5.2.7 Sorted Names");
        System.out.println("Purpose: Introduction to ArrayLists");
        System.out.println();
        System.out.println("**************************************************");
        
        // Declarations and initializations.
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Armando", "Philipos", "Simeon", "Nicholas", "Sonya", "Ryan", "Kaden", "Dylan", "Jessica", "Marley", "Sora", "Dion", "Evey", "Cathy", "Orion", "Joseph", "Jaxson", "Ethan", "Jaiden", "Khaleed", "Emiliano", "Hans", "Oliver", "Ermes", "Preston", "Ava", "Ashton", "Miyako", "Lori"));
        
        // Loop through the ArrayList comparing the current element to the next element.
        for (int i = 0; i < names.size() - 1; i++)
        {
            // If the current element is greater than the next element, swap them.
            if (names.get(i).compareTo(names.get(i + 1)) > 0)
            {
                String temp = names.get(i);
                names.set(i, names.get(i + 1));
                names.set(i + 1, temp);
                i = -1;
            }
        }

        // Output the sorted ArrayList.
        System.out.println(names);

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <5.2.7>: Sorted Names");
    }
}