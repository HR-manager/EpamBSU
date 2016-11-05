/**
 * This class is also for practising cmd work.
 * @author Petryakina
 * @version 1.0
 */

public class HelloName {
    /**
     * This method outputs greetings to the name from command line.
     * @param args Text (name) from command line
     */
    public static void main (String[] args) {
        if (args.length == 0){
            System.out.println ("Hello, World!");
        } else {
            System.out.println ("Hello, " + args[0]);
        }
    }
}
