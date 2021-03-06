/**
 * Counts the roots of quadratic equation with the arguments from the command line.
 * @author Petryakina
 * @version 0.7
 */
public class QuadraticEquation {
    /**
     * Main class where the parsing of arguments, catching exceptions
     * about number format and the quantity of them
     * and method calls are realized.
     * @param args Arguments from command line: arguments of an equation.
     */
    public static void main (String[] args) {

        double a = 0;
        double b = 0;
        double c = 0;

        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println ("Invalid number format.");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Not enough arguments for quadratic equation.");
            System.exit(1);
        }

        discriminant(a, b, c);
    }

    /**
     * Counting discriminant and outputting it with the whole equation.
     * @param a Argument a.
     * @param b Argument b.
     * @param c Argument c.
     */
    static void discriminant (double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        System.out.println("Your equation: " + a + "x^2 + " + b + "x + " + c + " = 0;");
        System.out.println("D = " + discriminant);
        resultsOut (a, b, c, discriminant);
    }

    /**
     * According to the discriminant calls method fot getting roots.
     * @param a Argument a.
     * @param b Argument b.
     * @param c Argument c.
     * @param discriminant Discriminant.
     */
    static void resultsOut (double a, double b, double c, double discriminant) {

        if (discriminant > 0) {
            defaultRoots(a, b, discriminant);
        } else if (discriminant < 0) {
            System.out.println("There are no real solutions: discriminant is negative.");
        } else if (Math.abs(discriminant) < Math.ulp(discriminant)) {
            if (Double.isInfinite(1 / a) && Double.isInfinite(1 / b) && Double.isInfinite(1 / c)) {
                System.out.println("All arguments are null. The root of equation is not a number.");
            } else discriminantIsNull(a, b);
        }
    }
    /**
     * Method for counting roots when discriminant is positive and outputting the result.
     * @param a Argument a
     * @param b Argument b
     * @param discriminant Discriminant of the equation.
     */
    static void defaultRoots (double a, double b, double discriminant) {
        double x1 = (- b  + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (- b  - Math.sqrt(discriminant)) / (2 * a);
        System.out.println ("Roots: x1 = " + x1 + "; x2 = " + x2 + ".");
    }

    /**
     * Method fot counting roots when discriminant is null and outputting information about discriminant and result.
     * @param a Argument a
     * @param b Argument b
     */
    static void discriminantIsNull (double a, double b) {
        double x = (- b) / (2 * a);
        System.out.println ("Discriminant is null, so the equation has only one real root (or two same roots): x1, x2 = " + x + ".");

    }
}
