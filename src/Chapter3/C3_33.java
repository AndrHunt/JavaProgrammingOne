package Chapter3;

import java.util.Scanner;

/**
 * Program that compares the prices of two packages
 *
 * @author Andrew Hunt
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

//Create new scanner
        Scanner input = new Scanner(System.in);

//Get the weight and the price
        System.out.println("Enter the weight and price for the first package: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.println("Enter the weight and price for the second package: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

//Dividing prices and making output with “if”
        if (price1 / weight1 < price2 / weight2) {
            System.out.println("Package 1 has a better price");
        } else if (price1 / weight1 > price2 / weight2) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("The two packages have the same price");
        }
    }

}
