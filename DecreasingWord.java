/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/29/24
 * Assignment: 3.9.11 Decreasing Word
 * Purpose: Practice writing for loops.
 */

import java.util.Scanner;
public class DecreasingWord
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/29/24");
        System.out.println("Assignment: 3.9.11 Decreasing Word ");
        System.out.println("Purpose: Practice writing for loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String input = "";

        // Output statement
        do {
            System.out.print("Enter a string, empty string to end: ");
            input = keyboard.nextLine();
            if (!input.equals("")) {
                System.out.println("The string "+input+" decreased is: ");
                decreaseIt(input);
            }
            System.out.println("");
        } while (!input.equals(""));
        System.out.println("An empty string was entered, program ending.");
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.11>: Decreasing Word");
    }
    // decreaseIt; Accepts a string input and prints it decreasing the letters each time.
    // Accepts string input for string.
    public static void decreaseIt(String string) {
        for (int i = string.length();i>0;i--) {
            System.out.println("\t"+string.substring(0,i));
        }
    }
}