/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/2/24
 * Assignment: Assignment: 3.10.3 Triangle One For
 * Purpose: Learning and understanding the mechanics of nested for loops. 
 */

import java.util.Scanner;
public class TriangleOneFor
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/2/24");
        System.out.println("Assignment: 3.10.3 Triangle One For");
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
        
        do {
            System.out.print("Enter a number: ");
            repeatCount = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter a letter (or character): ");
            charInput = keyboard.nextLine();
            System.out.println("");
            
            String tempString = "";
            for(int i=0;i<repeatCount;i++) {
                tempString = tempString.concat(charInput);
                System.out.println("\t"+tempString);
            }
            
            do {
                System.out.print("\nDo you want to continue? [Y/N]: ");
                contString = keyboard.nextLine();
                System.out.println(contString.equals("Y"));
                if (!contString.equals("Y") && !contString.equals("N")) {
                    System.out.println("Unrecognized input, please try again...");
                }
            } while (!contString.equals("Y") && !contString.equals("N"));
        } while (contString.indexOf("N") == -1);

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.3>: Triangle One For");
    }
}