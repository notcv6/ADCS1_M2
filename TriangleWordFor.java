/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/21/24
 * Assignment: Assignment: 3.10.15 Triangle Word For
 * Purpose: Learning and understanding the mechanics of nested for loops. 
 */

import java.util.Scanner;
public class TriangleWordFor
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/21/24");
        System.out.println("Assignment: 3.10.15 Triangle Word For");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested for loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String wordInput = "";

        // Program output
        do {
            System.out.print("Enter a word: ");
            wordInput = keyboard.nextLine();
            System.out.println("");

            if (wordInput != "") {
                wordInput = wordInput.toUpperCase();
                String tmp = wordInput.substring(1);
                String reversedTmp = "";
                for (int i = tmp.length() - 1; i >= 0; i--) {
                    reversedTmp += tmp.charAt(i);
                }
                String line = reversedTmp + wordInput;

                for (int i = 0; i < wordInput.length(); i++) {
                    for (int j = 0; j < line.length(); j++) {
                        if (i + 1 == wordInput.length() || Math.abs(j - line.length()/2) == i) {
                            System.out.print(line.charAt(j));
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        } while (wordInput != "");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.15>: Triangle Word For");
    }
}

