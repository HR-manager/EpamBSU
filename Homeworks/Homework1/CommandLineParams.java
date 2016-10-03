/**
 * This class is for practicing in cmd work
 * @author Petryakina
 * @version 0.5
 */
public class CommandLineParams {
    /**
     * This method outputs arguments from command line in reverse order
     * @param args Arguments from command line
     */
    public static void main(String[] args) {
        for(int i = args.length-1; i >= 0; i--) {
            System.out.println("Argument " + i + "= " + args[i]);
        }
    }
}
