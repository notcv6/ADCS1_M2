/**
 * Name/Programmer: Andrew Hernandez
 * Date: March 22, 2024
 * Assignment: 4.3.3 For Each Traversal
 * Purpose: Traversing Arrays with the for-each loop
 */

public class ForEachOccurrences
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: March 22, 2024");
        System.out.println("Assignment: 4.3.3 Largest Element");
        System.out.println("Purpose: Traversing Arrays with the for-each loop");
        System.out.println();
        System.out.println("**************************************************");

        // Variable declaration
        int size = 200;
        int[] array = new int[size];

        // Populate the array with random numbers
        for (int i=0; i<size;i++) {
            array[i] = (int)(Math.random()*12)+1;
        }

        // Print out contents of array
        for (int i = 0; i < size; i++) {
            // Check if it is the start of a new line
            if (i % 15 == 0) {
                System.out.print("\t");
            }
            System.out.print(array[i]);
            // Check if we need to print a new line
            if ((i + 1) % 15 == 0) {
                System.out.println();
            }
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.3.3> Largest Element");
    }
}