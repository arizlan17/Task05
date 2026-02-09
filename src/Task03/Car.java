package Task03;

public class Car extends Vehicle {
    private int numDoors;
    private int numPassengers;
    private boolean isConvertible;

    public Car(String make, String model, int year, String color, double price,
               int numDoors, int numPassengers, boolean isConvertible) {
        super(make, model, year, color, price);
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
        this.isConvertible = isConvertible;
    }

    public Car(Vehicle vehicle, int numDoors, int numPassengers, boolean isConvertible) {
        super(vehicle.getMake(), vehicle.getModel(), vehicle.getYear(),
                vehicle.getColor(), vehicle.getPrice());
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
        this.isConvertible = isConvertible;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }


    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", numPassengers=" + numPassengers +
                ", isConvertible=" + isConvertible +
                '}';
    }
}
