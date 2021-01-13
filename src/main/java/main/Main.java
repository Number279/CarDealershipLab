package main;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        HashMap<String, String> fords = new HashMap<>();
        fords.put("Flex", "Ford");
        fords.put("Mustang", "Ford");
        fords.put("Edge", "Ford");
        fords.put("Escape", "Ford");
        fords.put("F-150", "Ford");

        HashMap<String, String> chevys = new HashMap<>();
        chevys.put("Cruze", "Chevy");
        chevys.put("Camaro", "Chevy");
        chevys.put("Corvette", "Chevy");
        chevys.put("Silverado", "Chevy");
        chevys.put("Volt", "Chevy");

        HashMap<String, String> hondas = new HashMap<>();
        hondas.put("Civic", "Honda");
        hondas.put("Odyssey", "Honda");
        hondas.put("Insight", "Honda");
        hondas.put("CR-V", "Honda");
        hondas.put("Pilot", "Honda");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sawyer Motors.");
        System.out.println("Please tell us what model car you are looking for.");
        String input = scanner.nextLine();
        if(fords.containsKey(input))
        {
            System.out.format("Oh you're looking for a %s? Our Ford selection is right over here...", input);
        }
        else if(chevys.containsKey(input))
        {
            System.out.format("Oh you're looking for a %s? Our Chevy selection is right over here...", input);

        }
        else if(hondas.containsKey(input))
        {
            System.out.format("Oh you're looking for a %s? Our Honda selection is right over here...", input);

        }else{
            System.out.format("I'm sorry but we don't sell the %s here.", input);
        }
    }
}
