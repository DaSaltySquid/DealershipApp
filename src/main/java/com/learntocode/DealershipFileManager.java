package com.learntocode;

import java.io.*;

import static java.lang.Double.parseDouble;

public class DealershipFileManager {
    private Dealership getDealership() {
        Dealership dealership = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("dealership.csv"));
            String line = "";
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if(lineNumber == 0) {
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    dealership = new Dealership(name,address,phone);
                }
                else {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);
                }
                lineNumber++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
            System.out.println("Error loading inventory: " + e.getMessage());
        }
        return dealership;
    }











}