package s1;

/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: 8/25/2023
 * Assignment: 2.3.0: CodeAlong
 * Purpose: Code along to learn about input.
 * 
 */

import java.util.Scanner;

public class CodeAlong
{
    // Output header information.
    public static void main(String[]args) {
        System.out.println("\nName/Programmer: Andrew Hernandez" 
            + "\nDate: 8/25/2023" 
            + "\nAssignment: 2.3.0: CodeAlong" 
            + "\nPurpose: Code along to learn about input."
            + "\n*************************************************************\n");

        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        int age = 0;
        String firstName;
        String lastName;
        String status;
        String fullName;
        String schoolName;
        
        // Prompt the user for necessary input
        System.out.print("Enter your first name: ");
        firstName = keyboard.next();
        System.out.print("Enter your last name: ");
        lastName = keyboard.next();
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        
        // Output
        System.out.println("\nYour name is " + firstName + " " + lastName + 
            " and you are " + age + " years old!");
        
        // Prompt another example
        System.out.print("\n\nEnter your status at school: ");
        status = keyboard.next();
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        System.out.print("Enter your full name: ");
        keyboard.nextLine();
        fullName = keyboard.nextLine();
        System.out.print("Enter your school name: ");
        schoolName = keyboard.next();
        
        // Output
        System.out.println("\nYour full name is " + fullName + ", " +
            "you are " + age + "\nyears old and you " + "are a " + 
            status + " at " + schoolName + ".");
            
        // Ending statement
        System.out.println("\n**********************************************");
        System.out.println("Ending the code-along with Ms. Griswold.");
    }
}
