
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 17, 2023
 * Assignment: 2.8.5 Switch First Letter
 * Purpose: Using String methods & creating custom methods
 */

import java.util.Scanner;
public class SwitchFirstLetter
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: October 17, 2023");
        System.out.println("Assignment: 2.8.5 Switch First Letter");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String string1;
        String string2;
        
        // Output
        for (int i=0;i<5;i++) {
            System.out.print("Enter a string: ");
            string1 = keyboard.nextLine();
            System.out.print("Enter a second string: ");
            string2 = keyboard.nextLine();
            
            System.out.println("The strings "+string1+" and "+string2
                + " with the first"+"\n\tletters switched are: "
                +switchFirstLetter(string1, string2));
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.5>: Switch First Letter");
    }
    
    // switchFirstLetter; Switches the first letters of two strings and returns the result as a string.
    // Accepts two string inputs for string1 and string2.
    public static String switchFirstLetter(String string1, String string2) {
        return string2.substring(0,1).concat(string1.substring(1))+" and "+string1.substring(0,1).concat(string2.substring(1));
    }
}
