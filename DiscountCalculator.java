//******************************************************************************
// DiscountCalculator.java                            Rohan Putcha
//
// Calculates new price and money saved based on user input of percent discount
//******************************************************************************

import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the original price? $");
        double orig = scan.nextDouble();
        System.out.print("What is the percent off? ");
        double percent = scan.nextDouble();

        double newPrice = (1-(percent/100)) * orig;
        System.out.println("The new price is $" + newPrice);
        System.out.println("You saved $" + (orig-newPrice));
    }
}
