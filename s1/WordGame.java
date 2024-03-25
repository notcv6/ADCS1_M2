package s1;

/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: 8/25/2023
 * Assignment: 2.2.2: WordGame
 * Purpose: To learn and use user input to create programs
 * 
 */

import java.util.Scanner;

public class WordGame
{
    // Output header information.
    public static void main(String[]args) {
        // Opening statement.
        System.out.println("Name/Programmer: Andrew Hernandez"
            + "\nDate: 8/25/23"
            + "\nAssignment: 2.3.2: WordGame"
            + "\nPurpose: To learn and use user input to create programs."
            + "\n****************************************************\n");
        
        // Declare variables.
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        int age;
        String cityName;
        String uniName;
        String jobName;
        String petType;
        String petName;
        
        // Begin program.
        System.out.print("What is your first name? ");
        firstName = keyboard.nextLine();
        System.out.print("What is your age? ");
        age = keyboard.nextInt();
        System.out.print("Please name a city. ");
        keyboard.nextLine();
        cityName = keyboard.nextLine();
        System.out.print("Please name a college/university. ");
        uniName = keyboard.nextLine();
        System.out.print("Please name a profession. ");
        jobName = keyboard.nextLine();
        System.out.print("What is your favorite type of animal? ");
        petType = keyboard.nextLine();
        System.out.print("What would you name a pet? ");
        petName = keyboard.nextLine();
        
        System.out.println("\nThere once was a person named " + firstName + 
            " who lived in " + cityName + ". \nAt the age of " + age + 
            ", firstName went to college at " + uniName + ". \n" + firstName + 
            " graduated and went to work as a(n) " + jobName + ". \nThen, " 
            + firstName + " adopted a(n) " + petType + " named " + petName + 
            ".  \nThey both lived happily ever after!");
        
        // Ending statement.
        System.out.println("****************************************************");
        System.out.println("End program.");
    }
}
