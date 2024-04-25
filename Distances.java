/**
 * Name/Programmer: Andrew Hernandez
 * Date: April 25, 2024
 * Assignment: 6.1.3 2D Distances
 * Purpose: Learn how to use 2D Arrays.
 */

 import java.util.Scanner;
 public class Distances {
     public static void main(String[] args) {
         // Print out the header information.
         System.out.println("\nName/Programmer: Andrew Hernandez");
         System.out.println("Date: April 25, 2024");
         System.out.println("Assignment: 6.1.3 2D Distances");
         System.out.println("Purpose: Learn how to use 2D Arrays");
         System.out.println("**************************************************");
         System.out.println();
 
         // Declarations and initializations.
         double[][] arr = {{-1, 3}, {-1, -1}, 
            {1, 1}, {2, 0.5}, 
            {2, -1}, {3, 3}, 
            {4, 2}, {4, -0.5}};
 
         // Output the 2D array.
         printIt(arr);
         System.out.println();
 
         // Determine the shortest distance between two points
         double minDistance = 100;
         double[] closestPoints = new double[4];
 
         for (int i = 0; i < arr.length; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 double x1 = arr[i][0];
                 double y1 = arr[i][1];
                 double x2 = arr[j][0];
                 double y2 = arr[j][1];
 
                 double currentDistance = distance(x1, y1, x2, y2);
 
                 if (currentDistance < minDistance) {
                     minDistance = currentDistance;
                     closestPoints[0] = x1;
                     closestPoints[1] = y1;
                     closestPoints[2] = x2;
                     closestPoints[3] = y2;
                 }
             }
         }
 
         System.out.println("The closest points are (" + closestPoints[0] + ", " + closestPoints[1] + ") and (" + closestPoints[2] + ", " + closestPoints[3] + ")");
         System.out.printf("The distance between them is %.2f", minDistance);
         System.out.println();
 
         // Determine the furthest distance between two points
         double maxDistance = 0;
         double[] farthestPoints = new double[4];
 
         for (int i = 0; i < arr.length; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 double x1 = arr[i][0];
                 double y1 = arr[i][1];
                 double x2 = arr[j][0];
                 double y2 = arr[j][1];
                 double currentDistance = distance(x1, y1, x2, y2);
                 if (currentDistance > maxDistance) {
                     maxDistance = currentDistance;
                     farthestPoints[0] = x1;
                     farthestPoints[1] = y1;
                     farthestPoints[2] = x2;
                     farthestPoints[3] = y2;
                 }
             }
         }
 
         System.out.println();
         System.out.println("The farthest points are (" + farthestPoints[0] + ", " + farthestPoints[1] + ") and (" + farthestPoints[2] + ", " + farthestPoints[3] + ")");
         System.out.printf("The distance between them is %.2f", maxDistance);
 
         // Output the ending statement.
         System.out.println();
         System.out.println("**************************************************");
         System.out.println("Ending Assignment <6.1.3>: 2D Distances");
     }
     // printIt; Takes in a 2D array and prints it out.
     // Accepts a 2D array as input.
     public static void printIt(double[][] arr) {
         System.out.println("The set of 2D points is: ");
         for (int row = 0; row < arr.length; row++) {
             System.out.println("\t(" + arr[row][0] + ", " + arr[row][1] + ")");
         }
     }
 
     // distance; Determines the distances between two points.
     // Accepts four doubles as input.
     public static double distance(double x1, double y1, double x2, double y2) {
         double x = x2 - x1;
         double y = y2 - y1;
         double distance = Math.sqrt(x * x + y * y);
         return distance;
     }
 }