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
             }
         }
         printIt(arr);
         
         // Matrix information
         System.out.println("\n");
         System.out.println("MATRIX INFORMATION");
         System.out.print("----------------------------------");
         // Sum the values within the matrix
         System.out.printf("\nThe sum of the values in the grid is: %.0f"
             ,gridSum(arr));
         // Average the values within the matrix
         System.out.printf("\nThe average of the values in the grid is: %.2f"
             ,gridSum(arr) / (ROWS * COLS));
 
         // Information by row
         System.out.println("\n");
         System.out.println("INFORMATION BY ROW");
         System.out.print("----------------------------------");
         // Take the sum of each row
         // Print the sum and average of each row
         for (int row=0; row<arr.length; row++) {
             System.out.printf("\nThe sum of the values in row[" + row 
                 + "] is: %.0f",rowSum(arr, row));
             System.out.printf("\nThe average of the values in row[" + row 
                 + "] is: %.2f",rowSum(arr, row) / COLS);
         }
 
         // Information by column
         System.out.println("\n");
         System.out.println("INFORMATION BY COLUMN");
         System.out.print("----------------------------------");
         // Take the sum of each column
         // Print the sum and average of each column
         for (int col=0; col<COLS; col++) {
             System.out.printf("\nThe sum of the values in col[" + col 
                 + "] is: %.0f",colSum(arr, col));
             System.out.printf("\nThe average of the values in col[" + col 
                 + "] is: %.2f",colSum(arr, col) / ROWS);
         }
 
         // Output the ending statement.
         System.out.println();
         System.out.println("**************************************************");
         System.out.println("Ending Assignment <6.1.2>: Intro to 2D Arrays, Pt. 2");
     }

     
    // printIt; Traverses a 2D array and prints it out
    // Accepts a 2D array as input
    public static void printIt(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
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
    }

    // gridSum; Sums the values within a 2D array
    // Accepts a 2D array as input
    public static double gridSum(int[][] arr) {
        int sum = 0;
        // Traverse each row of the 2D array, adding the value of each cell to sum
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
        }
        return sum;
    }
    
    // rowSum; Sums the values within a specified row of a 2D array
    // Accepts a 2D array and an integer as input
    public static double rowSum(int[][] arr, int row) {
        int sum = 0;
        // Traverse each row of the 2D array, adding the value of the specified row to sum
        for (int col = 0; col < arr[row].length; col++) {
            sum += arr[row][col];
        }
        return sum;
    }

    // colSum; Sums the values within a specified column of a 2D array
    // Accepts a 2D array and an integer as input
    public static double colSum(int[][] arr, int col) {
        int sum = 0;
        // Traverse each row of the 2D array, adding the value of the specified column to sum
        for (int row = 0; row < arr.length; row++) {
            sum += arr[row][col];
        }
        return sum;
    }
 }