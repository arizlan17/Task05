package Assignment06;

public class TrainSchedule {
    private TrainNode head = null;
    private TrainNode tail = null;

    public void addTrain(String name, String type) {
        TrainNode newNode = new TrainNode(name, type);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point back to head
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain the circle
        }
    }
}