/**
 * Name/Programmer: I love Kotoha
 * Date: April 30, 2024
 * Assignment: 7.1.1 Classes & Objects Introduction
 * Purpose: Introduction to Classes & Objects
 */

public class PersonDriver
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: April 30, 2024");
        System.out.println("Assignment: 7.1.1 Classes & Objects Introduction");
        System.out.println("Purpose: Introduction to Classes & Objects");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Person me = new Person("Miyako", "Kujou", 17
            , "Hakusen Academy", "Digital Game Design"
            , 2025);
        Person Sora = new Person("Sora", "Niimi", 16
            , "Hakusen Academy", "Engineering"
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

        // Print out Sora's information
        System.out.println("First Name: "+Sora.getFirstName());
        System.out.println("Last Name: "+Sora.getLastName());
        System.out.println("Age: "+Sora.getAge());
        System.out.println("Program: "+Sora.getProgram());
        System.out.println("School: "+Sora.getSchool());
        System.out.println("Graduating Year: "+Sora.getYear());

        System.out.println();
        System.out.println(Sora);
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <7.1.1>: Classes & Objects");
        System.out.println("\tIntroduction");
    }
}