package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: x/x/2023
 * Assignment: 3.x.x: TwoWayIf
 * Purpose: To generate a template for future use.
 * 
 */

import java.util.Scanner;

public class TwoWayIf
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: I love Kotoha"
            + "\nDate: 9/28/2023"
            + "\nAssignment: 2.6.1 TwoWayIf."
            + "\nPurpose: "
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        
        // Begin program.
        int x;
        int y = 20;
        if (y == 20) {
            x = 5;
            System.out.println("When y is equal to 20, x is "+x);
        }
        
        double payRate = 8.50;
        int hours = 45;
        if (hours > 40) {
            payRate = payRate*1.5;
            System.out.println("The regular pay rate is 8.5, but with overtime it is "+payRate);
        }
        
        double commissionRate;
        int sales = 10000;
        if (sales >= 10000) {
            commissionRate = 0.2;
            System.out.println("If sales is greater than or equal to 10000, the commission rate is "+commissionRate);
        }
        
        int fees;
        boolean max = true;
        if (max == true) {
            fees = 50;
            System.out.println("If max is true, then fees is equal to "+fees);
        }
        
        x = 250;
        int z;
        if (x > 100) {
            y = 20;
            z = 40;
            System.out.println("If x is greater than 100, y becomes "+y+", and z becomes "+z);
        }
        
        int a = 9;
        int b;
        int c;
        if (a < 10) {
            b = 0;
            c = 1;
            System.out.println("If a is greater than 100, b becomes "+b+", and c becomes "+c);
        }
        
        String myCharacter = "Done";
        int index;
        if (myCharacter.contains("d") || myCharacter.contains("D")) {
            System.out.println("Goodbye.");
        }
        // Ending statement.
        System.out.println("\n****************************************************");
        System.out.println("Ending assignment 2.6.1 TwoWayIf.");
    }
}
