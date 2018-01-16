package Chapter5;

import java.util.Scanner;

/**
 * Program that keeps track of votes
 *
 * @author Andrew Hunt
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean ofVote = true;
        char Vote;
        long Yes = 0;
        long No = 0;

        while (ofVote == true) {
            System.out.print("Enter 'Y' to vote yes, 'N' to vote no,"
                    + " or 'Q' to quit voting: ");
            Vote = input.next().charAt(0);
            Vote = Character.toUpperCase(Vote);

            switch (Vote) {
                case 'Y':
                    Yes += 1;
                    break;
                case 'N':
                    No += 1;
                    break;
                case 'Q':
                    ofVote = false;
                    break;
                default:
                    System.out.print("INVALID VOTE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            }
        }

        System.out.println(" ");
        System.out.println("Total Votes:");
        System.out.println("Yes Votes: " + Yes);
        System.out.println("No Votes: " + No);

    }
}
