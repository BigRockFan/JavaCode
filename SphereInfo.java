//*******************************************************************
// SphereInfo.java                                   Rohan Putcha
//
// Returns volume and surface area of a sphere given the radius
//*******************************************************************

import java.util.Scanner;

public class SphereInfo {
public static void main(String [] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("What is the radius of the sphere? ");
    double radius = scan.nextDouble();
    double volume = Math.pow(radius, 3) * Math.PI * 4.0/3;
    double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    System.out.println("The volume of the sphere is " +volume + " units cubed");
    System.out.println("The surface area of the sphere is "+surfaceArea + " units squared");


}
}
