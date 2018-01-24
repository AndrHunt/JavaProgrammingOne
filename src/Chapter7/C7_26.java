package Chapter7;

import java.util.*;

/**
 * Adds numbers to an array
 *
 * @author Andrew Hunt
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Enter 5 integers for array 1 >>> ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Enter 5 integers for array 2 >>> ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        if (equals(array1, array2) == true) {
            System.out.println("Array 1 and Array 2 are strictly identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    /**
     * Equals Method
     *
     * @param list1 First array
     * @param list2 Second array
     * @return true if arrays are equal
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length == list2.length) {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
