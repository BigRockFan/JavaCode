//************************************************************************
// TimeConverter.java                            Rohan Putcha
//
// Convert time in hours,minutes and seconds to seconds and the other way
//************************************************************************

import java.util.Scanner;
public class TimeConverter {
    public static void main(String [] args) {
        System.out.println("\t\tTime Converter: Converts [hours, minutes, seconds] to [seconds]");
        Scanner scan = new Scanner(System.in);
        int hours, minutes, seconds;
        System.out.print("Enter Hour(s): ");
        hours = scan.nextInt();
        System.out.print("Enter Minute(s): ");
        minutes = scan.nextInt();
        System.out.print("Enter Second(s): ");
        seconds = scan.nextInt();

        int result = hours*3600 + minutes*60 + seconds;

        System.out.println("That is " + result + " seconds.");

        System.out.println("\t\tTime Converter: Converts [seconds] to [hours, minutes, seconds]");

        System.out.print("Enter Seconds: ");
        int inputSeconds = scan.nextInt();

        int hours2 = inputSeconds/3600;
        int minutes2 = (inputSeconds%3600)/60;
        int seconds2 = ((inputSeconds%3600)%60);

        System.out.println("That is " + hours2 + " hour(s), " + minutes2 + " minute(s), and " + seconds2 + " second(s).");

    }
}
