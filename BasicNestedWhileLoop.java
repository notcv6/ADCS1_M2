/**
 * Name/Programmer: I love Kotoha
 * Date: 2/2/24
 * Assignment: Assignment: 3.10.2 Basic Nested While Loop
 * Purpose: 
 */

import java.util.Scanner;
public class BasicNestedWhileLoop
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 2/2/24");
        System.out.println("Assignment: 3.10.2 Basic Nested While Loop");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested while loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int outerValue;
        int innerValue;

        // Program outputs
        System.out.print("Enter the outer loop control value (3-5): ");
        outerValue = keyboard.nextInt();
        System.out.print("\nEnter the inner loop control value (2-4): ");
        innerValue = keyboard.nextInt();
        System.out.println("");
        
        int i = 0;
        while (i<outerValue) {
            System.out.println("Outer loop level: "+i);
            int x = 0;
            while (x<innerValue) {
                System.out.println("\tInner loop level: "+x);
                x++;
            }
            i++;
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.2>: Basic Nested While Loop");
    }
}