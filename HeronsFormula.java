//*******************************************************************
// HeronsFormula.java                                   Rohan Putcha
//
// Returns area of the triangle given three sides
//*******************************************************************

import java.util.Scanner;

public class HeronsFormula {
public static void main(String [] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("What is the length of side A: ");
    double a = scan.nextDouble();
    System.out.print("What is the length of side B: ");
    double b = scan.nextDouble();
    System.out.print("What is the length of side C: ");
    double c = scan.nextDouble();

    double s = (a + b + c)/2;

    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("The area of the triangle is " +area+ " units squared");



}
}
