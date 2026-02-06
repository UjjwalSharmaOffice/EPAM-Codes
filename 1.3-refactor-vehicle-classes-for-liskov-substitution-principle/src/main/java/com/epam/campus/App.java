package com.epam.campus;

public class App {

    public static void main(String[] args) {

        // Create instances of different vehicle types
        Vehicle combustionCar = new Car();
        Vehicle electricCar = new ElectricCar();

        
        System.out.println("Operating a Combustion Car:");
        operateVehicle(combustionCar);

        System.out.println("\nOperating an Electric Car:");
        operateVehicle(electricCar);
        System.out.println("Both Car and ElectricCar were successfully substituted for Vehicle!");
    }

    private static void operateVehicle(Vehicle vehicle) {
        vehicle.startEngine();
        System.out.println("Vehicle is now running...");
        vehicle.stopEngine();
    }
}
