package Chapter3;

import java.util.Scanner;

/**
 * Program to
 *
 * @author Andrew Hunt
 */

public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    private static boolean answer;
    private static boolean guess;

    public static void main(String[] args) {

//Create new scanner
        Scanner input = new Scanner(System.in);

//User input
        System.out.println("Will it be 1 or 0?");
        double numIn = input.nextDouble();

//Random number for comparing
        int numOut = (int) (Math.random() * 2);

//Comparison for output
        if (numIn == numOut) {
            System.out.println("Your guess was correct!");
        }
        if (guess != answer) {
            System.out.println("Your guess was incorrect.");
        }
    }
}
