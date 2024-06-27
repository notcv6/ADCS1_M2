/**
 * Name/Programmer: I love Kotoha
 * Date: 2/6/24
 * Assignment: Assignment: 3.10.6 Triangle Two While
 * Purpose: Learning and understanding the mechanics of nested while loops. 
 */

import java.util.Scanner;
public class TriangleTwoWhile
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 2/6/24");
        System.out.println("Assignment: 3.10.6 Triangle Two While");
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
            
            int i = 0;
            while (i < repeatCount) {
                String tempString = "\t";
                int j = 0;
                while (j < repeatCount - i - 1) {
                    tempString = tempString.concat(" ");
                    j++;
                }
                int k = 0;
                while (k <= i) {
                    tempString = tempString.concat(charInput);
                    k++;
                }
                System.out.println(tempString);
                i++;
            }
            
            do {
                System.out.print("\nDo you want to continue? [Y/N]: ");
                contString = keyboard.nextLine();
                if (!contString.equals("Y") && !contString.equals("N")) {
                    System.out.println("Unrecognized input, please try again...");
                }
            } while (!contString.equals("Y") && !contString.equals("N"));
        }
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.6>: Triangle Two While");
    }
}