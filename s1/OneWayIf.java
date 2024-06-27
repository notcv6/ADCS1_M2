package s1;


/**
 * Name/Programmer: I love Kotoha
 * Date: October 2, 2023
 * Assignment: Assignment: 2.0.0 asd Check
 * Purpose: Make sure our template is correct
 */

import java.util.Scanner;
public class OneWayIf
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: October 2, 2023");
        System.out.println("Assignment: 2.0.0: asd Check");
        System.out.println("Purpose: The purpose of this program is to make ");
        System.out.println("\tsure our template is correct before moving ");
        System.out.println("\tforward with any future assignments.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int x;
        int y = 20;
        double payRate = 8.50;
        int hours = 45;
        double commissionRate;
        int sales = 10000;
        int fees;
        boolean max = true;
        int z;
        int a = 9;
        int b;
        int c;
        String myCharacter = "Done";
        int index;
        
        // 
        if (y == 20) {
            x = 5;
            System.out.println("When y is equal to 20, x is "+x);
        }
        
        if (hours > 40) {
            payRate = payRate*1.5;
            System.out.println("The regular pay rate is 8.5, but with overtime it is "+payRate);
        }
        
        
        if (sales >= 10000) {
            commissionRate = 0.2;
            System.out.println("If sales is greater than or equal to 10000, the commission rate is "+commissionRate);
        }
                
        if (max == true) {
            fees = 50;
            System.out.println("If max is true, then fees is equal to "+fees);
        }
        
        x = 250;
        if (x > 100) {
            y = 20;
            z = 40;
            System.out.println("If x is greater than 100, y becomes "+y+", and z becomes "+z);
        }
        
        if (a < 10) {
            b = 0;
            c = 1;
            System.out.println("If a is greater than 100, b becomes "+b+", and c becomes "+c);
        }
        
        if (myCharacter.contains("d") || myCharacter.contains("D")) {
            System.out.println("Goodbye.");
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.0.0>: asd Check");
    }
}
