/**
 * Name/Programmer: Andrew Hernandez
 * Date: March 1, 2024
 * Assignment: 4.1.1 Default Array
 * Purpose: Introduction to Arrays
 */

public class DefaultArray
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: March 1, 2024");
        System.out.println("Assignment: 4.1.1 Default Array");
        System.out.println("Purpose: Introduction to Arrays");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        int[] myArray = new int[15];

        // 
        System.out.println("\nThe length of my array is: "
            +myArray.length);
        System.out.println("\nThe last index of my array is: "
            +(myArray.length-1));
        System.out.println("\nThe first element of my array is: "
            +myArray[0]);
        System.out.println("\nThe middle index of my array is: "
            +myArray[myArray.length/2]);
        System.out.println("\nThe last index of my array is: "
            +myArray[myArray.length-1]);
        

        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.1.1>: Default Arrays");
    }
}