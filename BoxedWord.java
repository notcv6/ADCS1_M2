
/**
 * Name/Programmer: I love Kotoha
 * Date: 1/18/24
 * Assignment: 3.9.3 Boxed Word
 * Purpose: Learning and understanding for loops.
 */

import java.util.Scanner;
public class BoxedWord
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 1/18/24");
        System.out.println("Assignment: 3.9.3 Boxed Word");
        System.out.println("Purpose: Learning and understanding for loops.");
        System.out.println("");
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String input;

        // Output statements
        do {
            System.out.print("Enter a string with no spaces: ");
            input = keyboard.nextLine();
            if (input.equals("byebye") == false) {
                System.out.println("The boxed word of "+input
                +" is: ");
                boxIt(input);
            } else {
                System.out.println("\"byebye\" ends the user input.");
            }
            System.out.println();
        } while (input.equals("byebye") == false);
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.3>: Boxed Word");
    }
    // boxIt; Accepts an integer and returns a box containing the numbers in
    // reversing order.
    // integer; Accepts integer input.
    public static void boxIt(String string) {
        System.out.println();
        for (int i=0;i<string.length();i++) {
            System.out.println("\t"+string);
        }
    }
}
