package Task03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create vehicles
        Vehicle v1 = new Car("Toyota", "Corolla", 2020, "White", 25000,
                4, 5, false);
        Vehicle v2 = new Car("Honda", "Civic", 2021, "Black", 27000,
                4, 5, false);
        Vehicle v3 = new Truck("Ford", "Ranger", 2019, "Blue", 35000,
                6, 1200);
        Vehicle v4 = new Truck("Toyota", "Hilux", 2022, "Red", 42000,
                7, 1500);
        Vehicle v5 = new Car("Toyota", "Corolla", 2018, "Silver", 22000,
                4, 5, false);

        // Add to array
        Vehicle[] vehicles = {v1, v2, v3, v4, v5};

        // Create inventory
        Inventory inventory = new Inventory(vehicles);

        // Test average price
        System.out.println("Average price: " + inventory.getAveragePrice());

        // Test search
        Vehicle[] results = inventory.searchByMakeAndModel("Toyota", "Corolla");

        System.out.println("\nSearch results for Toyota Corolla:");
        for (Vehicle v : results) {
            System.out.println(v);
        }
    }
}
