package com.epam.campus;

public class Car implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Car is starting with ignition key");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
    
    @Override
    public String getType() {
        return "Car";
    }
}
