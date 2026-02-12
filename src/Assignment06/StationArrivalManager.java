package Assignment06;

import java.util.PriorityQueue;
import java.util.Comparator;

public class StationArrivalManager {
    // PriorityQueue handles the "Express" vs "Local" logic automatically
    private PriorityQueue<Train> arrivalQueue;

    public StationArrivalManager() {
        // Compare trains based on their priority level (e.g., 1 for Express, 2 for Local)
        this.arrivalQueue = new PriorityQueue<>(Comparator.comparingInt(Train::getPriority));
    }

    public void trainApproaching(Train t) {
        arrivalQueue.add(t);
    }

    public void allowNextTrainToDock() {
        Train next = arrivalQueue.poll();
        if (next != null) {
            System.out.println("Clearing platform for: " + next.getName());
        }
    }
}
