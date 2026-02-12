package Assignment06;

class TrainNode {
    String trainName;
    String type; // e.g., "Express" or "Local" [cite: 14]
    TrainNode next;

    public TrainNode(String name, String type) {
        this.trainName = name;
        this.type = type;
    }

}