package main;
import java.util.*;

public class Inventory {
    public static void inventory (String[] args) {
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
    }
}
