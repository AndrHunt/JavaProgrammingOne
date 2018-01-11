package Chapter4;

import java.util.Scanner;

/**
 * Program that determines employee info
 *
 * @author Andrew Hunt
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user set info, and store
        System.out.print("Enter employee's name:");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week:");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double rate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double tax = input.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double tax2 = input.nextDouble();

        //Output info
        System.out.println("Employee Name:" + name);
        System.out.println("Hours Worked:" + hours);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Gross Pay: $" + rate * hours);
        System.out.println("Deduction:");
        System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", tax * 100,
                tax * rate * hours);
        System.out.printf("State Withholding (%.1f%%): $%.2f\n", tax2 * 100,
                tax2 * rate * hours);
        System.out.printf("Total Deduction: $%.2f\n", (tax2 + tax) * rate
                * hours);
        System.out.printf("Net Pay: $%.2f\n", (1 - tax2 - tax) * rate * hours);

    }

}
