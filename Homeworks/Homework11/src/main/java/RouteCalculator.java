import java.util.ArrayList;

/**
 * Calculates the full distance from the file with checkpoints.
 * @author Petriakina
 * @version 0.5
 */
public class RouteCalculator {
    ArrayList<Double[]> checkpoints;

    /**
     * Constructor of the class.
     * @param checkpoints The array of checkpoints from the file.
     */
    public RouteCalculator (ArrayList<Double[]> checkpoints) {
        this.checkpoints = checkpoints;
    }

    /**
     * Calculates route from every point to the next and sums it all.
     * @return Full distance.
     */
    public double calculate () {
        double route = 0.0;



            for (int i = 0; i < checkpoints.size() - 1; i++) {
                double a = checkpoints.get(i + 1)[0] - checkpoints.get(i)[0];
                double b = checkpoints.get(i + 1)[1] - checkpoints.get(i)[1];
                route += Math.sqrt(a * a + b * b);
            }

        return route;
    }

    public void print () {
        System.out.printf("Full distance = %.2f km %n%n", calculate());
    }
}
