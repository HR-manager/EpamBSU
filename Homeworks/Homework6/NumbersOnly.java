import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for rule which takes string from console and checks if
 * it fits the rule (string consists of numerals only).
 * @author Petriakina
 * @version 0.5
 */
public class NumbersOnly extends Rule {
    String line;

    NumbersOnly (String line) {
        this.line = line;
        }

    /**
     *  The regular expression pattern for checking the rule.
     * @return true if the string fit in the rule.
     */
    @Override
    protected boolean checkLine () {
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher (line);
        return m.matches();
    }

    /**
     * Prints if the string fits in the rule.
     */
    public void printResult () {
        if (checkLine () == true) {
            System.out.println ("String consists of numbers.");
        }
    }
}

