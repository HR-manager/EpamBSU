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
        Scanner scanLine = new Scanner(System.in);
        String line = scanLine.nextLine();

        NoNumbers rule1 = new NoNumbers(line);
        rule1.printResult();

        NumbersOnly rule2 = new NumbersOnly(line);
        rule2.printResult();

        FiveAndMoreWords rule3 = new FiveAndMoreWords(line);
        rule3.printResult();

        VocabularyWords rule4 = new VocabularyWords(line);
        rule4.printResult();
    }
}