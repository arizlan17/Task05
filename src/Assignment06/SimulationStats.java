package Assignment06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimulationStats {
    private Map<String, Integer> passengersPerStation = new HashMap<>();
    private List<Long> boardingTimes = new ArrayList<>();

    public void recordStationData(String stationName, int count) {
        passengersPerStation.put(stationName, count);
    }

    public void recordBoardingTime(long timeInSeconds) {
        boardingTimes.add(timeInSeconds);
    }

    public void displayStats() {
        System.out.println("--- Simulation Statistics ---");
        passengersPerStation.forEach((name, count) ->
                System.out.println("Station: " + name + " | Passengers: " + count));

        double avg = boardingTimes.stream().mapToLong(Long::longValue).average().orElse(0.0);
        System.out.println("Average Boarding Time: " + avg + " seconds");
    }
}
