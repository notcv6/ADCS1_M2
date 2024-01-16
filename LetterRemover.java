
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/9/24
 * Assignment: Assignment: 3.8.8 LetterRemover
 * Purpose:  Practice writing while and do-while loops.
 */

import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
public class LetterRemover
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/11/24");
        System.out.println("Assignment: 3.8.11 LetterRemover");
        System.out.println("Purpose: Practice writing while and do-while");
        System.out.println("\tloops.");
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String input;
        String character;
        
        //
        do {
            System.out.print("Enter a string: ");
            input = keyboard.nextLine();
            System.out.print("Enter the character to be removed: ");
            character = keyboard.nextLine();
            System.out.println("The string "+input+" with the letter "
                +character+" removed is: "+remove(input, character));
        } while (input != "");
        System.out.println("An empty string was entered, program ending.");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.12>: LetterRemover");
    }
    // determineDivisors; Determines the divisors of a given integer and returns them as a string.
    // integer; Accepts an integer.
    public static String remove (String input, String character) {
        String temp = input;
        int i = 0;
        do {
            temp = temp.substring(temp.indexOf(character)+1, temp.length());
            i++;
        } while (i<input.length());

        return temp;
    }
}
