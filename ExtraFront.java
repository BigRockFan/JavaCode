//********************************************************************************
// ExtraFront.java                                                   Rohan Putcha
//
// Prints an output involving an entered string and random numbers after input
//********************************************************************************

import java.util.Scanner;

public class ExtraFront {
public static void main(String [] args) {

    Scanner scan = new Scanner(System.in);

    int firstRand = (int)(Math.random() * 10 + 1); // random number (1->10) inclusive
    int secondRand = (int)(Math.random() * 900 + 100); // random number (100->999) inclusive

    System.out.print("Enter a word (atleast 2 characters): ");
    String word = scan.nextLine();

    String finalWord = firstRand + word.substring(0, 2) + word.substring(0, 2)
    + word.substring(0, 2) + secondRand;

    System.out.println(finalWord);

}
}
