
/**
 * Name/Programmer: I love Kotoha
 * Date: 1/18/24
 * Assignment: 3.9.2 Multiples of Ten
 * Purpose: Learning and understanding for loops.
 */

import java.util.Scanner;
public class MultipleOfTens
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 1/18/24");
        System.out.println("Assignment: 3.9.2 Multiples of Ten");
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
            System.out.println("The first "+input
                +" multiples of 10 are: "+multiples(input));
            System.out.println();
        } while (input > 0);
        System.out.println("A zero or negative number was entered, "
            +"\tprogram ending. ");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.2>: Multiples of Ten");
    }
    // multiples; Accepts an integer and returns a string with the 
    // multiples of 10 of that specified number.
    // integer; Accepts integer input.
    public static String multiples(int integer) {
        String string = "";

        for (int i=0;i<integer+1;i++) {
            if (i%6 == 0) {
                string = string.concat("\n\t");
            } else if (i != 0) {
                string = string.concat(i*10+"\t");
            }
        }
        
        return string;
    }
}
