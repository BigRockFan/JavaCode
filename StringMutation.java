//************************************************************************
// StringMutation.java             9/27/2018             Rohan Putcha
//
// Demonstrates some of the string methods
//************************************************************************

public class StringMutation {
    public static void main(String [] args) {
        String name = new String ("Harry James Potter"); // creating an object of the String class

        // String name = "Harry James Potter";

        System.out.println("Original name: " + name);
        System.out.println("Length of name: " + name.length());

        String nameMut1 = name.concat(" is a wizard");
        System.out.println(nameMut1);


        String nameMut2 = name.toUpperCase();
        System.out.println(nameMut2);

        String nameMut3 = name.toUpperCase();
        System.out.println(nameMut3);

        String nameMut4 = name.replace("r" , "*");
        System.out.println(nameMut4);

        String nameMut5 = name.substring(6, 11); // First one I want, First one I don't want
        System.out.println(nameMut5);

        // Weird things...
        System.out.println(name.substring(3));
        //System.out.println(name.substring(3, 20));

        System.out.println(name.substring(3, 18));

        char onechar = name.charAt(13);
        System.out.println(onechar);

        int location = name.indexOf("a");
        System.out.println(location);

        int compare1 = name.compareTo("Apple Music");
        System.out.println(compare1);

        int compare2 = name.compareTo("Wizard");
        System.out.println(compare2);

        int compare3 = name.compareTo("Harry James Potter");
        System.out.println(compare3);

        String s2 = "Apple";
        String s1 = "Apple Pie";
        System.out.println(s1.compareTo(s2));

        boolean same1 = name.equals("harry james potter");
        System.out.println(same1);

        boolean same2 = name.equalsIgnoreCase("harry james potter");
        System.out.println(same2);



    }
}
