import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for reading checkpoints from .txt file.
 * @author Petriakina
 * @version 0.5
 */
public class ReadFile {
    File file;

    /**
     * Constructor of the class.
     * @param file .txt file from the project directory.
     */
    public ReadFile (File file) {
        this.file = file;
    }

    /**
     * Reads checkpoint lines from the file
     * and adds them to the arraylist.
     * @param file  .txt file from the project directory.
     * @return the arraylist of checkpoint lines.
     */
    public ArrayList<String> readFile(File file) {
        ArrayList<String> checkpointsLine = null;
        try {
            Scanner scan = new Scanner(file);
            checkpointsLine = new ArrayList<String>();
            int i = -1;
            while ((scan.hasNextLine()) == true) {
                checkpointsLine.add(scan.nextLine());
                i++;
                //System.out.println(checkpointsLine.get(i));
                continue;
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file in directory. Move it there and try again.");
        }
        return checkpointsLine;
    }

    /**
     * Parses the lines of checkpoints to separate coordinates
     * and makes the array of them.
     * @param checkpointsLine Array of lines of checkpoints.
     * @return Array of separate checkpoints.
     */
    public ArrayList<Double[]> parseCheckpoints (ArrayList<String> checkpointsLine) {
        ArrayList<Double[]> checkpoints = new ArrayList<Double[]>();

        for (int i = 0; i < checkpointsLine.size(); i++) {
            String[] s = checkpointsLine.get(i).split(" ");
            Double [] a = new Double[2];
            a[0] = Double.parseDouble(s[0]);
            a[1] = Double.parseDouble(s[1]);

            checkpoints.add(a);

            System.out.print (checkpoints.get(i)[0] + " ");
            System.out.println (checkpoints.get(i)[1]);
        }

        //System.out.println("checking x0 x1 " + checkpoints.get(0)[0] + "  " + checkpoints.get(checkpoints.size() - 1)[0]);
        //System.out.println("checking y0 y1 " + checkpoints.get(0)[1] + "  " + checkpoints.get(checkpoints.size() - 1)[1]);

        if ((checkpoints.get(0)[0] == checkpoints.get(checkpoints.size() - 1)[0])
                && (checkpoints.get(0)[1] == checkpoints.get(checkpoints.size() - 1)[1])) {
            System.out.println("Start and end points are the same. Correct your checkpoints.");
            System.exit(0);
        }

        return checkpoints;
    }
}
