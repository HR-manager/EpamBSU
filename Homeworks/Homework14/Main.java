import java.util.Scanner;

public class Main {
    /**
     * The main method.
     * @param args Arguments from command line.
     */
    public static void main (String[] args) throws Exception{
        double a;
        double b;
        double c;

        System.out.println ("Enter three sides of the triangle.");
        Scanner scan = new Scanner (System.in);
        a = Scan (scan);
        b = Scan (scan);
        c = Scan (scan);

        try {
            Triangle triangle = new Triangle(a, b, c);
            triangle.type(a, b, c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method returns the next double value from the scanner if it exiscts.
     * Else it returns null.
     * @param scan Scanner
     * @return nextDouble
     */
    public static double Scan(Scanner scan) {
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        } else {
            return 0.0;
        }
    }
}
