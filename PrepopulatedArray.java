/**
 * Name/Programmer: Andrew Hernandez
 * Date: March 1, 2024
 * Assignment: 4.1.2 Prepopulated Array
 * Purpose: Introduction to Arrays
 */

public class PrepopulatedArray
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: Andrew Hernandez");
        System.out.println("Date: March 1, 2024");
        System.out.println("Assignment: 4.1.2 Prepopulated Array");
        System.out.println("Purpose: Introduction to Arrays");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        int[] myArray = {12, 14, 13, 15, 3, 66, 88, 43, 21, 98, 77, 13};
        double average = (myArray[0]+myArray[myArray.length/2]+myArray[myArray.length-1])/3;
        int first = myArray[0];
        int middle = myArray[myArray.length/2];
        int last = myArray[myArray.length-1];

        // 
        System.out.println("\nThe length of my array is: "+myArray.length);
        System.out.println("\nThe last index of my array is: "+(myArray.length-1));
        System.out.println("\nThe first element of my array is: "+first);
        System.out.println("\nThe middle element of my array is: "+middle);
        System.out.println("\nThe last element of my array is: "+last);
        System.out.printf("\nThe average of the first, middle, and last elements is: %.2f", average);
        System.out.printf("\nThe first element, %.2f, is "+greaterLesser(first, middle)+" than the middle element, %.2f", first, middle);
        System.out.printf("\nThe middle element, %.2f, is "+greaterLesser(middle, last)+" than the last element, %.2f", middle, last);
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <4.1.2>: Prepopulated Arrays");
    }

    public static String greaterLesser(double num1, double num2) {
        if (num1 > num2) {
            return "greater";
        } else {
            return "less";
        }
    }
}

