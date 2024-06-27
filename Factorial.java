
/**
 * Name/Programmer: I love Kotoha
 * Date: 1/18/24
 * Assignment: 3.9.5 Factorial
 * Purpose: Learning and understanding for loops.
 */

 import java.util.Scanner;
 public class Factorial
 {
     public static void main(String[] args)
     {
         // Output Header Information
         System.out.println("\nName/Programmer: I love Kotoha");
         System.out.println("Date: 1/18/24");
         System.out.println("Assignment: 3.9.5 Factorial");
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
         System.out.println("Ending Assignment <3.9.5>: Factorial");
     }
     // boxIt; Accepts an integer and returns a box containing the numbers in
     // reversing order.
     // integer; Accepts integer input.
     public static long factorialIt(int integer) {
        long x = integer;
        for (int i=integer-1;i>0;i--) {
            x = x*i;
        }
        return x;
     }
 }
 