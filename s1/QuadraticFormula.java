package s1;


/**
 * Name/Programmer: I love Kotoha
 * Date: November 27, 2023
 * Assignment: 3.2.5: Quadratic Formula
 * Purpose: Review of Methods
 */

import java.util.Scanner;
public class QuadraticFormula
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: November 27, 2023");
        System.out.println("Assignment: 3.2.5: Quadratic Formula");
        System.out.println("Purpose: Review of Methods");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        // Part 1 output
        System.out.print("Enter the a coefficient of the quadratic equation: ");
        a = keyboard.nextInt();
        System.out.print("Enter the b coefficient of the quadratic equation: ");
        b = keyboard.nextInt();
        System.out.print("Enter the c coefficient of the quadratic equation: ");
        c = keyboard.nextInt();
        
        System.out.println();
        System.out.println("Part 1 Output");
        System.out.println("---------------");
        System.out.println();
        System.out.printf("For a quadratic equation with coefficients of "
            +a+", "+b+", \n\tand "+c+", the roots are: "
            +"%.4f"+" and "+"%.4f"+".",rootCalc(a,b,c,0),rootCalc(a,b,c,1));
        System.out.println();
        
        // Part 2 output
        System.out.println();
        System.out.println("Part 2 Output");
        System.out.println("---------------");

        System.out.println();
        a = 5;
        b = -8;
        c = 3;
        calcAndPrint(a,b,c);
        System.out.println();
        
        System.out.println();
        a = 2;
        b = -4;
        c = -3;
        calcAndPrint(a,b,c);
        System.out.println();
        
        System.out.println();
        a = 9;
        b = -6;
        c = 1;
        calcAndPrint(a,b,c);
        System.out.println();
        
        System.out.println();
        a = 1;
        b = 3;
        c = -4;
        calcAndPrint(a,b,c);
        System.out.println();
        
        System.out.println();
        a = 1;
        b = -8;
        c = 5;
        calcAndPrint(a,b,c);
        System.out.println();
        
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.2.5>: Quadratic Formula");
    }
    // RootCalc; calculates the roots for a quadratic equation.
    // takes integers a, b, c for coefficients of a quadratic equation, bit is an integer that is either 0 or 1 that decides whether it will run the positive formula or the negative. 
    public static double rootCalc (int a, int b, int c, int bit) {
        if (bit == 0) {
            return (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        } else {
            return (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        }
    }
    // calcAndPrint; calculates and prints the roots and coefficients of a quadratic equation.
    // takes an integer for coefficients a, b, and c.
    public static void calcAndPrint (int a, int b, int c) {
        double x = rootCalc(a,b,c,0);
        double y = rootCalc(a,b,c,1);
        
        System.out.printf("For a quadratic equation with coefficients of "
            +a+", "+b+", \n\tand "+c+", the roots are: "
            +"%.4f"+" and "+"%.4f"+".",x,y);
    }
}
