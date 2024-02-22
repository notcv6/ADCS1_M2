/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/21/24
 * Assignment: Assignment: 3.10.16 Triangle Word While
 * Purpose: Learning and understanding the mechanics of nested while loops. 
 */

import java.util.Scanner;
public class TriangleWordWhile
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/21/24");
        System.out.println("Assignment: 3.10.16 Triangle Word While");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested while loops. ");
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

            if (!wordInput.isEmpty()) {
                wordInput = wordInput.toUpperCase();
                String tmp = wordInput.substring(1);
                String reversedTmp = "";
                int i = tmp.length() - 1;
                while (i >= 0) {
                    reversedTmp += tmp.charAt(i);
                    i--;
                }
                String line = reversedTmp + wordInput;

                i = 0;
                while (i < wordInput.length()) {
                    int j = 0;
                    while (j < line.length()) {
                        if (i + 1 == wordInput.length() || Math.abs(j - line.length()/2) == i) {
                            System.out.print(line.charAt(j));
                        } else {
                            System.out.print(" ");
                        }
                        j++;
                    }
                    System.out.println();
                    i++;
                }
                System.out.println();
            }
        } while (!wordInput.isEmpty());
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.16>: Triangle Word While");
    }
}

