import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * Class for rule which takes string from console and checks if
 * it fits the rule (string contains vocabulary words).
 * @author Petriakina
 * @version 0.5
 */
public class VocabularyWords extends Rule {

    /**
     * Creates tokens out of user string and adds them to the array.
     * Creates vocabulary array.
     * Checks if user string contains any word from vocabulary.
     * @return true if the string contains any word from vocabulary
     */
    @Override
    protected boolean checkLine(String line) {
        HashSet<String> words = new HashSet<String>();

        StringTokenizer tokenizer = new StringTokenizer(line);

        while (tokenizer.hasMoreTokens()) {
            words.add (tokenizer.nextToken());
        }

        String[] wordsToCheck = {"never", "deadline", "code", "english"};

        boolean doesContain = false;
        for (int i = 0; i < wordsToCheck.length; ++i) {
            if (words.contains (wordsToCheck[i])) {
                doesContain = true;
                break;
            }
        }
        return doesContain;
    }

    /**
     * Prints if the string fits in the rule.
     */
    @Override
    public void printResult() {
        System.out.println ("String contains a word from vocabulary.");
    }
}