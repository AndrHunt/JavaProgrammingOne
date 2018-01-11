package Chapter1;

/**
 * Prints the math with text
 *
 * @author Andrew Hunt
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double radius = 5.5;
        double Pi = 3.14;
        double perimeter = 2 * radius * Pi;
        double area = radius * radius * Pi;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

    }

}
