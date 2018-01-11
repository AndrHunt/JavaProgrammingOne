package Chapter6;

import java.util.Scanner;

/**
 * Program that converts money
 *
 * @author Andrew Hunt
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dollars;

        System.out.print("How many Euros does a dollar buy? ");
        double eRate = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy?  ");
        double pRate = input.nextDouble();
        System.out.print("How many Yen does a dollar buy?  ");
        double yRen = input.nextDouble();

        String response = "";
        String choice = "";
        while (!response.equalsIgnoreCase("no")) {
            System.out.print("Please enter the number of dollars you want to convert: $");
            dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            choice = input.next().toUpperCase();
            switch (choice) {
                case "E":
                    double eCon = conversion(dollars, eRate);
                    System.out.printf("For %.2f dollars you will get %.2f euros\n", dollars, eCon);
                    break;
                case "P":
                    double pCon = conversion(dollars, pRate);
                    System.out.printf("For %.2f dollars you will get %.2f poumd\n", dollars, pCon);
                    break;
                case "Y":
                    double yCon = conversion(dollars, yRen);
                    System.out.printf("For %.2f dollars you will get %.2f yen\n", dollars, yCon);
                    break;
            }

            do {
                System.out.print("Would you like to perform any more conversions? ");
                response = input.next();
            } while (!response.equalsIgnoreCase("no") && !response.equalsIgnoreCase("yes"));

        }
    }

    /**
     * Main Method
     *
     * @param dollars arguments from command line prompt
     * @param curency arguments from command line prompt
     */
    public static double conversion(double dollars, double curency) {

        if (dollars > 100) {
            dollars = dollars - (dollars * .05);
        } else {
            dollars = dollars - (dollars * .10);
        }
        return dollars * curency;
    }
}
