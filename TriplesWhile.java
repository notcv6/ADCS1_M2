/**
 * Name/Programmer: Andrew Hernandez
 * Date: 2/21/24
 * Assignment: Assignment: 3.10.18 Triples While
 * Purpose: Learning and understanding the mechanics of nested while loops. 
 */

import java.util.Scanner;
public class TriplesWhile
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: 2/21/24");
        System.out.println("Assignment: 3.10.18 Triples While");
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
        
        int a = 1;
        while (a <= input) {
            int b = a + 1;
            while (b <= input) {
                int c = b + 1;
                while (c <= input) {
                    if (a * a + b * b == c * c && c % 2 != 0 && gcd(a, b, c) == 1) {
                        if ((a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0)) {
                            System.out.println(a + ", " + b + ", " + c);
                        }
                    }
                    c++;
                }
                b++;
            }
            a++;
        }
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.18>: Triples While");
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

