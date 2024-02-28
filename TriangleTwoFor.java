/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/6/24
 * Assignment: Assignment: 3.10.5 Triangle Two For
 * Purpose: Learning and understanding the mechanics of nested for loops. 
 */

import java.util.Scanner;
public class TriangleTwoFor
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/6/24");
        System.out.println("Assignment: 3.10.5 Triangle Two For");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested for loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int repeatCount;
        String charInput;
        String contString = "";
        boolean containsN = false;

        // Program outputs
        
        do {
            System.out.print("Enter a number: ");
            repeatCount = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter a letter (or character): ");
            charInput = keyboard.nextLine();
            System.out.println("");
            
            for(int i=0; i<repeatCount; i++) {
                String tempString = "\t";
                for(int j=0; j<repeatCount-i-1; j++) {
                    tempString = tempString.concat(" ");
                }
                for(int k=0; k<=i; k++) {
                    tempString = tempString.concat(charInput);
                }
                System.out.println(tempString);
            }
            
            System.out.print("\nDo you want to continue? [Y/N]: ");
            contString = keyboard.nextLine();
            for (int i = 0; i < contString.length(); i++) {
                if (contString.substring(i, i+1).equals("N")) {
                    containsN = true;
                }
            }
        } while (!containsN);

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.5>: Triangle Two For");
    }
}