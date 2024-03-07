/**
 * Name/Programmer: Andrew Hernandez
 * Date: March 7, 2024
 * Assignment: 4.2.5 Name And Number
 * Purpose: Traversing & Printing Arrays
 */

import java.util.Scanner;
public class NameAndNumber
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: March 7, 2024");
        System.out.println("Assignment: 4.2.5 Name And Number");
        System.out.println("Purpose: Traversing & Printing Arrays");
        System.out.println();
        System.out.println("**************************************************");

        // Variable declaration
        Scanner keyboard = new Scanner(System.in);
        int arraySize = 5;
        String[] firstNames = new String[arraySize];
        String[] lastNames = new String[arraySize];
        String[] phoneNumbers = new String[arraySize];

        // Populate the first two elements of each array
        firstNames[0] = "john";
        lastNames[0] = "doe";
        phoneNumbers[0] = "0000000000";
        firstNames[1] = "andrew";
        lastNames[1] = "hernandez";
        phoneNumbers[1] = "1234567890";
        
        System.out.println("");

        // Get input for the remaining elements
        for (int i=2;i<5;i++) {
            System.out.print("Enter the person's first name: ");
            firstNames[i] = keyboard.nextLine();
            System.out.print("Enter the person's last name: ");
            lastNames[i] = keyboard.nextLine();
            System.out.print("Enter the person's phone number (no spaces or "
                +"\n\tdashes): ");
            phoneNumbers[i] = keyboard.nextLine();
        }
        
        System.out.println("\nThe \"raw\" list of names and numbers are: ");
        System.out.println("");

        // Loop through every index and print out the values at each array
        for (int i = 0; i < arraySize; i++) {
            System.out.print("\t"); // Starting every new line with a tab
            System.out.print(firstNames[i] + "\t" + lastNames[i] + "\t" + phoneNumbers[i]); // Print values separated by tabs
            System.out.println(); // Move to the next line
        }

        System.out.println("\nThe \"formatted\" list of names and numbers are: ");
        System.out.println("");

        // Loop through every index and print out the values at each array
        for (int i = 0; i < arraySize; i++) {
            System.out.print("\t"); // Starting every new line with a tab
            
            // Format firstName and lastName
            String formattedFirstName = firstNames[i].substring(0, 1).toUpperCase() + firstNames[i].substring(1).toLowerCase();
            String formattedLastName = lastNames[i].substring(0, 1).toUpperCase() + lastNames[i].substring(1).toLowerCase();
            
            // Print formatted values separated by space
            System.out.print(formattedFirstName + " " + formattedLastName);
            
            // Format phoneNumber
            String formattedPhoneNumber = "(" + phoneNumbers[i].substring(0, 3) + ") " + phoneNumbers[i].substring(3, 6) + "-" + phoneNumbers[i].substring(6);
            
            // Print formatted phoneNumber
            System.out.print("\t" + formattedPhoneNumber);
            
            System.out.println(); // Move to the next line
        }

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.2.5> Name And Number");
    }
}