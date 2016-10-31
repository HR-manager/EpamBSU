/**
 * An abstract class for transport movement types.
 * Includes methods for counting time, cost and printing the efficiency.
 * @author Petriakina
 * @version 0.5
 */
public abstract class Transport implements MovementType {

    public abstract double getTime ();
    public abstract double getCost ();
    public abstract void efficiency ();
}
