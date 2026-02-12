package Assignment06;

public class TrainJourney {
    private TrackNode head;
    private TrackNode tail;

    public void addStation(Station station) {
        TrackNode newNode = new TrackNode(station);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    public void printTrack() {
        TrackNode current = head;
        while (current != null) {
            System.out.print("Station: " + current.station.name + " (" + current.station.stationCode + ")");
            System.out.print(" -> Connections: ");
            for (Station s : current.station.connections) {
                System.out.print(s.name + " "+" (" + s.distanceToStart + ") /");
            }
            System.out.println();
            current = current.next;
        }
    }

    // Print the journey forward
    public void printJourneyForward() {
        TrackNode current = head;
        System.out.print("Journey Forward: ");
        while (current != null) {
            System.out.print(current.station + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }

    // Print the journey backward
    public void printJourneyBackward() {
        TrackNode current = tail;
        System.out.print("Journey Backward: ");
        while (current != null) {
            System.out.print(current.station + " -> ");
            current = current.prev;
        }
        System.out.println("START");
    }

}