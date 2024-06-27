/**
 * Name/Programmer: I love Kotoha
 * Date: March 22, 2024
 * Assignment: 4.3.2 For Each Traversal
 * Purpose: Traversing Arrays with the for-each loop
 */

public class ForEachTraversal
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: March 22, 2024");
        System.out.println("Assignment: 4.3.2 For-Each Traversal");
        System.out.println("Purpose: Traversing Arrays with the for-each loop");
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
        System.out.println();

        // Find the For-Each Traversal
        double largestElement = array[0];
        for (double element : array) {
            if (element > largestElement) {
                largestElement = element;
            }
        }
        System.out.printf("The largest random number generated is: %.2f", largestElement);
        System.out.println("\n");

        // Find the smallest element
        double smallestElement = array[0];
        for (double element : array) {
            if (element < smallestElement) {
                smallestElement = element;
            }
        }
        System.out.printf("The smallest random number generated is: %.2f", smallestElement);
        System.out.println("\n");

        // Calculate the average of the largest and smallest numbers
        double average = (largestElement + smallestElement) / 2.0;
        System.out.printf("The average of the largest and smallest random "
            +"\n\tnumbers generated is: %.2f", average);
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.3.2> For-Each Traversal");
    }
}