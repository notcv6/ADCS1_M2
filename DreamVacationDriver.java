/**
 * Name/Programmer: Andrew Hernandez
 * Date: April 30, 2024
 * Assignment: 7.1.1 Classes & Objects Introduction
 * Purpose: Introduction to Classes & Objects
 */

import java.util.Scanner;
public class DreamVacationDriver
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: April 30, 2024");
        System.out.println("Assignment: 7.1.1 Classes & Objects Introduction");
        System.out.println("Purpose: Introduction to Classes & Objects");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String destination;
        double cost;
        int duration;
        String theme;
        Boolean reality;

        //
        System.out.print("asdf: ");
        destination = keyboard.nextLine();
        System.out.print("\nasdf: ");
        cost = keyboard.nextDouble();
        System.out.print("\nasdf: ");
        duration = keyboard.nextInt();
        System.out.print("\nasdf: ");
        keyboard.nextLine();
        theme = keyboard.nextLine();
        System.out.print("\nasdf: ");
        reality = keyboard.nextBoolean();

        //
        DreamVacation dreamVacation = new DreamVacation(destination, cost, duration, theme, reality);
        System.out.println(dreamVacation);

        //
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <7.1.1>: Classes & Objects");
        System.out.println("\tIntroduction");
    }
}