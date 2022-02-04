import java.util.ArrayList;

public class StationSimulation {

    public static void main(String[] args) {

        ArrayList<VehicleDriver> drivers = new ArrayList<VehicleDriver>();
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        String[] names = { "Lou", "Sue", "Drew", "Koo", "Murphy" };

        for (int i = 0; i < 5; i++) {
            drivers.add(new VehicleDriver(names[i]));
        }

        for (int i = 0; i < 10; i++) {

            Vehicle vehicle = new Vehicle(
                    getRandomNumber(1, 10), // length
                    getRandomNumber(1, 10), // breadth
                    getRandomNumber(1, 10), // width
                    getRandomNumber(1, 5)); // vehicle classification
            vehicles.add(vehicle);

        }

        for (VehicleDriver driver : drivers) {
            Vehicle v = vehicles.get(getRandomNumber(0, 10));
            driver.addVehicle(v);
            do {
                v = vehicles.get(getRandomNumber(0, 10));
            } while (driver.addVehicle(v));

            System.out.println(driver);
        }

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
