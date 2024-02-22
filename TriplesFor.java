/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/21/24
 * Assignment: Assignment: 3.10.17 Triples For
 * Purpose: Learning and understanding the mechanics of nested while loops. 
 */

import java.util.Scanner;
public class TriplesFor
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/21/24");
        System.out.println("Assignment: 3.10.17 Triples For");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested while loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int input;

        // Program output
        System.out.print("Enter a number: ");
        input = keyboard.nextInt();
        System.out.println();
        
        for (int a = 1; a <= input; a++) {
            for (int b = a + 1; b <= input; b++) {
                for (int c = b + 1; c <= input; c++) {
                    if (a * a + b * b == c * c && c % 2 != 0 && gcd(a, b, c) == 1) {
                        if ((a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0)) {
                            System.out.println(a + ", " + b + ", " + c);
                        }
                    }
                }
            }
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.17>: Triples For");
    }

    public static int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

