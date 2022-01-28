public class FuelStation {

  private String fuelType;
  private double fuelVolume;
  private double fuelRate;
  private double fuelSales;

  public FuelStation() {
    fuelType = "gasoline";
    fuelVolume = 75000;
    this.fuelRate = 2;
    fuelSales = 0;
  }

  // accessor
  public String getFuelType() {
    return fuelType;
  }

  public double getFuelVolume() {
    return this.fuelVolume;
  }

  public double getFuelRate() {
    return fuelRate;
  }

  public double getFuelSales() {
    return fuelSales;
  }

  // mutator
  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public String toString() {
    return (
      "FUEL: " +
      getFuelType() +
      " VOL: " +
      getFuelVolume() +
      "L" +
      " PRICE PER L: $" +
      String.format("%.2f", getFuelRate()) +
      " SALES: $" +
      String.format("%.2f", getFuelSales())
    );
  }

  private boolean sellFuel(double volume) {
    if (getFuelVolume() >= volume) {
      fuelVolume = getFuelVolume() - volume; // fuelVolume -= volume;
      fuelSales = getFuelSales() + (volume * getFuelRate());
      return true;
    }
    return false;
  }

  public boolean canDispenseFuelType(String fuelType) {
    return this.fuelType.equals(fuelType);
  }

  public boolean dispense(String fuelType, double volume){
    if(canDispenseFuelType(fuelType)){
      return sellFuel(volume);
    }
    return false;
  }
}
