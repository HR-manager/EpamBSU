/**
 * Created by Never4never on 02.10.2016.
 */
public class CommandLineParams {
        public static void main(String[] args) {
            for(int i = args.length-1; i >= 0; i--) {
                System.out.println("Argument " + i + "= " + args[i]);
        }
    }
}
