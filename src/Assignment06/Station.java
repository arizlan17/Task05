package Assignment06;

import java.util.*;

public class Station {
    String name;
    String stationCode; // Station code
    double distanceToStart; // Distance from starting station
    List<Station> connections; //  List of connecting stations
    int passengerCount; //  Simulation statistics

    public Station(String name, String stationCode, double distanceToStart) {
        this.name = name;
        this.stationCode = stationCode;
        this.distanceToStart = distanceToStart;
        this.connections = new ArrayList<>();
        this.passengerCount = 0;
    }

    public void addConnection(Station s) {
        connections.add(s);
    }


    public void printAllConnections() {
        for (Station s : connections) {
            System.out.println(s.name);
        }
    }
}