package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
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
        System.out.println("Name/Programmer: I love Kotoha"
            + "\nDate: "
            + "\nAssignment: "
            + "\nPurpose: "
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        double inputValue;
        double outputValue;
        
        int lowerBound;
        int upperBound;
        // Begin program.
        // for loop here probably
        
        // part1
        System.out.print("Enter a value: ");
        inputValue = keyboard.nextInt();
        outputValue = Math.sqrt(inputValue);
        System.out.print("The square root of "+inputValue+" is: "+outputValue);
        System.out.printf("\nThe square root of "+inputValue+" rounded to three places is: %.3f",outputValue); 
        //part2
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextDouble();
        outputValue = Math.sqrt(inputValue);
        System.out.print("The square root of "+inputValue+" is: "+outputValue);
        System.out.printf("\nThe square root of "+inputValue+" to three places is: %.3f",outputValue);
        //part3
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextDouble();
        outputValue = Math.floor(inputValue);
        System.out.print("The floor of "+inputValue+" is: "+outputValue);
        outputValue = Math.ceil(inputValue);
        System.out.print("\nThe ceiling of "+inputValue+" is: "+outputValue);
        outputValue = Math.round(inputValue);
        System.out.print("\nThe rounded value of "+inputValue+" is: "+outputValue);
        //part4
        
        //part5
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextInt();
        outputValue = Math.pow(inputValue,3);
        System.out.println(inputValue+" raised to the power of 3 is: "+outputValue);
        //part6+7
        for (int i=0;i<2;i++) {
            System.out.print("\nEnter the lower bound: ");
            lowerBound = keyboard.nextInt();
            System.out.print("Enter the upper bound: ");
            upperBound = keyboard.nextInt();
        
            outputValue = (lowerBound+(Math.random()*(upperBound-lowerBound)));
            System.out.printf("A random number from the bounds "+lowerBound+" and "+upperBound+" is: %.0f",outputValue);
        }
        // part8
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextInt();
        outputValue = Math.abs(inputValue);
        System.out.print("The absolute value for "+inputValue+" is: "+outputValue);
        // part9
        System.out.print("\nEnter a value: ");
        inputValue = keyboard.nextDouble();
        outputValue = Math.abs(inputValue);
        System.out.print("The absolute value for "+inputValue+" is: "+outputValue);
        // Ending statement.
        System.out.println("\n****************************************************");
        System.out.println("End program.");
    }
}
