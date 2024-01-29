
/**
 * Name/Programmer: Andrew Hernandez
 * Date: 1/11/24
 * Assignment: 3.8.10 Perfect Number
 * Purpose: Practice writing while and do-while loops.
 */

 import java.util.Scanner;
 public class PerfectNumber
 {
     public static void main(String[] args)
     {
         // Output Header Information
         System.out.println("\nName/Programmer: Andrew Hernandez");
         System.out.println("Date: 1/11/24");
         System.out.println("Assignment: 3.8.10 Perfect Number");
         System.out.println("Purpose: Practice writing while and do-while");
         System.out.println("\tloops.");
         System.out.println();
         System.out.println("**************************************************");
         
         // Variable declarations
         Scanner keyboard = new Scanner(System.in);
         int input;
 
         // Output statements
         do {
             System.out.print("Enter a non-zero, positive integer: ");
             input = keyboard.nextInt();
             if (input != 0) {
                if (isPerfect(input)) {
                    System.out.println("The number "+input
                    +" is a perfect number.");
                } else {
                    System.out.println("The number "+input
                    +" is not a perfect number.");
                }
                System.out.println();
             }
         } while (input > 0);
         System.out.println("A zero or negative number was entered, "
             +"\tprogram ending. ");
         
         // Ending statement
         System.out.println();
         System.out.println("**************************************************");
         System.out.println("Ending Assignment <3.8.10>: Perfect Number");
     }
     // boxIt; Accepts an integer and returns a box containing the numbers in
     // reversing order.
     // integer; Accepts integer input.
     public static boolean isPerfect(int integer) {
        int temp = 0;
        int i = 1;
        do {
            if (integer%i == 0) {
                temp = temp+i;
            }
            i++;
        } while (i<integer);

        if (temp==integer) {
            return true;
        } else {
            return false;
        }
     }
 }
 