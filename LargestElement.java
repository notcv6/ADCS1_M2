/**
 * Name/Programmer: I love Kotoha
 * Date: March 5, 2024
 * Assignment: 4.2.3 Largest Element
 * Purpose: Traversing & Printing Arrays
 */

public class LargestElement
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: March 5, 2024");
        System.out.println("Assignment: 4.2.3 Largest Element");
        System.out.println("Purpose: Traversing & Printing Arrays");
        System.out.println();
        System.out.println("**************************************************");

        // Variable declaration
        int size = 20;
        double[] array = new double[size];

        // Populate the array with random numbers
        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * 100.0;
        }

        System.out.println("The array contains the following numbers: ");
        System.out.print("\n");
        // Print out contents of array
        for (int i = 0; i < size; i++) {
            // Check if it is the start of a new line
            if (i % 5 == 0) {
                System.out.print("\t");
            }
            System.out.printf("%.2f  ", array[i]);
            // Check if we need to print a new line
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        // Find the largest element
        double largestElement = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }
        System.out.printf("\nThe largest random number found is: %.2f"
            , largestElement);
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.2.3> Largest Element");
    }
}