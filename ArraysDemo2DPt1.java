/**
 * Name/Programmer: I love Kotoha
 * Date: April 15, 2024
 * Assignment: 6.1.1 Intro to 2D Arrays Pt. 1
 * Purpose: Introduction to 2D Arrays, Pt. 1
 */

import java.util.Scanner;
public class ArraysDemo2DPt1
{
    public static void main(String[] args)
    {
        // Print out the header information.
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: April 15, 2024");
        System.out.println("Assignment: 6.1.1 Intro to 2D Arrays Pt. 1");
        System.out.println("Purpose: Introduction to 2D Arrays, Pt. 1");
        System.out.println("**************************************************");
        System.out.println();
        
        // Declarations and initializations.
        final int ROWS = 6;
        final int COLS = 7;

        // Generate the 2D array.
        int[][] arr = new int [ROWS][COLS];

        // Populate the 2D array with values
        // Traverse each row of the 2D array
        for (int row=0; row<arr.length; row++) {
            // Traverse each column of the 2D array
            for (int col=0; col<arr[row].length; col++) {
                // Populate each row/cell with a value
                arr[row][col] = row * 10 + col;

                // Print the 2D array as we traverse
                if (arr[row][col] < 10) {
                    // Handle single digit numbers with a space in front
                    System.out.print(" " + arr[row][col] + " ");
                } else {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
        
        // Matrix information
        System.out.println("\n");
        System.out.println("MATRIX INFORMATION");
        System.out.print("----------------------------------");
        // Sum the values within the matrix
        double sum = 0;
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[row].length; col++) {
                sum += arr[row][col];
            }
        }
        System.out.printf("\nThe sum of the values in the grid is: %.2f"
            , sum);
        // Average the values within the matrix
        System.out.printf("\nThe average of the values in the grid is: %.2f"
            , sum / (ROWS * COLS));

        // Information by row
        System.out.println("\n");
        System.out.println("INFORMATION BY ROW");
        System.out.print("----------------------------------");
        // Take the sum of each row
        // Print the sum and average of each row
        for (int row=0; row<arr.length; row++) {
            sum = 0;
            for (int col=0; col<arr[row].length; col++) {
                sum += arr[row][col];
            }
            System.out.printf("\nThe sum of the values in row[" + row 
                + "] is: %.2f", sum);
            System.out.printf("\nThe average of the values in row[" + row 
                + "] is: %.2f", sum / COLS);
        }

        // Information by column
        System.out.println("\n");
        System.out.println("INFORMATION BY COLUMN");
        System.out.print("----------------------------------");
        // Take the sum of each column
        // Print the sum and average of each column
        for (int col=0; col<COLS; col++) {
            sum = 0;
            for (int row=0; row<ROWS; row++) {
                sum += arr[row][col];
            }
            System.out.printf("\nThe sum of the values in col[" + col 
                + "] is: %.2f", sum);
            System.out.printf("\nThe average of the values in col[" + col 
                + "] is: %.2f", sum / ROWS);
        }

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <6.1.1>: Intro to 2D Arrays, Pt. 1");
    }
}