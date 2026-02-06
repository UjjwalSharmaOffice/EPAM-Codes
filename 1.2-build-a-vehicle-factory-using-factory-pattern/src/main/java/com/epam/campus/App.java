package com.epam.campus;

public class App {
    public static void main(String[] args) {
        System.out.println("Vehicle Factory Demo\n");
        
        // Create different types of vehicles using the factory
        Vehicle car = VehicleFactory.createVehicle("CAR");
        Vehicle bike = VehicleFactory.createVehicle("BIKE");
        Vehicle truck = VehicleFactory.createVehicle("TRUCK");
        
        // Demonstrate Car
        System.out.println("Creating a " + car.getType() + ":");
        car.start();
        car.stop();
        System.out.println();
        
        // Demonstrate Bike
        System.out.println("Creating a " + bike.getType() + ":");
        bike.start();
        bike.stop();
        System.out.println();
        
        // Demonstrate Truck
        System.out.println("Creating a " + truck.getType() + ":");
        truck.start();
        truck.stop();
    }
}
