/**
 * Name/Programmer: Andrew Hernandez
 * Date: April 30, 2024
 * Assignment: 7.1.1 Classes & Objects Introduction
 * Purpose: Introduction to Classes & Objects
 */

public class PersonDriver
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
        Person me = new Person("Andrew", "Hernandez", 17
            , "Southwest Career & Technical Academy", "Digital Game Design"
            , 2025);
        Person Adriane = new Person("Adriane", "Hernandez", 16
            , "Southwest Career & Technical Academy", "Engineering"
            , 2026);

        // Print out my information
        System.out.println("First Name: "+me.getFirstName());
        System.out.println("Last Name: "+me.getLastName());
        System.out.println("Age: "+me.getAge());
        System.out.println("Program: "+me.getProgram());
        System.out.println("School: "+me.getSchool());
        System.out.println("Graduating Year: "+me.getYear());

        System.out.println();
        System.out.println(me);
        System.out.println();

        // Print out Adriane's information
        System.out.println("First Name: "+Adriane.getFirstName());
        System.out.println("Last Name: "+Adriane.getLastName());
        System.out.println("Age: "+Adriane.getAge());
        System.out.println("Program: "+Adriane.getProgram());
        System.out.println("School: "+Adriane.getSchool());
        System.out.println("Graduating Year: "+Adriane.getYear());

        System.out.println();
        System.out.println(Adriane);
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <7.1.1>: Classes & Objects");
        System.out.println("\tIntroduction");
    }
}