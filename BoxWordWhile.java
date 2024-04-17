/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/16/24
 * Assignment: Assignment: 3.10.14 Box Word While
 * Purpose: Learning and understanding the mechanics of nested while loops. 
 */

import java.util.Scanner;
public class BoxWordWhile
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/16/24");
        System.out.println("Assignment: 3.10.14 Box Word While");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested while loops. ");
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
                int i = 1;
                while (i<wordInput.length()-1) {
                    System.out.print("\t");
                    // get front char and convert to string
                    String temp = new Character(wordInput.charAt(i))
                        .toString();
                    // get back char and convert to string
                    String lastChar = new Character
                        (wordInput.charAt(wordInput.length()-1-i))
                        .toString();
                    // counter variable
                    int x = 0;
                    //add spaces
                    while (x<wordInput.length()-2) {
                        temp = temp.concat(" ");
                        x++;
                    }
                    temp = temp.concat(lastChar);
                    System.out.println(temp);
                    i++;
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
        System.out.println("Ending Assignment <3.10.14>: Box Word While");
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
