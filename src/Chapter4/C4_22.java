package Chapter4;

import java.util.Scanner;

/**
 * Program that outputs a substring
 *
 * @author Andrew Hunt
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user to enter to enter a string
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        //Outputs if it is/ is not a substring
        System.out.println(s2 + ((s1.contains(s2))
                ? " is " : " is not ")
                + "a substring of " + s1);
    }

}
