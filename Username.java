//********************************************************************************
// Username.java                                                   Rohan Putcha
//
// Creates a username for the user based on the entered first name and last name
//********************************************************************************

import java.util.Scanner;

public class Username {
public static void main(String [] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String first = (scan.nextLine()).toLowerCase();
    System.out.print("Enter your last name: ");
    String last = (scan.nextLine()).toLowerCase();

    String username = first.substring(0, 2) + last.substring(0, 4);

    int randy = (int) (Math.random() * 90 + 10);
    username = username + randy;

    System.out.println(username);


}
}
