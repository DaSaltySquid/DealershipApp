package com.learntocode;

import java.io.*;

public class DealershipFileManager {
    private String Dealership;

    public static void loadDealership(String fileName) throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                String description = parts[1];
                String vendor = parts[2];
                double amount = parseDouble(parts[3]);
                Dealership.add(new (date, time, description, vendor, amount));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }





    public DealershipFileManager(String dealership) throws FileNotFoundException {
        Dealership = dealership;
    }

    public String getDealership() {
        return Dealership;
    }

    public String saveDealership() {
        return saveDealership();
    }



}
