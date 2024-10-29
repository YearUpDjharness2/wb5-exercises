package com.pluralsight;

public class SemiTruck  extends Vehicle{

    private String cargo;
    private float cargoWeight;
    private boolean hasTrailer;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String cargo, float cargoWeight, boolean hasTrailer) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, "SemiTruck", isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.cargo = cargo;
        this.cargoWeight = cargoWeight;
        this.hasTrailer = hasTrailer;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(float cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return this.color + " SemiTruck"
                + "\nCargo Capacity: "
                + this.cargoCapacity
                + "\nNumber of passengers: "
                + this.numberOfPassengers
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
                + "\nCargo: "
                + this.cargo
                + "\nCargo Weight: "
                + this.cargoWeight
                + "\nHas Trailer: "
                + this.hasTrailer
                + "\n======================";



    }
}