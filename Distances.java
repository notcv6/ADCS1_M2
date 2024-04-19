/**
 * Name/Programmer: Andrew Hernandez
 * Date: April 15, 2024
 * Assignment: 6.1.2 Intro to 2D Arrays Pt. 2
 * Purpose: Introduction to 2D Arrays, Pt. 2
 */

 import java.util.Scanner;
 public class ArraysDemo2DPt2
 {
     public static void main(String[] args)
     {
        // Print out the header information.
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: April 15, 2024");
        System.out.println("Assignment: 6.1.2 Intro to 2D Arrays Pt. 2");
        System.out.println("Purpose: Introduction to 2D Arrays, Pt. 2");
        System.out.println("**************************************************");
        System.out.println();
         
        // Declarations and initializations.
        double[][] arr = {{-1, 3}, 
                        {-1, -1}, 
                        {1, 1}, 
                        {2, 0.5}, 
                        {2, -1}, 
                        {3, 3}, 
                        {4, 2}, 
                        {4, -0.5}};
         
        // Traverse the array and print out the coordinates.
        for (int row=0; row<arr.length; row++) {
            System.out.print("(" + arr[row][0] + ", " + arr[row][1] + ") ");
        }

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <6.1.2>: Intro to 2D Arrays, Pt. 2");
     }

    // 
 }