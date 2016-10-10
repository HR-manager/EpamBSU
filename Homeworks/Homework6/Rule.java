/**
 * An abstract class for the whole group of rules.
 * @author Petriakina
 * @version 0.5
 */
public abstract class Rule {
    protected abstract boolean checkLine (String line);
    public abstract void printResult ();

}
