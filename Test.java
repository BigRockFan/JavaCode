import java.util.Scanner;
public class Secret {
public static void main(String [] args) {

String color, name;
int age, day;
Scanner scan = new Scanner(System.in);
System.out.print("Enter your favorite color: ");
color = scan.nextLine();
System.out.print("Enter your last name: ");
name = scan.nextLine();
System.out.print("Enter your age: ");
age = scan.nextInt();
System.out.print("Enter the day of the month you were born: ");
day = scan.nextInt();
int rando = (int) (Math.random() * 400 + 100);

int lengthOfName = name.length();
int lastnum = (int)(Math.sqrt(day + age));
String ans = rando + (color.toLowerCase()) + ((name.substring(0, 1)).toUpperCase()) + ((name.substring(lengthOfName-1, lengthOfName)).toUpperCase()) + lastnum;

System.out.println("Your secret password is: "+ans;

}
}
