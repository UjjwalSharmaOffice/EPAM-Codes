package com.epam.campus;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Vehicle class hierarchy.
 * <p>
 * These tests verify that the Liskov Substitution Principle is properly
 * implemented by ensuring that Car and ElectricCar instances can be used
 * interchangeably as Vehicle instances without causing errors.
 * </p>
 *
 * @author EPAM Campus
 * @version 1.0
 */
public class AppTest {

    /**
     * Tests that a Car instance can be created and assigned to a Vehicle reference.
     * <p>
     * This verifies basic LSP compliance - a Car "is-a" Vehicle.
     * </p>
     */
    @Test
    public void testCarIsAVehicle() {
        Vehicle vehicle = new Car();
        assertNotNull(vehicle, "Car instance should not be null");
    }

    /**
     * Tests that an ElectricCar instance can be created and assigned to a Vehicle
     * reference.
     * <p>
     * This verifies basic LSP compliance - an ElectricCar "is-a" Vehicle.
     * </p>
     */
    @Test
    public void testElectricCarIsAVehicle() {
        Vehicle vehicle = new ElectricCar();
        assertNotNull(vehicle, "ElectricCar instance should not be null");
    }

    /**
     * Tests that startEngine() can be called on a Car through a Vehicle reference.
     * <p>
     * This verifies LSP compliance - Car's startEngine() method works correctly
     * when called through the Vehicle interface.
     * </p>
     */
    @Test
    public void testCarStartEngineDoesNotThrow() {
        Vehicle vehicle = new Car();
        assertDoesNotThrow(() -> vehicle.startEngine(),
                "Car.startEngine() should not throw any exception");
    }

    /**
     * Tests that stopEngine() can be called on a Car through a Vehicle reference.
     * <p>
     * This verifies LSP compliance - Car's stopEngine() method works correctly
     * when called through the Vehicle interface.
     * </p>
     */
    @Test
    public void testCarStopEngineDoesNotThrow() {
        Vehicle vehicle = new Car();
        assertDoesNotThrow(() -> vehicle.stopEngine(),
                "Car.stopEngine() should not throw any exception");
    }

    /**
     * Tests that startEngine() can be called on an ElectricCar through a Vehicle
     * reference.
     * <p>
     * This verifies LSP compliance - ElectricCar's startEngine() method works
     * correctly
     * when called through the Vehicle interface.
     * </p>
     */
    @Test
    public void testElectricCarStartEngineDoesNotThrow() {
        Vehicle vehicle = new ElectricCar();
        assertDoesNotThrow(() -> vehicle.startEngine(),
                "ElectricCar.startEngine() should not throw any exception");
    }

    /**
     * Tests that stopEngine() can be called on an ElectricCar through a Vehicle
     * reference.
     * <p>
     * This verifies LSP compliance - ElectricCar's stopEngine() method works
     * correctly
     * when called through the Vehicle interface.
     * </p>
     */
    @Test
    public void testElectricCarStopEngineDoesNotThrow() {
        Vehicle vehicle = new ElectricCar();
        assertDoesNotThrow(() -> vehicle.stopEngine(),
                "ElectricCar.stopEngine() should not throw any exception");
    }

    /**
     * Tests the complete vehicle operation cycle for a Car.
     * <p>
     * This verifies that a Car can go through a complete start-stop cycle
     * when used as a Vehicle reference, demonstrating full LSP compliance.
     * </p>
     */
    @Test
    public void testCarCompleteOperationCycle() {
        Vehicle vehicle = new Car();
        assertDoesNotThrow(() -> {
            vehicle.startEngine();
            vehicle.stopEngine();
        }, "Car should complete full operation cycle without exceptions");
    }

    /**
     * Tests the complete vehicle operation cycle for an ElectricCar.
     * <p>
     * This verifies that an ElectricCar can go through a complete start-stop cycle
     * when used as a Vehicle reference, demonstrating full LSP compliance.
     * </p>
     */
    @Test
    public void testElectricCarCompleteOperationCycle() {
        Vehicle vehicle = new ElectricCar();
        assertDoesNotThrow(() -> {
            vehicle.startEngine();
            vehicle.stopEngine();
        }, "ElectricCar should complete full operation cycle without exceptions");
    }
}
