package Assignment06;

import java.util.*;

public class TrainGraph {
    // Map to store station name and the actual Station object
    private Map<String, Station> nodes = new HashMap<>();

    public void addStation(Station station) {
        nodes.put(station.name, station);
    }


    public List<Station> findShortestPath(Station start, Station destination) {
        // Stores the shortest distance found so far for each station
        Map<Station, Double> distances = new HashMap<>();
        // Keeps track of the previous station to reconstruct the path
        Map<Station, Station> previousStations = new HashMap<>();
        // Priority Queue to explore lowest distance first
        PriorityQueue<Station> pq = new PriorityQueue<>(Comparator.comparingDouble(s -> distances.get(s)));

        // Initialize distances
        for (Station s : nodes.values()) {
            distances.put(s, Double.MAX_VALUE);
        }
        distances.put(start, 0.0);
        pq.add(start);

        while (!pq.isEmpty()) {
            Station current = pq.poll();

            if (current.equals(destination)) break;

            for (Station neighbor : current.connections) {
                // In this simulation, let's assume 'edge weight' is the distance between them
                double newDist = distances.get(current) + neighbor.distanceToStart;
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    previousStations.put(neighbor, current);
                    pq.add(neighbor);
                }
            }
        }
        return reconstructPath(previousStations, destination);
    }

    private List<Station> reconstructPath(Map<Station, Station> previousStations, Station destination) {
        LinkedList<Station> path = new LinkedList<>();
        Station current = destination;

        // Trace back from destination to start
        while (current != null) {
            path.addFirst(current); // Add to front so the list reads Start -> End
            current = previousStations.get(current);
        }
        return path;
    }

}
