package com.pluralsight;

public class Moped  extends Vehicle {
    private String underSeatStorage;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,  boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String underSeatStorage) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, "Moped", isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.underSeatStorage = underSeatStorage;
    }


    public String getUnderSeatStorage() {
        return underSeatStorage;
    }

    public void setUnderSeatStorage(String underSeatStorage) {
        this.underSeatStorage = underSeatStorage;
    }

    @Override
    public String toString() {
        return this.color + " Moped"
                + "\nNumber of passengers: "
                + this.numberOfPassengers
                + "\nCargo Capacity: "
                + this.cargoCapacity
                + "\nFuel Capacity: "
                + this.fuelCapacity
                + "\nGasoline: "
                + this.isGasoline
                + "\nManual: "
                + this.isManual
                + "\nCurrent Speed: "
                + this.speedCurrent
                + "\nMax Speed: "
                + this.speedMax
                + "\nUnderSeat Storage: "
                + this.underSeatStorage
                + "\n=========================";

    }
}