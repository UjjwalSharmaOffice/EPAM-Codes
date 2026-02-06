package com.epam.campus;

public class ElectricCar extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Starting Electric Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Electric Engine");
    }
}
