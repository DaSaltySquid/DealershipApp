package com.learntocode;

import java.util.Scanner;

public class UserInterface {
    public void UserInterface() {
    }


    public void display() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Dealership home screen");
            System.out.println("Choose an option");
            System.out.println("P) Find vehicle by price range");
            System.out.println("M) Find vehicle by make/model");
            System.out.println("Y) Find vehicle by year range");
            System.out.println("C) Find vehicle by color");
            System.out.println("G) Find vehicle by mileage range");
            System.out.println("T) Find vehicle by type");
            System.out.println("L) List all vehicles");
            System.out.println("A) Add a vehicle");
            System.out.println("R) Remove a vehicle");
            System.out.println("X) Quit");

        }
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }
}
