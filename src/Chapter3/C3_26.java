package Chapter3;

import java.util.Scanner;

/**
 * Displays true or false depending if it can be divided by a number
 *
 * @author Andrew Hunt
 */

public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

//Create new scanner
        Scanner input = new Scanner(System.in);

//Ask the user for a number, then store the number
        System.out.println("Enter a number: ");
        double number1 = input.nextDouble();

//If statement for division of 5 and 6 of the number
        System.out.println("Is " + number1 + " divisible by 5 and 6?");
        if (number1 % 5 == 0 && number1 % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Is " + number1 + " divisible by 5 or 6?");
        if (number1 % 5 == 0 || number1 % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Is " + number1 + " divisible by 5, or 6, but not both?");
        if (number1 % 5 == 0 ^ number1 % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
