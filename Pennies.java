/**
 * Name/Programmer: I love Kotoha
 * Date: April 25, 2024
 * Assignment: 6.1.4 Pitching Pennies
 * Purpose: Learn how to use 2D arrays.
 */

 import java.util.Scanner;
 public class Pennies
 {
     public static void main(String[] args)
     {
        // Print out the header information.
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: April 25, 2024");
        System.out.println("Assignment: 6.1.4 Pitching Pennies");
        System.out.println("Purpose: Learn how to use 2D arrays.");
        System.out.println("**************************************************");
        System.out.println();
         
        // Declarations and initializations.
        Scanner keyboard = new Scanner(System.in);
        final int ROWS = 5;
        final int COLS = 5;
        int[][] arr = new int[ROWS][COLS];
        String input = "";

        // Create the board.
        for (int row=0;row<arr.length;row++) {
            for (int col=0;col<arr[row].length;col++) {
                if (row >= 1 && col >= 1 && row <= 3 && col <= 3) {
                   if (row == 2 && col == 2) {
                       arr[row][col] = 3;
                   } else {
                       arr[row][col] = 2;
                   }
                } else {
                    arr[row][col] = 1;
                }
            }
        }

        do {
            System.out.print("Do you want to play the Penny Pitching Game? (Y/N): ");
            input = keyboard.nextLine();
            System.out.println();

            // Generate the locations of where the pennies will land.
            if (input.equals("Y")) {
                int[][] coords = new int[5][2];
                
                for (int row=0;row<arr.length;row++) {
                    for (int col=0;col<arr[row].length;col++) {
                        System.out.print(arr[row][col] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                
                // Generate random numbers for x and y.
                for (int i=0;i<5;i++) {
                    coords[i][0] = (int)(Math.random() * 5);
                    coords[i][1] = (int)(Math.random() * 5);
                    System.out.println("Pitch #"+i+" is at ("+coords[i][0]+", "+coords[i][1]+")");
                }
                System.out.println();
                
                // Calculate the total amount of points a player got.
                int totalPoints = 0;
                for (int i = 0; i < 5; i++) {
                    int row = coords[i][0];
                    int col = coords[i][1];
                    if (arr[row][col] == 2) {
                        totalPoints += 2;
                    } else if (arr[row][col] == 3) {
                        totalPoints += 3;
                    } else {
                        totalPoints += 1;
                    }
                }
                
                // Display the final board, replacing the numbers with P’s showing where the pennies landed and an x where no penny landed.
                System.out.println("Your total is " + totalPoints + " and your final board is: ");
                for (int row=0;row<arr.length;row++) {
                    for (int col=0;col<arr[row].length;col++) {
                        int count = 0;
                        for (int i=0;i<5;i++) {
                            if (coords[i][0] == row && coords[i][1] == col) {
                                count++;
                            }
                        }
                        if (count == 1) {
                            System.out.print("P  ");
                        } else if (count > 1) {
                            System.out.print("PP ");
                        } else {
                            System.out.print("x  ");
                        }
                    }
                    System.out.println();
                }

                System.out.println();
            } else if (!input.equals("N") && !input.equals("Y")) {
                System.out.println("Invalid input. Please try again.");
            } else {
                break;
            }
        } while (input != "N");
        System.out.println("Thank you for playing the Penny Pitching Game!");

        // Output the ending statement.
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <6.1.4>: Pitching Pennies");
     }
 }