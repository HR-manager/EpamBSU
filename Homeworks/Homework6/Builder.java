import java.util.ArrayList;

/**
 * Created by Never4never on 10.10.2016.
 */
public class Builder {

    /**
     * Makes a list of rules
     */
    public static ArrayList<Rule> buildRules() {
        ArrayList<Rule> allRules = new ArrayList<>();
        allRules.add(new NoNumbers());
        allRules.add(new NumbersOnly());
        allRules.add(new FiveAndMoreWords());
        allRules.add(new VocabularyWords());
        return allRules;
    }

    /**
     * Checks user string if it fits in the rule.
     * @param allRules all rules in list
     * @param line entered string
     */
    public static void checkToRules(ArrayList<Rule> allRules, String line) {
        int count = 0;
        for (Rule rule : allRules) {
            if (rule.checkLine (line)) {
                rule.printResult ();
                count++;
            }
        }
        if (count == 0){
            System.out.println("String doesn't fit in any rule from the list.");
        }
    }
}

