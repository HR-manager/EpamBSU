import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class where rules classes methods are called.
 * @author Petriakina
 * @version 0.5
 */
public class Main {

    /**
     * Main method.
     * @param args String from the console.
     */
    public static void main(String[] args) {

        System.out.println("Enter a string for checking");
        try {
            Scanner scanLine = new Scanner(System.in);
            String line = scanLine.nextLine();
            ArrayList<Rule> outputRules = Builder.buildRules();
            Builder.checkToRules(outputRules, line);
        } catch (Exception e) {
            System.out.println("Something went wrong. Try again.");
        }
    }
}