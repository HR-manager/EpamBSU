import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for rule which takes string from console and checks if
 * it fits the rule (string consists of five or more words).
 * @author Petriakina
 * @version 0.5
 */
public class FiveAndMoreWords extends Rule {

    /**
     * The regular expression pattern for checking the rule.
     * @return true if the string fit in the rule.
     */
    @Override
    protected boolean checkLine (String line) {
        Pattern p = Pattern.compile ("^\\s*\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+.*$");
        Matcher m = p.matcher(line);
        return m.matches ();
        }

    /**
     * Prints if the string fits in the rule.
     */
    @Override
    public void printResult () {
        System.out.println("String consists of five or more words.");
    }
}
