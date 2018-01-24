package Chapter7;

import java.util.Scanner;

/**
 * Program detects min number
 *
 * @author Andrew Hunt
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(numbers));
    }

    /**
     * Checks the value of the array
     *
     * @param array arguments from command line prompt
     * @return min, returns the min amount
     */
    public static double min(double[] array) {
        double min = array[0];
        for (double i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
