package Task04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<Character,Integer> characterMap = new HashMap<>();

        System.out.println("Enter a String - ");
        String input = scanner.nextLine();


        for (Character inputChar : input.toCharArray()) {
            characterMap.put(inputChar, characterMap.get(inputChar) == null ? 1 : characterMap.get(inputChar) + 1);


        }

        for (Character key : characterMap.keySet()) {
            System.out.println(key + " -> " + characterMap.get(key));

        }

    }
}
