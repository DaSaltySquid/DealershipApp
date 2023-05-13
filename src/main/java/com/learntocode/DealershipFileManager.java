package com.learntocode;

import java.io.*;

import static java.lang.Double.parseDouble;

public class DealershipFileManager {
    private static String Dealership;

    public static String loadDealership(String fileName) throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                String description = parts[1];
                String vendor = parts[2];
                double amount = parseDouble(parts[3]);
                Vehicle.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }


        public void DealershipFileManager (String Dealership) {
            Dealership = Dealership;
        }

        public String getDealership () {
            return Dealership;
        }

        public String saveDealership () {
            return saveDealership();
        }

    }

    private static String saveDealership() {
        return null;
    }


}
