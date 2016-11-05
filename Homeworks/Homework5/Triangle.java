import java.util.Scanner;

/**
 * Class for defining the type of triangle.
 * @author Petryakina
 * @version 0.5
 */
public class Triangle {
    /**
     * The main class.
     * @param args Arguments from command line.
     */
    public static void main (String[] args) {
        double a;
        double b;
        double c;

        System.out.println ("Enter three sides of the triangle.");
        Scanner scan = new Scanner (System.in);
        a = Scan (scan);
        b = Scan (scan);
        c = Scan (scan);

        if (!triangleIsExist(a, b, c)) {
            System.out.println ("Input error. Please enter correct data.");
            System.exit(0);
        }
        type(a, b, c);
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

    /**
     * Cheking if this triangle exists.
     * @param a side a
     * @param b side b
     * @param c side c
     * @return true if it exists else if it doesn't.
     */
    public static Boolean triangleIsExist(double a, double b, double c) {
        if ((a <= Double.MIN_VALUE) || (b <= Double.MIN_VALUE) || (c <= Double.MIN_VALUE)) {
            return false;
        } else if ((a >= Double.MAX_VALUE) || (b >= Double.MAX_VALUE) || (c >= Double.MAX_VALUE)) {
            return false;
        } else if ((a >= b + c)||(b >= a + c)||(c >= a + b)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Defines the type of triangle and outputs it into console.
     * @param a side a
     * @param b side b
     * @param c side c
     */
    public static void type(double a, double b, double c) {
        if (Double.compare(a, c)!=0 && Double.compare(a, b)!=0 && Double.compare(c, b)!=0) {
            System.out.println("Triangle is scalene.");
        }

        if ((Double.compare(a, b)==0 && Double.compare(a, c)!=0) || (Double.compare(a, c)==0 && Double.compare(a, b)!=0) ||(Double.compare(b, c)==0 && Double.compare(a, c)!=0)) {
            System.out.println("Triangle is isosceles.");
        }

        if (a==b && a==c) {
            System.out.println("Triangle is equilateral.");
        }
    }
}

