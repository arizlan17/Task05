package Assignment06;
public class Passenger {
    private String name;
    private long arrivalTime; // For calculating boarding time stats

    public Passenger(String name) {
        this.name = name;
        this.arrivalTime = System.currentTimeMillis();
    }

    public String getName() { return name; }
    public long getArrivalTime() { return arrivalTime; }
}