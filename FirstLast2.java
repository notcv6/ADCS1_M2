
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 17, 2023
 * Assignment: Assignment: 2.8.7 First and Last, Part 2
 * Purpose: Using String methods & creating custom methods.
 */

import java.util.Scanner;
public class FirstLast2
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 10/17/23");
        System.out.println("Assignment: 2.8.7 First and Last, Part 2");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String string1 = "";
        String string2 = "";
        
        // Accept string input for firstName and lastName
        // then compares both strings using the testChars method.
        for (var i=0; i<5; i++) {
            System.out.print("Enter the first string: ");
            string1 = keyboard.nextLine();
            System.out.print("Enter the last string: ");
            string2 = keyboard.nextLine();
            
            if (testChars(string1, string2) == true) {
                System.out.println("The first character of "+string1+" and the "
                    +"last character of \n\t"+string2+" are the same. ");
            } else {
                System.out.println("The first character of "+string1+" and the "
                    +"last character of \n\t"+string2+" are not the same. ");
            }
            
            System.out.println();
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.7>: First and Last, Part 2");
    }
    
    // testChars; Compares the first and last characters of two strings
    // and returns whether or not they are the same in the form of a boolean.
    // Accepts string input for string1 and string2.
    public static boolean testChars(String string1, String string2) {
        return string1.substring(0,1).equals(string2.substring(string2.length()-1,string2.length()));
    }
}
