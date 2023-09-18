/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: x/x/2023
 * Assignment: 2.x.x: MathClassMethods
 * Purpose: To generate a template for future use.
 * 
 */

import java.util.Scanner;

public class MathClassMethods
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: Andrew Hernandez"
            + "\nDate: "
            + "\nAssignment: "
            + "\nPurpose: "
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        double inputValue;
        double roundedValue;
        
        int lowerBound;
        int upperBound;
        // Begin program.
        // for loop here probably
        
        // part1
        System.out.print("Enter a value: ");
        inputValue = keyboard.nextInt();
        roundedValue = Math.sqrt(inputValue);
        System.out.print("The square root of "+inputValue+" is: "+roundedValue);
        System.out.printf("\nThe square root of "+inputValue+" rounded to three places is: %.3f",roundedValue); 
        //part2
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextDouble();
        roundedValue = Math.sqrt(inputValue);
        System.out.print("The square root of "+inputValue+" is: "+roundedValue);
        System.out.printf("\nThe square root of "+inputValue+" to three places is: %.3f",roundedValue);
        //part3
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextDouble();
        roundedValue = Math.floor(inputValue);
        System.out.print("The floor of "+inputValue+" is: "+roundedValue);
        roundedValue = Math.ceil(inputValue);
        System.out.print("\nThe ceiling of "+inputValue+" is: "+roundedValue);
        roundedValue = Math.round(inputValue);
        System.out.print("\nThe rounded value of "+inputValue+" is: "+roundedValue);
        //part4
        
        //part5
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextInt();
        roundedValue = Math.pow(inputValue,3);
        System.out.println(inputValue+" raised to the power of 3 is: "+roundedValue);
        //part6+7
        for (int i=0;i<2;i++) {
            System.out.print("Enter the lower bound: ");
            lowerBound = keyboard.nextInt();
            System.out.print("Enter the upper bound: ");
            upperBound = keyboard.nextInt();
        
            roundedValue = (lowerBound+(Math.random()*(upperBound-lowerBound)));
            System.out.print("A random number from the bounds "+lowerBound+" and "+upperBound+" is: " + roundedValue);
        }
        // part8
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextInt();
        roundedValue = Math.abs(inputValue);
        System.out.print(roundedValue);
        // part9
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextDouble();
        roundedValue = Math.abs(inputValue);
        System.out.print(roundedValue);
        // Ending statement.
        System.out.println("\n*****************************************");
        System.out.println("End program.");
    }
}
