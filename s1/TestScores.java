package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: 8/25/2023
 * Assignment: 2.3.1: TestScores
 * Purpose: Input 3 numbers, compute and output the average..
 * 
 */

import java.util.Scanner;

public class TestScores
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: I love Kotoha"
            + "\nDate: 8/25/2023"
            + "\nAssignment: 2.3.1 TestScores"
            + "\nPurpose: Input 3 numbers, compute and output the average."
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        double firstScore;
        double secondScore;
        double thirdScore;
        
        // Begin program.
        System.out.print("\nEnter the first test score. ");
        firstScore = keyboard.nextDouble();
        System.out.print("Enter the second test score. ");
        secondScore = keyboard.nextDouble();
        System.out.print("Enter the third test score. ");
        thirdScore = keyboard.nextDouble();
        
        // Output.
        System.out.println(firstScore);
        System.out.println(secondScore);
        System.out.println(thirdScore);
        System.out.println("\nThe average of " + firstScore + ", " + secondScore 
            + ", and " + thirdScore + " is: " 
            + (firstScore+secondScore+thirdScore)/3);
        
        // Ending statement.
        System.out.println("****************************************************");
        System.out.println("End program.");
    }
}
