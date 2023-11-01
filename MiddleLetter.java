
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 17, 2023
 * Assignment: Assignment: 2.8.4 MiddleLetter
 * Purpose: Using String methods & creating custom methods
 */

import java.util.Scanner;
public class MiddleLetter
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: October 17, 2023");
        System.out.println("Assignment: 2.8.4 MiddleLetter");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String string;
        
        // 
        for (int i = 0;i<5;i++) {
            System.out.print("Input a string: ");
            string = keyboard.nextLine();
            System.out.println("The middle letter of "+string+" is "
                +string.substring(middleIndex(string),middleIndex(string)+1));
        }
        
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.4>: ");
    }
    
    public static int middleIndex (String string) {
        return Math.round(string.length()/2);
    }
}