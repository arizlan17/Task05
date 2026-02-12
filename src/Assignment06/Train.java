package Assignment06;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private String name;
    private String type;
    private int priority;
    private int capacity;
    private List<Station> schedule; // List of stations this train visits

    public Train(String name, String type, int priority, int capacity) {
        this.name = name;
        this.type = type;
        this.priority = priority; // Express = 1, Local = 2 [cite: 14]
        this.capacity = capacity;
        this.schedule = new ArrayList<>();
    }

    // Getters
    public String getName() { return name; }
    public String getType() { return type; }
    public int getPriority() { return priority; }
    public int getCapacity() { return capacity; }
    public List<Station> getSchedule() { return schedule; }

}
