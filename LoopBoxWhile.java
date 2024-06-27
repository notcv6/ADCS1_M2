/**
 * Name/Programmer: I love Kotoha
 * Date: 2/6/24
 * Assignment: Assignment: 3.10.12 Loop Box While
 * Purpose: Learning and understanding the mechanics of nested for loops. 
 */

import java.util.Scanner;
public class LoopBoxWhile
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: 2/6/24");
        System.out.println("Assignment: 3.10.12 Loop Box While");
        System.out.println("Purpose: Learning and understanding the ");
        System.out.println("\tmechanics of nested for loops. ");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int boxAmount;
        
        // Program outputs
        do {
            System.out.print("Enter a number: ");
            boxAmount = keyboard.nextInt();
            System.out.println("");
            
            // Math constant because I can't engineer another way
            // Creates boxAmount amount of lines
            int i = 0;
            int z = 1;
            // Creates boxAmount amount of lines
            while (i<boxAmount) {
                String temp = "\t";
                int x = boxAmount;
                while (x>i) {
                    temp = temp.concat("*");
                    x--;
                }
                int y = 0;
                while (y<z) {
                    temp = temp.concat("#");
                    y++;
                }
                System.out.println(temp);
                i++;
                z++;
            }
            System.out.println("");
        } while (boxAmount != 0);
        System.out.println("Zero detected, ending program.");
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <3.10.12>: Loop Box While");
    }
}
// 3 - 2 = 1
// 3 - 1 = 2
// 3 - 0 = 3  
//
