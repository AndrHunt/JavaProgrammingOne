package Chapter6;

import java.util.Scanner;

/**
 * Program that creates a
 *
 * @author Andrew Hunt
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password");
        String Password = input.nextLine();

        if (Check(Password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    public static boolean Check(String Password) {

        if (Password.length()  
            8
        
            ) {
           System.out.print("A password must have at least eight characters");
            return false;
        }

        for (int i = 0; i Password.length();
        i++
        
            ) {
    if (!Character.isLetterOrDigit(Password.charAt(i))) {
                System.out.print("A password must have only letters and digits");
                return false;
            }
        }

        int numberOfDigit = 0;
        for (int i = 0; i Password.length();
        i++
        
            ) {
     if (Character.isDigit(Password.charAt(i))) {
                numberOfDigit++;
            }
        }
        if (numberOfDigit  
            2
        
            ) {
        System.out.print("A password must have at least 2 digits");
            return false;
        }
        else if;
        return true;
    }

}
