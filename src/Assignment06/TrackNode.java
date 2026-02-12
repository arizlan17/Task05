package Assignment06;


public class TrackNode {
    Station station;
    TrackNode next;
    TrackNode prev;

    public TrackNode(Station station) {
        this.station = station;
    }
}
