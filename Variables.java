/**
 * 
 * Name/Programmer: Andrew Hernandez
 * Date: 8/21/2023
 * Assignment: 2.2.1: Variables
 * Purpose: To learn and use Variables in code.
 * 
 */

public class Variables
{
    // Output header information.
    public static void main(String[]args) {
        System.out.println("\nName/Programmer: Andrew Hernandez" 
        + "\nDate: 8/21/2023" 
        + "\nAssignment: 2.2.1: Variables" 
        + "\nPurpose: To learn and use Variables in code."
        + "\n*****************************************************************\n");
//345678901234567890123456789012345678901234567890123456789012345678901234567890123

        byte byte1 = 8;
        byte byte2 = 4;
        short short1 = 754;
        short short2 = 345;
        int int1 = 8374;
        int int2 = 2356;
        long long1 = 348753;
        long long2 = 4237826;
        float float1 = 3.5f;
        float float2 = 2.2f;
        double double1 = 2.3;
        double double2 = 895.23;
        char char1 = 97;
        char char2 = 86;
        boolean bool1 = true;
        boolean bool2 = false;
        
        System.out.println(byte1);
        System.out.println(byte2);
        System.out.println(short1);
        System.out.println(short2);
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(long1);
        System.out.println(long2);
        System.out.println(float1);
        System.out.println(float2);
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println("1. You can not reassign a byte to the value of 950" +
            " because then it would turn into an integer.");
            
        System.out.println("2. You can not remove the f in a float because" 
            + " then it would turn into a double.");
    }
}
