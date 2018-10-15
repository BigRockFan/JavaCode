//********************************************************************************
// AddFractions.java                                                   Rohan Putcha
//
// Adds two given fractions and outputs a fraction
//********************************************************************************

import java.util.Scanner;

public class AddFractions {
public static void main(String [] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("\ta\t\tc");
    System.out.println("\t-\t+\t-");
    System.out.println("\tb\t\td\n");
    System.out.print("Enter the first fraction's numerator (a): ");
    int a = scan.nextInt();
    System.out.print("Enter the first fraction's denominator (b): ");
    int b = scan.nextInt();
    System.out.print("Enter the second fraction's numerator (c): ");
    int c = scan.nextInt();
    System.out.print("Enter the second fraction's denominator (d): ");
    int d = scan.nextInt();
    
    int answerNum = ((a*d)+(b*c));
    int answerDen = (b*d);
    String fullAns = answerNum + "/" + answerDen;
    System.out.println(a+"/"+b+" + "+c+"/"+d+" = "+fullAns);
}
}
