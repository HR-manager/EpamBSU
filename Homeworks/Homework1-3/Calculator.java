/**
 * Class for operations with two numbers from command line
 * such as sum, difference, multiplication and division.
 * @author Petryakina
 * @version 0.5
 */
public class Calculator {
    /**
     * Parsing two numbers from command line and calling arithmetical methods.
     * @author Petryakina
     * @version 0.5
     * @param args Two numbers from command line.
     */
    public static void main (String[] args) {
        Double firstNumber = Double.parseDouble(args[0]);
        Double secondNumber = Double.parseDouble(args[1]);

        sum(firstNumber, secondNumber);
        difference(firstNumber, secondNumber);
        multiplication(firstNumber, secondNumber);
        division(firstNumber, secondNumber);
    }

    /**
     * Sum and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void sum (double firstNumber, double secondNumber){
        double sum = firstNumber+secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }

    /**
     * Difference and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void difference (double firstNumber, double secondNumber){
        double x = firstNumber;
        double y = secondNumber;
        System.out.println(x + " - " + y + " = " + (x-y));
    }
    /**
     * Multiplication and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void multiplication (double firstNumber, double secondNumber){
        double x = firstNumber;
        double y = secondNumber;
        System.out.println(x + " x " + y + " = " + (x*y));
    }
    /**
     * Division and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void division (double firstNumber, double secondNumber){
        double x = firstNumber;
        double y = secondNumber;
        double div = x/y;
        if (y == 0.0)
                System.out.println("No division result. (Forbidden operation)");
        else System.out.println(x + " / " + y + " = " + div);
    }
}
