package com.epam.campus;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit test for Vehicle Factory
 */
public class AppTest {

    @Test
    public void testCreateCar() {
        Vehicle vehicle = VehicleFactory.createVehicle("CAR");
        assertNotNull(vehicle);
        assertTrue(vehicle instanceof Car);
        assertEquals("Car", vehicle.getType());
    }
    
    @Test
    public void testCreateBike() {
        Vehicle vehicle = VehicleFactory.createVehicle("BIKE");
        assertNotNull(vehicle);
        assertTrue(vehicle instanceof Bike);
        assertEquals("Bike", vehicle.getType());
    }
    
    @Test
    public void testCreateTruck() {
        Vehicle vehicle = VehicleFactory.createVehicle("TRUCK");
        assertNotNull(vehicle);
        assertTrue(vehicle instanceof Truck);
        assertEquals("Truck", vehicle.getType());
    }
    
    @Test
    public void testCreateVehicleCaseInsensitive() {
        Vehicle car = VehicleFactory.createVehicle("car");
        assertNotNull(car);
        assertEquals("Car", car.getType());
        
        Vehicle bike = VehicleFactory.createVehicle("BiKe");
        assertNotNull(bike);
        assertEquals("Bike", bike.getType());
    }
    
    @Test
    public void testInvalidVehicleType() {
        assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle("PLANE");
        });
    }
    
    @Test
    public void testNullVehicleType() {
        assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle(null);
        });
    }
    
    @Test
    public void testEmptyVehicleType() {
        assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle("");
        });
    }
}
