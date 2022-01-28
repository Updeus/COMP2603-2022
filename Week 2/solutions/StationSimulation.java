import java.io.File;
import java.util.Scanner;

public class StationSimulation {

  public static void main(String[] args) {
    FuelStation station = new FuelStation();

    try {
      File file = new File("vehicles.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String data = scanner.nextLine(); // "2,3,10"
        String[] values = data.split(","); // ["2", "3", "10"]
        Vehicle vehicle = createVehicle(values);
        fillVehicle(vehicle, station);
      }
      scanner.close();
    } catch (Exception e) {
      System.out.println(e.toString());
      System.out.println("HA COde failed");
    }
  }

  public static Vehicle createVehicle(String[] dimensions) {
    int length = Integer.parseInt(dimensions[0]);
    int breadth = Integer.parseInt(dimensions[1]);
    int width = Integer.parseInt(dimensions[2]);
    Vehicle v = new Vehicle(length, breadth, width);
    return v;
  }

  public static void fillVehicle(Vehicle vehicle, FuelStation station) {
    System.out.println(vehicle);
    System.out.println(
      "Filled up: " +
      station.dispense(vehicle.getFuelType(), vehicle.getTankCapacity())
    );
    System.out.println(station + "\n");
  }
}
