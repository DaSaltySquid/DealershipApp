package com.learntocode;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    private ArrayList<Vehicle> inventory;

    private List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    void addVehicle(Vehicle vehicle) {
    }

    private void removeVehicles(Vehicle vehicle) {

    }

    private void getAllVehicles(Vehicle vehicle) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }



}
