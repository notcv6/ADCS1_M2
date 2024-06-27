/**
 * Name/Programmer: I love Kotoha
 * Date: April 30, 2024
 * Assignment: 7.1.1 Classes & Objects Introduction
 * Purpose: Introduction to Classes & Objects
 */

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private String school;
    private String program;
    private int graduatingYear;

    public Person(String fn, String ln, int ag, String sc, String pg, int yr) {
        firstName = fn; 
        lastName = ln;
        age = ag;
        school = sc;
        program = pg;
        graduatingYear = yr;
    
    }
    
    // getFirstName; Returns the first name from a person object.
    public String getFirstName() {
        return firstName;
    }

    // getLastName; Returns the last name from a person object.
    public String getLastName() {
        return lastName;
    }

    // getAge; Returns the age from a person object.
    public int getAge() {
        return age;
    }

    // getProgram; Returns the program from a person object.
    public String getProgram() {
        return program;
    }

    // getSchool; Returns the school from a person object.
    public String getSchool() {
        return school;
    }

    // getYear; Returns the graduating year from a person object.
    public int getYear() {
        return graduatingYear;
    }

    // setFirstName; Sets the first name of a person object.
    // f; Accepts a string.
    public void setFirstName(String f) {
        firstName = f;
    }

    // setLastName; Sets the last name of a person object.
    // l; Accepts a string.
    public void setLastName(String l) {
        lastName = l;
    }

    // setAge; Sets the age of a person object.
    // a; Accepts an integer.
    public void setAge(int a) {
        age = a;
    }

    // setProgram; Sets the program of a person object.
    // p; Accepts a string.
    public void setProgram(String p) {
        program = p;
    }

    // setSchool; Sets the school of a person object.
    // s; Accepts a string.
    public void setSchool(String s) {
        school = s;
    }

    // setYear; Sets the graduating year of a person object.
    // y; Accepts an integer.
    public void setYear(int y) {
        graduatingYear = y;
    }

    // toString; Returns a formatted string with the information of a person.
    public String toString() {
        return firstName+" "+lastName+" is "+age+" years old, \n\tattends "
        +school+"\n\tis in the "+program+" program, \n\tand will graduate in "
        +graduatingYear+".";
    }
}