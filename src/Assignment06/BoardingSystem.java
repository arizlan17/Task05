package Assignment06;

import java.util.LinkedList;
import java.util.Queue;

public class BoardingSystem {
    private Queue<Passenger> boardingQueue = new LinkedList<>();

    public void addPassengerToLine(Passenger p) {
        boardingQueue.add(p); // Adds to the end of the line
    }

    public void simulateBoarding(int trainCapacity) {
        int count = 0;
        // Board passengers until the train is full or the line is empty
        while (!boardingQueue.isEmpty() && count < trainCapacity) {
            Passenger p = boardingQueue.poll(); // Removes the person at the front
            System.out.println("Passenger " + p.getName() + " has boarded.");
            count++;
        }
    }
}