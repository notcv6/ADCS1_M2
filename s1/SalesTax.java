package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: 8/25/2023
 * Assignment: 2.3.3: SalesTax
 * Purpose: To learn and use user input to create programs.
 * 
 */

import java.util.Scanner;

public class SalesTax
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: I love Kotoha"
            + "\nDate: 8/25/23"
            + "\nAssignment: 2.3.3 Sales Tax"
            + "\nPurpose: To learn and use user input to create programs."
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        double purchasePrice;
        double stateSalesTax = 0.04;
        double countySalesTax = 0.02;
        double totalSalesTax = stateSalesTax + countySalesTax;
        
        // Begin program.
        System.out.print("What is the price of the purchase?");
        purchasePrice = keyboard.nextDouble();
        
        System.out.println("The price you are originally paying is: " + 
            purchasePrice + ". \nthe state sales tax is: " + 
            stateSalesTax*100 + "%. \nThe county sales tax is: " + 
            countySalesTax*100 + "%. \nThe total sales tax is: " + 
            totalSalesTax*100 + "%. \nThe total amount you are paying is: " 
            + (totalSalesTax*purchasePrice+purchasePrice));
        
        // Ending statement.
        System.out.println("\n**************************************************");
        System.out.println("End program.");
    }
}
