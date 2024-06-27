package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: November 27, 2023
 * Assignment: 3.2.2 Stars and Dashes
 * Purpose: Review of Methods
 * 
 */

import java.util.Scanner;

public class StarsAndDashes
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: I love Kotoha"
            + "\nDate: November 27, 2023"
            + "\nAssignment: 3.2.2 Stars and Dashes"
            + "\nPurpose: Review of Methods"
            + "\n****************************************************\n");
        
        // Begin program.
        System.out.println("A small box of stars and dashes: ");
        printASmallBox();
        
        System.out.println("A large box of stars and dashes: ");
        printALargeBox();
        
        // Ending statement.
        System.out.println("\n*****************************************");
        System.out.println("Ending Assignment 3.2.2: Stars and Dashes");
    }
    // printTwentyStars; Prints a 20 character line of stars.
    public static void printTwentyStars() {
        System.out.println("\t********************");
    }
    // printTwentyDashes; Prints a 20 character line of dashes.
    public static void printTwentyDashes() {
        System.out.println("\t--------------------");
    }
    // printTwoBlankLines; Prints a 20 character line of spaces.
    public static void printTwoBlankLines() {
        System.out.println("\t                    ");
    }
    // printASmallBox; Creates a small box using dashes and stars.
    public static void printASmallBox() {
        for (int i=0;i<3;i++) {
            printTwentyDashes();
            printTwentyStars();
        }
        printTwentyDashes();
        printTwoBlankLines();
    }
    // printALargeBox; Creates a large box using dashes and stars.
    public static void printALargeBox() {
        for (int i=0;i<7;i++) {
            printTwentyDashes();
            printTwentyStars();
        }
        printTwentyDashes();
    }
}
