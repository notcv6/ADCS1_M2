/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/8/24
 * Assignment: Assignment: 3.10.8 Triangle Three While
 * Purpose: Learning and understanding the mechanics of nested while loops. 
 */

import java.util.Scanner;
public class TriangleThreeWhile
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/8/24");
        System.out.println("Assignment: 3.10.8 Triangle Three While");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested while loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int repeatCount;
        String charInput;
        String contString = "";

        // Program outputs
        while (!contString.equals("N")) {
            System.out.print("Enter a number: ");
            repeatCount = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter a letter (or character): ");
            charInput = keyboard.nextLine();
            System.out.println("");
            
            int i = repeatCount - 1;
            while (i >= 0) {
                String tempString = "";
                int j = 0;
                while (j <= i) {
                    tempString = tempString.concat(charInput);
                    j++;
                }
                System.out.println("\t" + tempString);
                i--;
            }
            
            do {
                System.out.print("\nDo you want to continue? [Y/N]: ");
                contString = keyboard.nextLine();
                System.out.println(contString.equals("Y"));
                if (!contString.equals("Y") && !contString.equals("N")) {
                    System.out.println("Unrecognized input, please try again...");
                }
            } while (!contString.equals("Y") && !contString.equals("N"));
        }

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.8>: Triangle Three While");
    }
}

