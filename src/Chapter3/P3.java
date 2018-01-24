package Chapter3;

import java.util.Scanner;

/**
 * Program that compares grades
 *
 * @author Andrew Hunt
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Ask user for input, and store it
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        //Comparing the inputs
        if (number1 < number2) {
            System.out.println("The first number is less than the second");
        }
        if (number1 > number2) {
            System.out.println("The first number is greater than the second");
        }
        if (number1 == number2) {
            System.out.println("The first number is equal to the second");
        }
        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (number1 != number2) {
            System.out.println("The first number is not equal to the second");
        }

        //Dividing the inputs
        if (number2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (number1 / number2 < 1.0) {
            System.out.println("Proper fraction");
        } else if (number1 / number2 >= 1.0) {
            System.out.println("Improper fraction");
        }

        //Comparing to set grades higher/equal
        if (number1 >= 90.0) {
            System.out.println("A");
        } else if (number1 >= 80.0) {
            System.out.println("B");
        } else if (number1 >= 70.0) {
            System.out.println("C");
        } else if (number1 >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //If statement for range
        if (number2 >= 1.0 && number2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
