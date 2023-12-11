
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 19, 2023
 * Assignment: 2.8.9 MonthDays
 * Purpose: Using String methods & creating custom methods
 */

import java.util.Scanner;
public class MonthDays
{
    static String[] months = {"january", "february", "march", "april", "may", 
                "june", "july", "august", "september", "october", "november", 
                "december"};
                
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: October 19, 2023");
        System.out.println("Assignment: 2.8.9 Days in a Month");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int year;
        String month;
        
        // Output statements
        System.out.print("Enter the month: ");
        month = keyboard.nextLine();
        month = month.toLowerCase();
        System.out.print("Enter the year: ");
        year = keyboard.nextInt();
        System.out.println("");
        
        if (isValidMonth(month)) {
            System.out.println(firstUpper(month.substring(0,3))+" "+year+" has 31 days");
        } else {
            System.out.println(month+" is not a valid month name.");
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.9>: Days in a Month");
    }
    // Compares an inputted string to a list of months and returns a boolean.
    // Accepts string input for string.
    public static boolean isValidMonth(String string) {
        for (int i=0;i<months.length;i++) {
           if (string.equals(months[i])) {
               return true;
           }
       }
       
       return false;
    }
    // allLower; Converts the first character of a string into uppercase and returns the full string.
    // Accepts string input for string.
    public static String firstUpper(String string) {
        return string.substring(0,1).toUpperCase()+string.substring(1);
    }
}
