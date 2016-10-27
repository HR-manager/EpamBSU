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
        ArrayList<String> checkpoints = null;
        try {
            Scanner scan = new Scanner(file);
            checkpoints = new ArrayList<String>();
            int i = -1;
            while ((scan.hasNextLine()) == true) {
                checkpoints.add(scan.nextLine());
                i++;
                System.out.println(checkpoints.get(i));
                continue;
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file in directory. Move it there and try again.");
        }
        return checkpoints;
    }
}
