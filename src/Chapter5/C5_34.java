package Chapter5;

import java.util.Scanner;

/**
 * Program that allows you to play rock, paper, or scissors with the random
 * guess
 *
 * @author Andrew Hunt
 */
public class C5_34 {

    public static double numIn;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String uGuess;
        int cGuess = 0;
        int uCount = 0;
        int cCount = 0;

        do {
            System.out.print("\nEnter Rock, Paper, or Scissor: ");
            uGuess = input.next();
            cGuess = (int) (3 * Math.random());

            switch (cGuess) {
                case 0: //Rock
                    if (uGuess.equalsIgnoreCase("Rock")) {
                        System.out.println("It is a tie");
                    } else if (uGuess.equalsIgnoreCase("Paper")) {
                        System.out.println("You win");
                        ++uCount;
                    } else if (uGuess.equalsIgnoreCase("Scissor")) {
                        System.out.println("You lose");
                        ++cCount;
                    }
                    break;

                case 1: // Paper
                    if (uGuess.equalsIgnoreCase("Rock")) {
                        System.out.println("You lose");
                        ++cCount;
                    } else if (uGuess.equalsIgnoreCase("Paper")) {
                        System.out.println("It is a tie");
                    } else if (uGuess.equalsIgnoreCase("Scissor")) {
                        System.out.println("You win");
                        ++uCount;
                    }
                    break;

                case 2: // Scissors
                    if (uGuess.equalsIgnoreCase("Rock")) {
                        System.out.println("You win");
                        ++uCount;
                    } else if (uGuess.equalsIgnoreCase("Paper")) {
                        System.out.println("You lose");
                        ++cCount;
                    } else if (uGuess.equalsIgnoreCase("Scissor")) {
                        System.out.println("It is a tie");
                    }
                    break;
            }

        } while (uCount <= 2 && cCount <= 2);
        if (cCount > 2) {
            System.out.println("\nThe computer won more than two times!");
        } else if (uCount > 2) {
            System.out.println("\nYou won more than two times!");
        }
    }

}
