package Assignment06;

public class CircularTrainSchedule {
    private TrainNode head = null;
    private TrainNode tail = null;

    // Task 6: Introduce a circular linked list to represent the schedule
    public void addTrainToSchedule(String name, String type) {
        TrainNode newNode = new TrainNode(name, type);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point back to start
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Complete the circle
        }
    }

    public void displaySchedule() {
        if (head == null) return;
        TrainNode current = head;
        do {
            System.out.println("Scheduled Train: " + current.trainName + " [" + current.type + "]");
            current = current.next;
        } while (current != head);
    }
}