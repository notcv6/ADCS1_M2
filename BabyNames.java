
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 2, 2023
 * Assignment: Assignment: 2.0.0 BabyNames
 * Purpose: Make sure our template is correct
 */

import java.util.Scanner;
public class BabyNames
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: ");
        System.out.println("Assignment: ");
        System.out.println("Purpose: ");
        System.out.println("");
        System.out.println("");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String string1;
        String string2;
        String string3;
        
        // 
        System.out.print("Enter the first baby name: ");
        string1 = keyboard.nextLine();
        System.out.print("Enter the second baby name: ");
        string2 = keyboard.nextLine();
        System.out.print("Enter the third baby name: ");
        string3 = keyboard.nextLine();
        
        System.out.println("The lowercase representation of the names"+
            \n"you entered are "
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <#.#.#>: ");
    }
    
    public static String allLower(String string) {
        return string.toLowerCase();
    }
    public static String firstUpper(String string) {
        return string.substring(0,1).toUpperCase()+string.substring(1);
    }
    public static String allPossibles(String string1, String string2, String string3) {
       return "All possible combinations of baby names based"+
           "\non your input are: "+
           "\n\t"+string1+string2+
           "\n\t"+string1+string3+
           "\n\t"+string2+string1+
           "\n\t"+string2+string3+
           "\n\t"+string3+string1+
           "\n\t"+string3+string1; 
    }
}
