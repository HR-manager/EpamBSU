/**
 * Class for defining efficiency of movement by bus.
 * @author Petriakina
 * @version 0.5
 */
public class Bus extends Transport {
    double SPEED = 60.0;
    int passengersQuantity = 70;
    double litresPerKm = 0.3;
    double fuelPrice = 0.7;
    double distance;

    /**
     * Constructor if the class.
     * @param distance Full distance, calculated from the checkpoints.
     */
    public Bus (double distance) {
        this.distance = distance;
    }

    /**
     * Calculates time required for passing the route.
     * @return Time required for passing the route.
     */
    @Override
    public double getTime () {
        double time = distance / SPEED;
        return time;
    }

    /**
     * Calculates the fare for this movement type.
     * @return The fare for the one passenger.
     */
    @Override
    public double getCost () {
        double cost = litresPerKm * distance * fuelPrice / passengersQuantity;
        return cost;
    }

    /**
     * Prints the efficiency (time, fare) for this movement type.
     */
    @Override
    public void efficiency () {
        System.out.println ("BUS");
        System.out.printf("Time: %.2f hours %n", getTime());
        System.out.printf("Cost: %.2f $ %n%n", getCost());
    }
}
