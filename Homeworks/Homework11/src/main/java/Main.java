import java.io.File;

public class Main {
    public static void main (String [] args) {
        File file = new File ("data.txt");
        ReadFile a = new ReadFile(file);

        RouteCalculator b = new RouteCalculator(a.parseCheckpoints(a.readFile(file)));

        b.print();
        Afoot afoot = new Afoot(b.calculate());
        afoot.efficiency();

        Awheel awheel = new Awheel((b.calculate()));
        awheel.efficiency();

        Bus bus = new Bus((b.calculate()));
        bus.efficiency();

        Car car = new Car((b.calculate()));
        car.efficiency();
    }
}
