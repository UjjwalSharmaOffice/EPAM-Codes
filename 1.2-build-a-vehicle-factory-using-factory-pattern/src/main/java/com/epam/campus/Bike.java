package com.epam.campus;

public class Bike implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Bike is starting with kick start");
    }
    
    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
    
    @Override
    public String getType() {
        return "Bike";
    }
}
