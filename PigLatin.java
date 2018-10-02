//************************************************************************
// PigLatin.java             9/27/2018             Rohan Putcha
//
// Converts English words to pig latin
//************************************************************************

import java.util.Scanner;
public class PigLatin {
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\t\tEnglish to Pig Latin Translator");
    System.out.print("Enter a word (starting with a consonant): ");
    String word = scan.nextLine();
    String pig = word.substring(1) + (word.substring(0, 1)).toLowerCase() + "ay";
    System.out.println("In pig latin, that would be \"" + pig + "\"");
  }
}
