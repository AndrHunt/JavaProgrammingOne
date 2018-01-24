package Chapter7;

import java.util.Scanner;

/**
 * Program that lists numbers from entered
 *
 * @author Andrew Hunt
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");

        int num = input.nextInt();
        int[] array = new int[num];

        System.out.print("Enter " + array.length + " elements: ");

        enterArray(array, input);
        System.out.println("The average is " + averageArray(array));
        finArray(array);
    }

    /**
     * Amount Method
     *
     * @param array first array
     * @param input allows input
     */
    public static void enterArray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    /**
     * Average Method
     *
     * @param array first array
     * @return returns the total
     */
    public static double averageArray(int[] array) {
        int total = 0;
        for (int element : array) {
            total += element;
        }
        return (total / array.length);
    }

    /**
     * Print Method
     *
     * @param array final array
     */
    public static void finArray(int[] array) {
        System.out.println("The contents of the array:");
        System.out.println(java.util.Arrays.toString(array));
    }

}
