/**
 * Class for defining efficiency of movement by foot.
 * @author Petriakina
 * @version 0.5
 */
public class Afoot implements MovementType{
    double distance;
    final double SPEED = 4.0;

    /**
     * Constructor of the class.
     * @param distance Full distance, calculated from the checkpoints.
     */
    public Afoot (Double distance) {
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
        System.out.println ("AFOOT");
        System.out.printf("Time: %.2f hours %n%n", getTime());
    }
}
