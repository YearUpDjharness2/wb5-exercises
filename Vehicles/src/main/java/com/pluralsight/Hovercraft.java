package com.pluralsight;

public class Hovercraft extends Vehicle {


    private boolean onWater;
    private float hoverHeight;

    public Hovercraft(String color, int numberOfPassengers, int fuelCapacity, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, boolean onWater, float hoverHeight) {
        super(color, numberOfPassengers, 4, fuelCapacity, "Hovercraft", isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.onWater = onWater;
        this.hoverHeight = hoverHeight;
    }


    public boolean isOnWater() {
        return onWater;
    }

    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }

    public float getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(float hoverHeight) {
        this.hoverHeight = hoverHeight;
    }

    @Override
    public String toString() {
        return this.color + " Hovercraft"
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
                + "\nOn Water: "
                + this.onWater
                + "\nHover Height: "
                + this.hoverHeight
                + "\n==============================";
    }
}