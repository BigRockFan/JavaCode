//********************************************************************
// Rohan Putcha                                 10/19/2018
//
// MakeChocolate.java
// Tells the user whether the entered amount of chocolate can be made
//********************************************************************

import java.util.Scanner;
public class MakeChocolate {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the required number of kilos of chocolate: ");
        int needed = scan.nextInt();
        System.out.print("Enter the number of small bars: ");
        int small = scan.nextInt();
        System.out.print("Enter the number of big bars: ");
        int big = scan.nextInt();

        int leftover = 0, neededSmall = 0;
        boolean impossible = false;
        if (needed - big*5 <= 0) {
          leftover = 0; //stays zero since small bars aren't required
        }
        else {
          neededSmall = needed - big*5;
          if (neededSmall <= small)
            leftover = neededSmall; //if we have more small bars than needed, the used amount is the needed amount
          else
            impossible = true; //if we don't have enough small bars, it is impossible
        }

        if (impossible) {
          System.out.println("The chocolate cannot be made.");
        }
        else {
          System.out.println("You will be using "+leftover+" small bars to make this much chocolate.");
        }
      }
  }
