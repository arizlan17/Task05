package Task03;

import Task03.Vehicle;

import java.util.ArrayList;

public class Inventory {

    private Vehicle[] vehicles;

    public Inventory(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }



    public double getAveragePrice() {
        if (vehicles.length == 0) {
            return 0.0;
        }

        double totalPrice = 0.0;
        for (int i = 0; i < vehicles.length; i++) {
            totalPrice += vehicles[i].getPrice();
        }

        return totalPrice / vehicles.length;
    }

    public Vehicle[] searchByMakeAndModel(String make, String model) {
        ArrayList<Vehicle> results = new ArrayList<>();

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getMake().equalsIgnoreCase(make) &&
                    vehicles[i].getModel().equalsIgnoreCase(model)) {
                results.add(vehicles[i]);
            }
        }
        return results.toArray(new Vehicle[0]);
    }
}
