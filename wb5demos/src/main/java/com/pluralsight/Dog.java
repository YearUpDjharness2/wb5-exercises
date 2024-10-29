package com.pluralsight;

public class Dog extends Animal{
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;

}
