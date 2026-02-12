package Assignment06;

import java.util.*;

public class TrainSimulationApp {
    public static void main(String[] args) {
        // --- 1. Setup Stations (Tasks 1 & 8) ---
        Station AA = new Station("Alpha Alpha", "AA", 0);
        Station BB = new Station("Bravo Bravo", "BB", 1);
        Station BC = new Station("Bravo Charlie", "BC", 2);
        Station BD = new Station("Bravo Delta", "BD", 3);
        Station BE = new Station("Bravo Echo", "BE", 5);
        Station CC = new Station("Charlie Charlie", "CC", 20);
        Station DD = new Station("Delta Delta", "DD", 4.5);
        Station EE = new Station("Echo Echo", "EE", 6);

        // --- 2. Setup Physical Track (Task 2: Doubly Linked List) ---
        TrainJourney physicalTrack = new TrainJourney();
        physicalTrack.addStation(AA);
        physicalTrack.addStation(BB);
        physicalTrack.addStation(BC);
        physicalTrack.addStation(BD);
        physicalTrack.addStation(BE);
        physicalTrack.addStation(CC);
        physicalTrack.addStation(DD);
        physicalTrack.addStation(EE);

        // --- 3. Setup Station Connections (Task 8: Graph) ---
        AA.addConnection(BB);
        BB.addConnection(BC);
        BB.addConnection(CC);
        BC.addConnection(BD);
        BD.addConnection(BE);
        BD.addConnection(DD);
        BE.addConnection(EE);
        CC.addConnection(DD);
        CC.addConnection(EE);

        // Print Track and Connections (Task 4)
        System.out.println("--- Task 4: Physical Track & Graph Connections ---");
        physicalTrack.printTrack();

        // ---  (Task 5: Dijkstra's) ---
        TrainGraph networkGraph = new TrainGraph();
        networkGraph.addStation(AA);
        networkGraph.addStation(BB);
        networkGraph.addStation(BC);
        networkGraph.addStation(BD);
        networkGraph.addStation(BE);
        networkGraph.addStation(CC);
        networkGraph.addStation(DD);
        networkGraph.addStation(EE);

        System.out.println("\n--- Task 5: Optimised Search (AA to EE) ---");
        List<Station> shortestPath = networkGraph.findShortestPath(AA, EE);
        for (Station s : shortestPath) {
            System.out.print(s.stationCode + " -> ");
        }
        System.out.println("Destination Reached\n");

        // --- 5. Train Schedule (Task 6: Circular Linked List) ---
        CircularTrainSchedule schedule = new CircularTrainSchedule();
        schedule.addTrainToSchedule("Express-700", "Express");
        schedule.addTrainToSchedule("Local-Blue", "Local");
        schedule.addTrainToSchedule("Freight-99", "Freight");

        System.out.println("--- Task 6: Circular Train Schedule ---");
        schedule.displaySchedule();

        // --- 6. Train Arrival Management (Task 7: Priority Queue) ---
        StationArrivalManager arrivalManager = new StationArrivalManager();
        arrivalManager.trainApproaching(new Train("Local-Blue", "Local", 2, 50));
        arrivalManager.trainApproaching(new Train("Express-700", "Express", 1, 100)); // Priority 1

        System.out.println("\n--- Task 7: Priority Arrivals ---");
        arrivalManager.allowNextTrainToDock(); // Should pull the Express train first



        // --- 7. Passenger Boarding (Task 9: Queue) ---
        BoardingSystem boarding = new BoardingSystem();
        boarding.addPassengerToLine(new Passenger("Alice"));
        boarding.addPassengerToLine(new Passenger("Bob"));

        System.out.println("\n--- Task 9: Passenger Boarding (FIFO) ---");
        boarding.simulateBoarding(2); // Boards in first-come, first-served order

        // --- 8. Simulation Statistics (Task 10) ---
        SimulationStats stats = new SimulationStats();
        stats.recordStationData("AA", 5);
        stats.recordBoardingTime(5);
        stats.recordStationData("EE", 15);
        stats.displayStats(); // Displays gathered simulation data [cite: 19]
    }
}