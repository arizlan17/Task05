package Task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<>();

            System.out.println("Enter names (type 'done' to finish):");

            while (true) {
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("done")) {
                    break;
                }
                names.add(name);
            }

            Collections.sort(names);

            System.out.println("\nNames in alphabetical order:");
            for (String name : names) {
                System.out.println(name);
            }

            scanner.close();
        }

}
