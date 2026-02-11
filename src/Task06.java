import java.util.Scanner;
import java.util.TreeMap;

public class Task06 {
    static Scanner scanner = new Scanner(System.in);
    static TreeMap <Integer,String> stationsMap= new TreeMap<>();

    public static void main(String[] args) {


        stationsMap.put(1,"fort");
        stationsMap.put(2,"Secretariat Halt");
        stationsMap.put(3,"Kompannavediya");
        stationsMap.put(4,"Kollupitiya");
        stationsMap.put(5,"Bambalapitiya");
        stationsMap.put(6,"Wellawatta");
        stationsMap.put(7,"Mount Lavinia");
        stationsMap.put(8,"Angulana");
        stationsMap.put(9,"Lunawa");
        stationsMap.put(10,"Moratuwa");


        System.out.println("Stations in order of visiting :- \n");
        System.out.println("+" + "-".repeat(48) + "+");
        stationsMap.values().forEach(station -> System.out.println("| " + String.format("%-46s", station) + " |"));
        System.out.println("+" + "-".repeat(48) + "+");

        String StartingStation = getStationInputs("Enter starting station name: ");
        String EndingStation = getStationInputs("Enter ending station name: ");
        printPathStations(stationsMap,StartingStation,EndingStation);




    }



    static void printPathStations(TreeMap<Integer,String> stationsMap,String startStation,String endStation){
        int startIndex = -1;
        int endIndex = -1;

        for (Integer key : stationsMap.keySet()) {
            if (stationsMap.get(key).equalsIgnoreCase(startStation)) {
                startIndex = key;
            }
            if (stationsMap.get(key).equalsIgnoreCase(endStation)) {
                endIndex = key;
            }
        }

        if (startIndex == endIndex){
            System.out.println("You are at the destination station");
        }
        else if (startIndex > endIndex) {
            System.out.println("catch some other train since you are going in wrong direction");
        }
        else if (startIndex != -1 && endIndex != -1) {
            System.out.println("Stations from " + startStation + " to " + endStation + ":");
            for (int i = startIndex; i <= endIndex; i++) {

                if (i == startIndex) {
                    System.out.print("Now you are at -> ");
                }
                if (i == endIndex) {
                    System.out.print("Your Destination -> ");
                }
                System.out.println(stationsMap.get(i));



            }
        } else {
            System.out.println("Invalid station names entered.");
        }
    }




    public static String getStationInputs(String prompt){
        while (true) {
        String station ;
        System.out.println(prompt);
        station= scanner.nextLine().trim();
        if (station.isEmpty() || station.equals("null")) {
            System.out.println("Station name cannot be empty. Please try again.");
        }
        else if (stationsMap.values().stream().anyMatch(station::equalsIgnoreCase)) {
            return station;
        }
        else {
            System.out.println("Invalid station name entered. Please try again.");
        }
        }
    }
}
