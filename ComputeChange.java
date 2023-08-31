/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: x/x/2023
 * Assignment: 2.3.6: ComputeChange
 * Purpose: .
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ComputeChange
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: Andrew Hernandez"
            + "\nDate: 8/31/2023"
            + "\nAssignment: 2.3.6 ComputeChange"
            + "\nPurpose: "
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        double moneyInput;
        double dollars;
        double quarters;
        double dimes;
        double nickels;
        double pennies;
        
        DecimalFormat df = new DecimalFormat("0");
        
        // Begin program.
        System.out.print("Please input an amount in dollars and cents.");
        moneyInput = keyboard.nextDouble();
        
        System.out.println(moneyInput);
        
        dollars = Math.floor(moneyInput/1);
        if (dollars >= 0) {
            moneyInput = moneyInput-(dollars*1);
        }
        quarters = Math.floor(moneyInput/0.25);
        if (quarters >= 0) {
            moneyInput = moneyInput-(quarters*0.25);
        }
        dimes = Math.floor(moneyInput/0.10);
        if (dimes >= 0) {
            moneyInput = moneyInput-(dimes*0.10);
        }
        nickels = Math.floor(moneyInput/0.05);
        if (nickels >= 0) {
            moneyInput = moneyInput-(nickels*.05);
        }
        pennies = Math.floor(moneyInput/0.01);
        
        
        System.out.println("Dollars: " + df.format(dollars));
        System.out.println("Quarters: " + df.format(quarters));
        System.out.println("Dimes: " + df.format(dimes));
        System.out.println("Nickels: " + df.format(nickels));
        System.out.println("Pennies: " + df.format(pennies));
        // Ending statement.
        System.out.println("****************************************************");
        System.out.println("End program.");
    }
}
