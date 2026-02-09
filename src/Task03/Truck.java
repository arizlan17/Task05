package Task03;

public class Truck extends Vehicle{

    private int bedLength;
    private double payloadCapacity;

    public Truck(String make, String model, int year, String color, double price, int bedLength, double payloadCapacity) {
        super(make, model, year, color, price);
        this.bedLength = bedLength;
        this.payloadCapacity = payloadCapacity;
    }

    public Truck(Vehicle vehicle, int bedLength, double payloadCapacity) {
        super(vehicle.getMake(), vehicle.getModel(), vehicle.getYear(), vehicle.getColor(), vehicle.getPrice());
        this.bedLength = bedLength;
        this.payloadCapacity = payloadCapacity;
    }


    public int getBedLength() {
        return bedLength;
    }

    public void setBedLength(int bedLength) {
        this.bedLength = bedLength;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "bedLength=" + bedLength +
                ", payloadCapacity=" + payloadCapacity +
                '}';
    }
}
