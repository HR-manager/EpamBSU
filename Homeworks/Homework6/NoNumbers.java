import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for rule which takes string from console and checks if it fits the rule (string is not numeric).
 * @author Petriakina
 * @version 0.5
 */
public class NoNumbers extends Rule {
    String line;

    /**
     * Constructor of the class.
     * @param line string from console.
     */
    NoNumbers (String line) {
        this.line = line;
    }

    /**
     * The regular expression pattern for checking the rule.
     * @return true if the string fit in the rule.
     */
    @Override
    protected boolean checkLine () {
            Pattern p = Pattern.compile("^\\D+$");
            Matcher m = p.matcher (line);
            return m.matches();
        }

    /**
     * Prints if the string fits in the rule.
     */
    public void printResult () {
        if (checkLine () == true) {
            System.out.println ("String has no numbers.");
        } else {
            System.out.println ("String has numbers.");
        }
    }
}
