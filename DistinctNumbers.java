/**
 * Name/Programmer: Andrew Hernandez
 * Date: March 7, 2024
 * Assignment: 4.2.4 Distinct Numbers
 * Purpose: Traversing & Printing Arrays
 */

public class DistinctNumbers
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: March 7, 2024");
        System.out.println("Assignment: 4.2.4 Distinct Numbers");
        System.out.println("Purpose: Traversing & Printing Arrays");
        System.out.println();
        System.out.println("**************************************************");

        // Variable declaration
        int num = 200;            // number of elements in the array
        int upper = 10;           // upper limit of the random number range
        int numElements = 10;     // number of elements per line
        
        // Create an integer array of num random integers between 1 and upper, inclusive
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * upper) + 1;
        }
        
        System.out.println("\nThe array contains the following numbers: ");
        System.out.println("");

        // Print out the contents of the array
        for (int i = 0; i < num; i++) {
            if (i % numElements == 0) {
                System.out.print("\t");
            }
            System.out.printf("%3d", array[i]);
            if ((i + 1) % numElements == 0) {
                System.out.println();
            } else {
                System.out.print("  ");
            }
        }

        // Create an array to store the distinct numbers
        int[] distinctNumbers = new int[num];
        // Create an array to store the count of each number
        int[] counts = new int[num];

        int distinctCount = 0;

        // Iterate over the array
        for (int i = 0; i < num; i++) {
            // Check if the number is already in the distinctNumbers array
            int index = -1;
            for (int j = 0; j < distinctCount; j++) {
                if (distinctNumbers[j] == array[i]) {
                    index = j;
                    break;
                }
            }

            if (index != -1) {
                // If the number is already in the distinctNumbers array, increment its count
                counts[index]++;
            } else {
                // Otherwise, add the number to the distinctNumbers array and set its count to 1
                distinctNumbers[distinctCount] = array[i];
                counts[distinctCount] = 1;
                distinctCount++;
            }
        }

        System.out.println("\nThe order of the distinct numbers is: ");
        System.out.println("");

        // Print out the order of each distinct number
        System.out.print("\t");
        for (int i = 0; i < distinctCount; i++) {
            System.out.print(distinctNumbers[i]);
            if (i < distinctCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println();
        // Print out the count of each number
        for (int i = 0; i < distinctCount; i++) {
            System.out.println("There are "+counts[i]
                +" occurences of distinct number "+distinctNumbers[i]);
        }
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.2.4> Distinct Numbers");
    }
}