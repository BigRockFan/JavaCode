//******************************************************************
// Rohan Putcha                                 10/19/2018
//
// EvenlySpaced.java
// Tells the user whether the entered numbers are evenly spaced
//******************************************************************

import java.util.Scanner;
public class EvenlySpaced {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c,lowest = 0,highest = 0, middle = 0;
        boolean evenly = false;
        System.out.print("Enter the first number: ");
        a = scan.nextInt();
        System.out.print("Enter the second number: ");
        b = scan.nextInt();
        System.out.print("Enter the third number: ");
        c = scan.nextInt();

        if (a < b && a < c) {
            lowest = a;
            if (b < c) {
                highest = c;
                middle = b;
            }
            else if (c < b) {
                highest = b;
                middle = c;
            }
            else {
                evenly = false;
            }
        }
        else if (b < a && b < c) {
            lowest = b;
            if (a < c) {
                highest = c;
                middle = a;
            }
            else if (c < a) {
                highest = a;
                middle = c;
            }
            else {
                evenly = false;
            }
        }
        else if (c < a && c < b) {
            lowest = c;
            if (a < b) {
                highest = b;
                middle = a;
            }
            else if (b < a) {
                highest = a;
                middle = b;
            }
            else {
                evenly = false;
            }
        }
        else if (a == b && c == a) {
            evenly = true;
        }
        else {
            evenly = false;
        }

        if (evenly == true) {
            System.out.println("The numbers are even!");
        }
        else {
            if (highest - middle == middle - lowest) {
                System.out.println("The numbers are even!");
            }
            else {
                System.out.println("The numbers are not even!");
            }
        }


    }
}
