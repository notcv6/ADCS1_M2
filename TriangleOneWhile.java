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
        
        do {
            System.out.print("Enter a number: ");
            repeatCount = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter a letter (or character): ");
            charInput = keyboard.nextLine();
            System.out.println("");
            
            String tempString = "";
            int i = 0;
            while (i<repeatCount) {
                tempString = tempString.concat(charInput);
                System.out.println("\t"+tempString);
                i++;
            }
            
            while (!contString.equals("N") || !contString.equals("Y")) {
                System.out.print("\nDo you want to continue? [Y, N]: ");
                contString.equals()
                if (keyboard.nextLine().equals("Y")) {
                    
                } else if (keyboard.nextLine()
            }
        } while (!contString.equals("N"));

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.3>: Triangle One While");
    }
}