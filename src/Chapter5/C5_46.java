package Chapter5;

import java.util.Scanner;

/**
 * Program that reverses the string
 *
 * @author Andrew Hunt
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Let the user enter a string and store it
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        //Invert the string
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        //Print the reversed string
        System.out.println("The reversed string is " + reverse);
    }
}
