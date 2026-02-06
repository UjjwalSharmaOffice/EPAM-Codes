package com.epam.campus;

public class VehicleFactory {
    
    public static Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new IllegalArgumentException("Vehicle type cannot be null or empty");
        }
        
        switch (vehicleType.toUpperCase()) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "TRUCK":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}
