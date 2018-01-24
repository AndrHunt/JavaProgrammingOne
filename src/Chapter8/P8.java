package Chapter8;

import java.util.Scanner;

/**
 * Program that logs employee data
 *
 * @author Andrew Hunt
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args) {

        double[][] Info = new double[4][5];
        String Employee;
        String Day = "";
        String Choice = "";
        java.util.Scanner input = new Scanner(System.in);

        do {
            //Employee ID Input

            do {
                System.out.println("Enter the ID as A, B, C, or D. ");
                Employee = input.next().toUpperCase();
            } while (!(Employee.equals("A")) && (!(Employee.equals("B")) && (!(Employee.equals("C"))) && (!(Employee.equals("D")))));

            //Day Input
            do {
                System.out.println("Enter the day as M, T, W, H, or F. ");
                Day = input.next().toUpperCase();
            } while (!(Day.equals("M")) && (!(Day.equals("T")) && (!(Day.equals("W")) && (!(Day.equals("H")) && (!(Day.equals("F")))))));

            System.out.println("Enter the amount of the sale. ");
            double Sale = input.nextDouble();

            switch (Employee) {
                case "A":
                    switch (Day) {
                        case "M":
                            Info[0][0] += Sale;
                            break;
                        case "T":
                            Info[0][1] += Sale;
                            break;
                        case "W":
                            Info[0][2] += Sale;
                            break;
                        case "H":
                            Info[0][3] += Sale;
                            break;
                        case "F":
                            Info[0][4] += Sale;
                            break;
                    }
                    break;
                case "B":
                    switch (Day) {
                        case "M":
                            Info[1][0] += Sale;
                            break;
                        case "T":
                            Info[1][1] += Sale;
                            break;
                        case "W":
                            Info[1][2] += Sale;
                            break;
                        case "H":
                            Info[1][3] += Sale;
                            break;
                        case "F":
                            Info[1][4] += Sale;
                            break;
                    }
                    break;
                case "C":
                    switch (Day) {
                        case "M":
                            Info[2][0] += Sale;
                            break;
                        case "T":
                            Info[2][1] += Sale;
                            break;
                        case "W":
                            Info[2][2] += Sale;
                            break;
                        case "H":
                            Info[2][3] += Sale;
                            break;
                        case "F":
                            Info[2][4] += Sale;
                            break;
                    }
                    break;
                case "D":
                    switch (Day) {
                        case "M":
                            Info[3][0] += Sale;
                            break;
                        case "T":
                            Info[3][1] += Sale;
                            break;
                        case "W":
                            Info[3][2] += Sale;
                            break;
                        case "H":
                            Info[3][3] += Sale;
                            break;
                        case "F":
                            Info[3][4] += Sale;
                            break;
                    }
                    break;
            }

            do {
                System.out.println("More data? Enter Y for more or N to stop. ");
                Choice = input.next().toUpperCase();

            } while (!(Choice.equals("Y")) && (!(Choice.equals("N"))));

        } while (Choice.equals("Y"));
        System.out.println("   M   T    W   H   F");
        char ID = 'A';
        for (int Row = 0; Row < Info.length; Row++) {
            System.out.print(ID + " ");
            for (int Col = 0; Col < Info[Row].length; Col++) {
                System.out.print(Info[Row][Col] + " ");
            }
            System.out.println();
            ID++;
        }

    }

}
