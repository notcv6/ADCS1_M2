/**
 * Name/Programmer: I love Kotoha
 * Date: 1/29/24
 * Assignment: 3.9.12 Backwards Word
 * Purpose: Practice writing for loops.
 */

import java.util.Scanner;
import s1.MiddleLetter;
public class BackwardsWord
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 1/29/24");
        System.out.println("Assignment: 3.9.12 Backwards Word ");
        System.out.println("Purpose: Practice writing for loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String input = "";

        // Output statement
        do {
            System.out.print("Enter a string, empty string to end: ");
            input = keyboard.nextLine();
            if (!input.equals("")) {
                System.out.print("For the string "+input
                    +"\n\tthe first letter is: "
                    +input.substring(0,1)
                    +"\n\tthe last letter is: "
                    +input.substring(input.length()-1,input.length())
                    +"\n\tthe middle letter is: "
                    +input.substring(MiddleLetter.middleIndex(input)
                        ,MiddleLetter.middleIndex(input)+1)
                    +"\n\tthe string backwards is: "+getBackwards(input));
            }
            System.out.println("");
        } while (!input.equals(""));
        System.out.println("An empty string was entered, program ending.");

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.12>: Backwards Word");
    }
    // getBackwards; Accepts string input and prints it in reverse order.
    // Accepts string input for string.
    public static String getBackwards(String string) {
        String temp = "";
        for (int i = string.length();i>0;i--) {
            temp = temp.concat(string.substring(i-1,i));
        }
        return temp;
    }
}