package Chapter8;

import java.util.Scanner;

/**
 * Program that logs employee data
 *
 * @author Andrew Hunt
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line
     */
    public static void main(String[] args) {
        int[][] overTime = new int[8][7];
        int[][] sum = new int[8][2];
        java.util.Scanner input = new Scanner(System.in);
        for (int i = 0; i < overTime.length; i++) {
            System.out.println("Enter over time of employee " + i);
            for (int j = 0; j < overTime[0].length; j++) {
                overTime[i][j] = input.nextInt();
            }

        }

        for (int i = 0; i < overTime.length; i++) {
            for (int j = 0; j < overTime[0].length; j++) {
                sum[i][1] += overTime[i][j];
            }
            sum[i][0] = i;
        }

        selectionSort(sum);

        for (int j = sum.length - 1; j >= 0; j--) {
            System.out.println("Employee " + sum[j][0] + "'s overtime is "
                    + sum[j][1]);
        }

    }

    /**
     * Sort Method
     *
     * @param list arguments from command line prompt
     */
    public static void selectionSort(int[][] list) {
        for (int i = 0; i < list.length - 1; i++) {

            int tMin = list[i][1];
            int cCurrent = i;

            for (int j = i + 1; j < list.length; j++) {
                if (tMin > list[j][1]) {
                    tMin = list[j][1];
                    cCurrent = j;
                }
            }

            if (cCurrent != i) {
                list[cCurrent][1] = list[i][1];
                list[i][1] = tMin;
                list[cCurrent][0] = list[i][0];
                list[i][0] = cCurrent;

            }
        }
    }

}
