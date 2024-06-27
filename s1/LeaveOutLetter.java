package s1;


/**
 * Name/Programmer: I love Kotoha
 * Date: October 17, 2023
 * Assignment: Assignment: 2.8.6 Leave Out Letter
 * Purpose: Using String methods & creating custom methods
 */

import java.util.Scanner;
public class LeaveOutLetter
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: October 17, 2023");
        System.out.println("Assignment: 2.8.6 Leave Out Letter");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String string;
        int index = 5;
        
        // Output
        System.out.print("Enter a string: ");
        string = keyboard.nextLine();
        
        System.out.println("The string "+string+" with the character at"
            +"\n\tindex "+index+" removed is: "
            +leaveOutLetter(string, index));
        System.out.println();
        
        string = "Mississippi";
        index = 0;
        System.out.println("The string "+string+" with the character at"
            +"\n\tindex "+index+" removed is: "
            +leaveOutLetter(string, index));
        System.out.println();
        
        index = string.length();
        System.out.println("The string "+string+" with the character at"
            +"\n\tindex "+index+" removed is: "
            +leaveOutLetter(string, index));
        System.out.println();
        
        string = "New York";
        System.out.println("The string "+string+" with the character at"
            +"\n\tindex "+3+" removed is: "
            +leaveOutLetter(string, 3));
        System.out.println();

        System.out.println("The string "+string+" with the character at"
            +"\n\tindex "+7+" removed is: "
            +leaveOutLetter(string, 7));
        System.out.println();
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.6>: Leave Out Letter");
    }
    
    // leaveOutLetter; Removes a character from a string at the specified index and returns the result as a string.
    // Accepts an string input for string and integer input for index.
    public static String leaveOutLetter(String string, int index) {
        if (string.length() == index) {
            return string.substring(0, index-1)+string.substring(index);
        } else {
            return string.substring(0, index)+string.substring(index+1);
        }
    }
}
