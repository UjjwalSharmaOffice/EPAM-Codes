package com.epam.campus;

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Starting Combustion Engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Combustion Engine...");
    }
}
