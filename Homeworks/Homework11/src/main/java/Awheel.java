/**
 * Class for defining efficiency of movement by bicycle.
 * @author Petriakina
 * @version 0.5
 */
public class Awheel implements MovementType {
    double SPEED = 16.0;
    double distance;

    /**
     * Constructor of the class.
     * @param distance Full distance, calculated from the checkpoints.
     */
    public Awheel (double distance) {
        this.distance = distance;
    }

    /**
     * Calculates time required for passing the route.
     * @return Time required for passing the route.
     */
    public double getTime() {
        double time = distance / SPEED;
        return time;
    }

    /**
     * Prints the efficiency (time) for this movement type.
     */
    public void efficiency() {
        System.out.println ("AWHEEL");
        System.out.printf("Time: %.2f hours %n%n", getTime());
    }
}
