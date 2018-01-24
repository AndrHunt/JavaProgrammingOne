package Chapter4;

import java.util.Scanner;

/**
 * Program that compares bidders
 *
 * @author Andrew Hunt
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        //First bidder
        System.out.print("Please enter your name: ");
        String name1 = input.nextLine();

        System.out.print("How many hours of work will you require: ");
        int hours1 = input.nextInt();

        System.out.print("How much do you charge per hour: $");
        double pay1 = input.nextDouble();

        //Second bidder
        System.out.print("Please enter your name: ");
        String name2 = in.nextLine();

        System.out.print("How many hours of work will you require: ");
        int hours2 = input.nextInt();

        System.out.print("How much do you charge per hour: $");
        double pay2 = input.nextDouble();

        //Calculations
        double cost1 = hours1 * pay1;
        double cost2 = hours2 * pay2;

        if (cost1 < cost2) {
            System.out.println("The winner is " + name1);
            System.out.printf("Total cost is $%.2f", cost1);
        } else if (cost1 > cost2) {
            System.out.println("The winner is " + name2);
            System.out.printf("Total cost is $%.2f", cost2);
        }

        //Equal calculations
        if (cost1 == cost2) {
            if (hours1 < hours2) {
                System.out.println("The winner is " + name1);
                System.out.printf("Total cost is $%.2f", cost1);
                System.out.printf("The number of hours is %d", hours1);
            } else if (hours1 > hours2) {
                System.out.println("The winner is " + name2);
                System.out.printf("Total cost is $%.2f", cost2);
                System.out.printf("The number of hours is %d", hours2);
            } //Identical calculations
            else {
                System.out.println(" ");
            }
            System.out.println("Both " + name1 + " and " + name2
                    + " have identical bids.");

            //Number of hours
            System.out.println("\nNumber of hours:");
            System.out.printf("First bidder = %d"
                    + "       Second bidder = %d", hours1, hours2);

            //Cost per hour
            System.out.println("\nCost per hour:");
            System.out.printf("First bidder = $%.2f"
                    + "       Second bidder = $%.2f", pay1, pay2);

            //Total cost
            System.out.println("\nTotal cost:");
            System.out.printf("First bidder = $%.2f"
                    + "       Second bidder = $%.2f\n", cost1, cost2);

        }

    }
}
