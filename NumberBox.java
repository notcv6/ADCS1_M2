
/**
 * Name/Programmer: I love Kotoha
 * Date: 1/18/24
 * Assignment: 3.9.4 Number Box
 * Purpose: Learning and understanding for loops.
 */

import java.util.Scanner;
public class NumberBox
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 1/18/24");
        System.out.println("Assignment: 3.9.4 Number Box");
        System.out.println("Purpose: Learning and understanding for loops.");
        System.out.println("");
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;

        // Output statements
        do {
            System.out.print("Enter a non-zero, positive integer: ");
            input = keyboard.nextInt();
            System.out.println("The number box with a value of "+input
                +" is: ");
            boxIt(input);
            System.out.println();
        } while (input > 0);
        System.out.println("A zero or negative number was entered, "
            +"\tprogram ending. ");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.4>: Number Box");
    }
    // boxIt; Accepts an integer and returns a box containing the numbers in
    // reversing order.
    // integer; Accepts integer input.
    public static void boxIt(int integer) {
        int x = integer;

        for (int i=0;i<integer+1;i++) {
            if (i != 0) {
                System.out.println("\t##"+i+"##--##"+x+"##--##"+i+"##");
                x--;
            }
        }
    }
}
