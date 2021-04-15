package com.tts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealer {
    public static void carDealer() {
        HashMap<String, String> carInventory = new HashMap<String, String>();
        carInventory.put("Civic", "Honda");
        carInventory.put("CR-V", "Honda");
        carInventory.put("GT3-RS", "Porsche");
        carInventory.put("Sierra", "GMC");
        carInventory.put("Silverado", "Chevrolet");
        carInventory.put("Suburban", "Chevrolet");
        carInventory.put("Taurus", "Ford");
        carInventory.put("Sentra", "Nissan");
        carInventory.put("Tacoma", "Toyota");
        String consumerInput;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("What model are you looking for?");
        consumerInput = inputDevice.next();
        String searchStock = carInventory.get(consumerInput);
        if (searchStock == null) {
            System.out.println("Sorry, we do not have that model");
        } else {
            System.out.println("Oh, you're looking for a " + consumerInput + "? Here is our selection of " + carInventory.get(consumerInput) + "s");
        }
        ArrayList<String> models = new ArrayList<String>();
        for (Map.Entry<String, String> entry : carInventory.entrySet()) {
            if (entry.getValue().equals(carInventory.get(consumerInput))) {
                models.add(entry.getKey());
            }
        }
        String modelString = models.toString();
        System.out.println(modelString.replace("[", "").replace("]", "").replace(",", " "));
    }

}
