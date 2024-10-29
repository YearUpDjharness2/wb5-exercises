package com.pluralsight;

public class Car extends Vehicle {






    private String trunkContents;
    private String airFreshenerType;

    public Car(String color,
               int numberOfPassengers,
               int cargoCapacity,
               int fuelCapacity,
               String vehicleType,
               boolean isGasoline,
               boolean isElectric,
               boolean isManual,
               float speedCurrent,
               float speedMax,
               String trunkContents,
               String airFreshenerType) {
        super(color, numberOfPassengers,
                cargoCapacity,
                fuelCapacity,
                vehicleType,
                isGasoline,
                isElectric,
                isManual,
                speedCurrent,
                speedMax);
        this.trunkContents = trunkContents;
        this.airFreshenerType = airFreshenerType;
    }


    public String getTruckContents() {
        return trunkContents;
    }

    public void setTruckContents(String truckContents) {
        this.trunkContents = truckContents;
    }

    public String getAirFreshenerType() {
        return airFreshenerType;
    }

    public void setAirFreshenerType(String airFreshenerType) {
        this.airFreshenerType = airFreshenerType;
    }


    @Override
    public String toString() {
        return this.color
                + " Car"
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
                + "\nTrunk Contents: "
                + this.trunkContents
                + "\nAir-freshener Type"
                + "\n==========================";
    }
}