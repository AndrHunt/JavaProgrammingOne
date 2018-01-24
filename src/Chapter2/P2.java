package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the total cost of a meal including a tip
 *
 * @author Andrew Hunt
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Create new Scanner object
        Scanner input = new Scanner(System.in);

        //Print out the statement, and store user's reply as a double
        System.out.print("Enter the price for the meal:");
        double meal = input.nextDouble();

        System.out.print("Enter the price of the drink:");
        double drink = input.nextDouble();

        System.out.print("Enter the price of the dessert:");
        double dessert = input.nextDouble();

        //Create new values for the total, tax and tip
        double total = (meal + drink + dessert);
        double tax = (total * 0.10);
        double tip = ((total + tax) * 0.15);

        //Print the total, the tax and the tip
        System.out.println("Your cost of food is: $" + total);
        System.out.println("Your tax is: $" + tax);
        System.out.println("Your tip should be: $" + tip);
        System.out.println("The total is: $" + (tip + tax + total));
    }

}
