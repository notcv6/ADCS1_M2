/**
 * Name/Programmer: I love Kotoha
 * Date: May 2, 2024
 * Assignment: 7.1.2 Classes & Objects Introduction
 * Purpose: Introduction to Classes & Objects
 */

public class PersonDriver2
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: May 2, 2024");
        System.out.println("Assignment: 7.1.2 Classes & Objects Introduction");
        System.out.println("Purpose: Introduction to Classes & Objects");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Person2 me = new Person2("Miyako", "Kujou", 17
            , "Hakusen Academy", "Digital Game Design"
            , 2025);
        Person2 person = new Person2();

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

        System.out.println("First Name: "+person.getFirstName());
        System.out.println("Last Name: "+person.getLastName());
        System.out.println("Age: "+person.getAge());
        System.out.println("Program: "+person.getProgram());
        System.out.println("School: "+person.getSchool());
        System.out.println("Graduating Year: "+person.getYear());

        System.out.println();
        System.out.println(person);
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <7.1.2>: Classes & Objects");
        System.out.println("\tIntroduction");
    }
}