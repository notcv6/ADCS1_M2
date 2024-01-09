
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 19, 2023
 * Assignment: Assignment: 2.8.8 Baby Names
 * Purpose: Using String methods & creating custom methods
 */

import java.util.Scanner;
public class BabyNames
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: October 19, 2023");
        System.out.println("Assignment: 2.8.8: Baby Names");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println("");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String string1;
        String string2;
        String string3;
        String temp;
        
        // Output
        System.out.print("Enter the first baby name: ");
        string1 = firstUpper(allLower(keyboard.nextLine()));
        System.out.print("Enter the second baby name: ");
        string2 = firstUpper(allLower(keyboard.nextLine()));
        System.out.print("Enter the third baby name: ");
        string3 = firstUpper(allLower(keyboard.nextLine()));
        System.out.println();
        
        System.out.println("The lowercase representation of the names"+
            "\nyou entered are "+allLower(string1)+", "+allLower(string2)+
            ", and "+allLower(string3)+".");
        System.out.println();
            
        System.out.println("The usual case representation of the names"+
            "\nyou entered are "+firstUpper(string1)+", "+firstUpper(string2)+
            ", and "+firstUpper(string3)+".");
        System.out.println();
            
        System.out.println(allPossibles(string1, string2, string3));
        System.out.println();
        
        System.out.println("Which of the above combination do you prefer? If"+
            "\nnone, please enter \"none\" (without the quotes).");
        temp = keyboard.nextLine();
        System.out.println();
        
        if (temp.contains(string1) && temp.contains(string2) || 
            temp.contains(string3)) {
                System.out.println(temp+" sounds like a great name for your"+
                " little one!!");
            } else if (temp.contains("none")) {
                System.out.println("Sorry you don’t like any of these names,"
                +" please \ntry again.");
            } else {
                System.out.println("That is not an accepted input, please"+
                "\ntry again.");
            }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.8>: Baby Names");
    }
    
    // allLower; Converts a string into all lower case and returns it.
    // Accepts string input for string.
    public static String allLower(String string) {
        return string.toLowerCase();
    }
    // firstUpper; Converts the first character of a string into uppercase and returns the full string.
    // Accepts string input for string.
    public static String firstUpper(String string) {
        return string.substring(0,1).toUpperCase()+string.substring(1);
    }
    // allPossibles; Returns a string containing all possible combinations of 3 inputted strings.
    // Accepts string input for string1, string2, string3.
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
