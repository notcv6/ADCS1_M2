
/**
 * Name/Programmer: I love Kotoha
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
        System.out.println("\nName/Programmer: I love Kotoha");
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
            if (input.equals("")) {
                System.out.println("An empty string was entered, program ending.");
                
            } else {
                System.out.print("Enter the character to be removed: ");
                character = keyboard.nextLine();
                System.out.println("The string "+input+" with the letter "
                    +character+" removed is: "+remove(input, character));
            }
        } while (input.equals("") == false);
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.12>: LetterRemover");
    }
    // 
    // 
    public static String remove (String input, String character) {
        String temp = input;
        while (temp.indexOf(character) != -1) {
            temp = temp.substring(0, temp.indexOf(character))+temp.substring(temp.indexOf(character)+1, temp.length());
        }

        return temp;
    }
}
