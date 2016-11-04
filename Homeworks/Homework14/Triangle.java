import java.util.Scanner;

/**
 * Class for creating triangle by its sides.
 * Has methods for defining existence and a type of triangle.
 * @author Petryakina
 * @version 1.0
 */
public class Triangle {
    final int EQUILATERAL = 1;
    final int ISOSCELES = 2;
    final int SCALENE = 3;
    private double a;
    private double b;
    private double c;
    int type;

    /**
     * Constructor of the class.
     * Creates an object as a consequence of its existence.
     */
    Triangle (double a, double b, double c) throws Exception {
        if (triangleIsExist(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
            type = type (a, b, c);
        } else {
            throw new Exception("Triangle does not exist");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    /**
     * Cheking if this triangle exists.
     * @param a side a
     * @param b side b
     * @param c side c
     * @return true if it exists else if it doesn't.
     */
    private Boolean triangleIsExist(double a, double b, double c) {
        if ((a <= Double.MIN_VALUE) || (b <= Double.MIN_VALUE) || (c <= Double.MIN_VALUE)) {
            return false;
        } else if ((a >= Double.MAX_VALUE) || (b >= Double.MAX_VALUE) || (c >= Double.MAX_VALUE)) {
            return false;
        } else if (Double.isNaN(a)) {
            return false;
        } else if (Double.isNaN(b)) {
            return false;
        }else if (Double.isNaN(c)) {
            return false;
        }else if ((a >= b + c)||(b >= a + c)||(c >= a + b)) {
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
     * @return the id of the type.
     */
    public int type(double a, double b, double c) {
        int type = 0;

        if (Double.compare(a, c) != 0 && Double.compare(a, b) != 0 && Double.compare(c, b) != 0) {
            System.out.println("Triangle is scalene.");
            return SCALENE;
        }

        if ((Double.compare(a, b) == 0 && Double.compare(a, c) != 0) || (Double.compare(a, c) == 0
                && Double.compare(a, b) != 0) ||(Double.compare(b, c) == 0 && Double.compare(a, c)!= 0)) {
            System.out.println("Triangle is isosceles.");
            return ISOSCELES;
        }

        if (a == b && a == c)  {
            System.out.println("Triangle is equilateral.");
            return EQUILATERAL;
        }

        return type;
    }
}

