/**
 * Name/Programmer: I love Kotoha
 * Date: March 22, 2024
 * Assignment: 4.3.3 For Each Traversal
 * Purpose: Traversing Arrays with the for-each loop
 */

public class ForEachOccurrences
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
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

        // Print out the contents of the array with 15 numbers per line
        int count = 0;
        for (int num : array) {
            System.out.print(num + " ");
            count++;
            if (count % 15 == 0) {
                System.out.println();
            }
        }
        
        // Determine the occurrence of each number in the array
        int[] occurrences = new int[12];
        for (int num : array) {
            occurrences[num - 1]++;
        }

        // Print the occurrence of each number
        System.out.println("\nOccurrences of each number:");
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + occurrences[i]);
        }

        // Determine the maximum occurrence
        int maxOccurrences = 0;
        int maxIndex = -1;
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > maxOccurrences) {
                maxOccurrences = occurrences[i];
                maxIndex = i;
            }
        }

        // Print the number with the maximum occurrence
        if (maxIndex != -1) {
            System.out.println("\nMost frequently occurring number:");
            System.out.println("Number " + (maxIndex + 1));
        }

        // Determine the minimum occurrence
        int minOccurrences = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] < minOccurrences) {
                minOccurrences = occurrences[i];
                minIndex = i;
            }
        }

        // Print the number with the minimum occurrence
        if (minIndex != -1) {
            System.out.println("\nLeast frequently occurring number:");
            System.out.println("Number " + (minIndex + 1));
        }
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.3.3> Largest Element");
    }
}