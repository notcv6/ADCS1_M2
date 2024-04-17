/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/16/24
 * Assignment: Assignment: 3.10.13 Box Word For
 * Purpose: Learning and understanding the mechanics of nested for loops. 
 */

import java.util.Scanner;
public class BoxWordFor
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/16/24");
        System.out.println("Assignment: 3.10.13 Box Word For");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested for loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String wordInput = "";
        
        // Program outputs
        do {
            System.out.print("Enter a word: ");
            wordInput = keyboard.nextLine();
            System.out.println("");
            
            // just for formatting
            if (wordInput != "") {
                wordInput = wordInput.toUpperCase();
                System.out.print("\t");
                System.out.println(wordInput);
                for (int i = 1;i<wordInput.length()-1;i++) {
                    System.out.print("\t");
                    // get front char and convert to string
                    String temp = new Character(wordInput.charAt(i))
                        .toString();
                    // get back char and convert to string
                    String lastChar = new Character
                        (wordInput.charAt(wordInput.length()-1-i))
                        .toString();
                    //add spaces
                    for (int x = 0;x<wordInput.length()-2;x++) {
                        temp = temp.concat(" ");
                    }
                    temp = temp.concat(lastChar);
                    System.out.println(temp);
                }
                if (wordInput.length() != 1) {
                    System.out.print("\t");
                    System.out.println(reverse(wordInput));
                }
                System.out.println();
            }
        } while (wordInput != "");
        System.out.println("Empty string detected, program ending.");

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.13>: Box Word For");
    }
    // reverse; Reverses a given string.
    // String string; the string that it will reverse.
    public static String reverse(String string) {
        String reversedWord = "";
        for (int i=0;i<string.length(); i++) {
            char ch = string.charAt(i);
            reversedWord = ch+reversedWord;
        }
        return reversedWord;
    }
}
