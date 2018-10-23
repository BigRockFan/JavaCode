//************************************************************************
// Rohan Putcha                                 10/19/2018
//
// MakeBricks.java
// Tells the user whether the entered bricks are enough for a given goal
//************************************************************************

import java.util.Scanner;
public class MakeBricks {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of small bricks: ");
        int small = scan.nextInt();
        System.out.print("Enter the number of big bricks: ");
        int big = scan.nextInt();
        System.out.print("Enter the goal: ")
        int goal = scan.nextInt();

        if (big < 0 || small < 0 || goal < 0) {
          System.out.println("ERROR: You must not enter a negative number.");
        }
        else if (goal <= small + big*5 && goal % 5 <= small) {
          System.out.println("It's possible to complete the goal with these bricks!");
        }
        else {
          System.out.println("It's not possible to complete the goal with these bricks.");
        }
      }
  }
