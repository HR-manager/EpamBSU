/**
 * An abstract class for transport movement types.
 * Includes methods for counting time, cost and printing the efficiency.
 * @author Petriakina
 * @version 0.5
 */
public abstract class Transport implements MovementType {

    /**
     * Calculates time for passing the route.
     * @return Time required for passing the route.
     */
    public abstract double getTime ();

    /**
     * Calculates the fare for this movement type.
     * @return The fare for the one passenger.
     */
    public abstract double getCost ();

    /**
     * Prints the efficiency (time, fare) for this movement type.
     */
    public abstract void efficiency ();
}
