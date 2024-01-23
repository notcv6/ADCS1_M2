
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/18/24
 * Assignment: 3.9.4 Factorial
 * Purpose: Learning and understanding for loops.
 */

 import java.util.Scanner;
 public class Factorial
 {
     public static void main(String[] args)
     {
         // Output Header Information
         System.out.println("\nName/Programmer: Andrew Hernandez");
         System.out.println("Date: 1/18/24");
         System.out.println("Assignment: 3.9.4 Factorial");
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
             System.out.println("The factorial of "+input
                 +" is: "+factorialIt(input));
             
             System.out.println();
         } while (input > 0);
         System.out.println("A zero or negative number was entered, "
             +"\tprogram ending. ");
         
         // Ending statement
         System.out.println();
         System.out.println("**************************************************");
         System.out.println("Ending Assignment <3.9.4>: Factorial");
     }
     // boxIt; Accepts an integer and returns a box containing the numbers in
     // reversing order.
     // integer; Accepts integer input.
     public static int factorialIt(int integer) {
        int n = 0;
        int x = 0;
        for (int i=integer;i>0;i--) {
            x = i*(i-n);
        }
        return x;
     }
 }
 