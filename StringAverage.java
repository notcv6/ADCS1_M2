
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 2, 2023
 * Assignment: Assignment: 2.0.0 StringAverage Check
 * Purpose: Make sure our template is correct
 */

import java.util.Scanner;
public class StringAverage
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 10/13/23");
        System.out.println("Assignment: 2.8.3 Average Length of Two Strings");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        
        // Input 2 strings output average length
        for (var i=0; i<5; i++) {
            System.out.print("Enter your first name: ");
            firstName = keyboard.nextLine();
            System.out.print("Enter your last name: ");
            lastName = keyboard.nextLine();
            
            System.out.printf("The average length of "+firstName+" and "
                +lastName+" concatenated is "
                +"%.2f.",stringAverage(firstName,lastName));
            
            System.out.println();
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.3>: Average Length of");
        System.out.println("\tTwo Strings");
    }
    
    // Takes the length of two strings and outputs the average length.
    // Accepts String input for firstName and lastName.
    public static double stringAverage(String firstName, String lastName) {
        return (firstName.length()+lastName.length())/2;
    }
}
