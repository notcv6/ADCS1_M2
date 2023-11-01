
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 2, 2023
 * Assignment: Assignment: 2.0.0 LeaveOutLetter
 * Purpose: Make sure our template is correct
 */

import java.util.Scanner;
public class LeaveOutLetter
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: October 17, 2023");
        System.out.println("Assignment: 2.8.6 LeaveOutLetter");
        System.out.println("Purpose: Using String methods & creating custom");
        System.out.println("\tmethods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String string;
        int index = 0;
        
        // 
        for (int i=0;i<5;i++) {
            System.out.print("Enter a string: ");
            string = keyboard.nextLine();
        
            System.out.println("The string "+string+" with the character at"
                +"\n\tindex "+index+" removed is: "
                +leaveOutLetter(string, index));
            
            index = index + 5;
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.6>: LeaveOutLetter");
    }
    
    public static String leaveOutLetter(String string, int index) {
        return string.substring(0, index)+string.substring(index+1);
    }
}
