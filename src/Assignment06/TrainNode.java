package Assignment06;

class TrainNode {
    String trainName;
    String type; // e.g., "Express" or "Local"
    TrainNode next;

    public TrainNode(String name, String type) {
        this.trainName = name;
        this.type = type;
    }

}