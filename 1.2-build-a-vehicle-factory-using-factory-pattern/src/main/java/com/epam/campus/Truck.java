package com.epam.campus;

public class Truck implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Truck is starting with heavy engine");
    }
    
    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
    
    @Override
    public String getType() {
        return "Truck";
    }
}
