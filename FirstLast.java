
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 13, 2023
 * Assignment: Assignment: 2.8.2 FirstLast
 * Purpose: Using String methods & creating custom methods.
 */

import java.util.Scanner;
public class FirstLast
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 10/13/23");
        System.out.println("Assignment: 2.8.2 FirstLast");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        
        // Accept string input for firstName and lastName
        // then concatenate the beginning and last characters respectively.
        for (var i=0; i<5; i++) {
            System.out.print("Enter your first name: ");
            firstName = keyboard.nextLine();
            System.out.print("Enter your last name: ");
            lastName = keyboard.nextLine();
            
            System.out.println("The first character of "+firstName+" and the "
                +"last character of \n\t"+lastName+" concatenated is "
                +firstLast(firstName,lastName)+".");
            
            System.out.println();
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.2>: firstLast");
    }
    
    /* firstLast; returns a concatenated String with the first character of the
     * first input and the last character of the last input.
     * Accepts string input for firstName and lastName.
     */
    public static String firstLast(String firstName,String lastName) {
        return firstName.substring(0,1).concat(lastName.substring(lastName.length()-1));
    }
}
