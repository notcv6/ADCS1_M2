/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/2/24
 * Assignment: Assignment: 3.10.3 Triangle One While
 * Purpose: Learning and understanding the mechanics of nested for loops. 
 */

import java.util.Scanner;
public class TriangleOneWhile
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/2/24");
        System.out.println("Assignment: 3.10.3 Triangle One While");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested for loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int repeatCount;
        String charInput;
        String contString = "";

        // Program outputs
        
        while (!contString.equals("N")) {
            contString = "";
            System.out.print("Enter a number: ");
            repeatCount = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter a letter (or character): ");
            charInput = keyboard.nextLine();
            System.out.println("");

            int i = 0;
            String temp = "";
            while (i<repeatCount) {
                temp = temp.concat(charInput);
                System.out.println("\t"+temp);
                i++;
            }

            do {
                System.out.print("\nDo you want to continue? [Y/N]: ");
                contString = keyboard.nextLine();
                if (!contString.equals("Y") || !contString.equals("N")) {
                    
                } else {
                    System.out.println("Unrecognized input, please try again...");
                }
            } while (!contString.equals("Y") || !contString.equals("N"));
        }

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.3>: Triangle One While");
    }
}

// t / f / t or b
// 1 / 0 / 1
// 1 / 1 / 1
// 0 / 1 / 1
// 0 / 0 / 0