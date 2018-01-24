package Chapter4;

import java.util.Scanner;

/**
 * Program that outputs the position of the user
 *
 * @author Andrew Hunt
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Asks the user for input.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String in = input.nextLine();

        //Creates the character, reconized by the position.
        char major = in.charAt(0);
        char year = in.charAt(1);

        //Creates strings that have no output.
        String m = "";
        String y = "";

        //Switch statement stores the choices.
        switch (major) {
            case 'M':
                m = "Mathematics";
                break;

            case 'C':
                m = "Computer Science";
                break;

            case 'I':
                m = "Information Technology";
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }

        switch (year) {
            case '1':
                y = "Freshman";
                break;

            case '2':
                y = "Sophomore";
                break;

            case '3':
                y = "Junior";
                break;

            case '4':
                y = "Senior";
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }

        System.out.println(m + " " + y);
    }

}
