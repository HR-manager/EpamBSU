/**
 * Class for operations with two numbers from command line
 * such as sum, difference, multiplication and division.
 * @author Petryakina
 * @version 0.5
 */
public class Calculator {
    /**
     * Parsing two numbers from command line and calling arithmetical methods.
     * @param args Two numbers from command line.
     */
    public static void main (String[] args) {
        Double firstNumber = 0.0;
        Double secondNumber = 0.0;

        try {
           firstNumber = Double.parseDouble(args[0]);
           secondNumber = Double.parseDouble(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not enough numbers.");
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers.");
            System.exit(0);
        }

        sum(firstNumber, secondNumber);
        difference(firstNumber, secondNumber);
        multiplication(firstNumber, secondNumber);
        if (Double.isInfinite(firstNumber / secondNumber)) {
            System.out.println("No division result. (Forbidden operation)");
        } else division(firstNumber, secondNumber);
    }

    /**
     * Sum and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void sum (double firstNumber, double secondNumber){
        System.out.println(firstNumber + " + " + secondNumber + " = " +  (firstNumber + secondNumber));
    }

    /**
     * Difference and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void difference (double firstNumber, double secondNumber){
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }
    /**
     * Multiplication and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void multiplication (double firstNumber, double secondNumber){
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
    }
    /**
     * Division and output of two numbers.
     * @param firstNumber First number
     * @param secondNumber Second number
     */
    static void division (double firstNumber, double secondNumber){
        double x = firstNumber;
        double y = secondNumber;
        System.out.println(x + " / " + y + " = " + (x / y));
    }
}
