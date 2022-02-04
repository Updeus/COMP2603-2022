public class Vehicle {

    // instance variables
    private int tankCapacity;
    private String fuelType;
    private String plateID;
    private int vehicleClassification;

    private static int plateNumberCounter = 1; // class variable

    // constructor
    public Vehicle(int length, int breadth, int width) {
        tankCapacity = length * breadth * width;
        if (tankCapacity % 2 == 0) {
            fuelType = "gasoline";
        } else {
            fuelType = "diesel";
        }
        setPlateID();
        setVehicleClassification(3);
    }

    // overloaded constructor
    public Vehicle(int length, int breadth, int width, int vehicleClassification) {
        this(length, breadth, width);
        setVehicleClassification(vehicleClassification);
    }

    private void setPlateID() {
        if (plateNumberCounter < 10) {
            plateID = "TAB0" + plateNumberCounter;
        } else {
            plateID = "TAB" + plateNumberCounter;
        }

        plateNumberCounter++;
    }

    public void setVehicleClassification(int vehicleClassification) {
        if (vehicleClassification == 1 || vehicleClassification == 3 || vehicleClassification == 4) {
            this.vehicleClassification = vehicleClassification;
        } else {
            this.vehicleClassification = 3;
        }
    }

    public int getVehicleClassification() {
        return vehicleClassification;
    }

    public String getVehicleClassification(int vehicleClassification) {

        switch (vehicleClassification) {
            case 1:
                return "Motorcycle";
            case 3:
                return "Light Motor Vehicle";
            case 4:
                return "Heavy Motor Vehicle";
            // default:
            // return null;
        }

        return null;
    }

    public String getPlateID() {
        return plateID;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String toString() {
        return ("VEHICLE TANK CAPACITY: " +
                getTankCapacity() +
                " FUEL TYPE: " +
                getFuelType() +
                " PLATE ID: " +
                getPlateID() +
                " VEHICLE CLASSIFICATION: " +
                getVehicleClassification() + " " +
                getVehicleClassification(vehicleClassification));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            String otherVehiclePlateID = v.getPlateID();
            boolean result = this.plateID.equals(otherVehiclePlateID);
            return result;
        }
        return false;
    }
}
