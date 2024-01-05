/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: 9/18/2023
 * Assignment: 3.1.2: Randomness
 * Purpose: To better understand random numbers.
 * 
 */

import java.util.Scanner;

public class Randomness
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: Andrew Hernandez"
            + "\nDate: 9/18/23"
            + "\nAssignment: 3.1.2 Randomness"
            + "\nPurpose: To better understand random numbers "
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        double upperBound;
        double lowerBound;
        double generatedNumber;
        int integerNumber;
        
        // Begin program.
        System.out.print("Enter the lower bound: ");
        lowerBound = keyboard.nextDouble();
        System.out.print("Enter the upper bound: ");
        upperBound = keyboard.nextDouble();
        
        for (int i = 0;i<5;i++) {
            generatedNumber = (lowerBound+(Math.random()*
                (upperBound-lowerBound)));
            //integerNumber = (int)Math.round(generatedNumber); rounds the number
            integerNumber = (int)generatedNumber;
            
            System.out.printf("\n"+generatedNumber+"\t"+"%.2f"+"\t"
                +integerNumber,generatedNumber);
        }
        // Ending statement.
            System.out.println("\n*****************************************");
            System.out.println("End program."); 
    }
}
