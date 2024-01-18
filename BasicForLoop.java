
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/18/24
 * Assignment: 3.9.1 Basic For Loops
 * Purpose: Learning and understanding for loops.
 */

import java.util.Scanner;
public class BasicForLoop
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 1/18/24");
        System.out.println("Assignment: 3.9.1 Basic For Loops");
        System.out.println("Purpose: Learning and understanding for loops.");
        System.out.println("");
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int upper = 9;
        int lower = 0;
        String string1 = "";
        String string2 = "";

        // Output statements
        System.out.println();
        System.out.println("The single numeric digits in ascending order");
        for (int i=0;i<upper+1;i++) {
            string1 = string1.concat(i+" ");
        }
        System.out.println(string1);
        System.out.println();
        System.out.println("The single numeric digits in descending order");
        for (int i=9;i+1>lower;i--) {
            string2 = string2.concat(i+" ");
        }
        System.out.println(string2);
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.9.1>: Basic For Loops");
    }
}
