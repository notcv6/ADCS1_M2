
/**
 * Name/Programmer: Andrew Hernandez
 * Date: October 2, 2023
 * Assignment: Assignment: 2.0.0 Template Check
 * Purpose: Make sure our template is correct
 */

import java.util.Scanner;
public class Template
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: October 2, 2023");
        System.out.println("Assignment: 2.0.0: Template Check");
        System.out.println("Purpose: The purpose of this program is to make ");
        System.out.println("\tsure our template is correct before moving ");
        System.out.println("\tforward with any future assignments.");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("There is a comment in my code here that sets up ");
        System.out.println("\tfor my Variable declarations. In this ");
        System.out.println("\tsection I have added my keyboard object ");
        System.out.println("\tso I don't have to type it in all the time. ");
        System.out.println("\tI have also added the import statement above ");
        System.out.println("\tmy class header. More comments will be ");
        System.out.println("\tadded as I add more sections of code.");
        
        // Example of stacked and indented output statements
        System.out.println();
        System.out.println("This is an example of some really long output"+
            "\n\tstatement that spans more than one line"+
            "\n\twhen printed out. It is also generated"+
            "\n\tusing one println() statement, therefore"+
            "\n\tit is stacked and properly indented "+
            "\n\twithin my code. It also has its own"+
            "\n\tcomment.");
        
        // More lines of output
        System.out.println();
        System.out.println("Here are more lines of output, this time each one");
        System.out.println("\tis printed with its own println(). This");
        System.out.println("\tsection is separated by a line of white");
        System.out.println("\tspace from the previous section and it ");
        System.out.println("\twill also have its own comment section ");
        System.out.println("\tsince it is different from the print ");
        System.out.println("\tstatement above.");
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.0.0>: Template Check");
    }
}