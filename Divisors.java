
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/5/24
 * Assignment: Assignment: 3.8.7 Divisors
 * Purpose:  Practice writing while and do-while loops.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Divisors
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/5/24");
        System.out.println("Assignment: 3.8.7 Divisors");
        System.out.println("Purpose: Learning and understanding while loops.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;
        
        //
        do {
            System.out.print("Enter a non-zero, positive integer: ");
            input = keyboard.nextInt();
            System.out.println(determineDivisors(input));
        } while (input > 0);
        System.out.println("A zero or negative number was entered, "
            +"\tprogram ending. ");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.8.7>: Divisors");
    }
    // determineDivisors; Determines the divisors of a given integer and returns them as a string.
    // integer; Accepts an integer.
    public static String determineDivisors (int integer) {
        String string = "";
        int x = 0;
        int i = 1;
        do {
            if (x == 5) {
                string = string.concat("\n");
                x = 0;
            } else {
                if (integer % i == 0) {
                    string = string.concat("\t"+i);
                    x++;
                }
            }
        } while (i<integer+1);

        //ArrayList myList = new ArrayList();
        //for (int i = 1;i<integer+1;i++) {
        //    if (integer % i == 0) {
        //        myList.add(i);
        //    }
        //}
        //for (int i = 0;i<myList.size();i++) {
        //    
        //    if (x == 5) {
        //        string = string.concat("\n");
        //        x = 0;
        //    } else {
        //        string = string.concat("\t"+myList.get(i));
        //        x++;
        //    }
        //}
        //return string;
    }
}
