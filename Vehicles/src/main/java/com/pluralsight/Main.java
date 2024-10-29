package com.pluralsight;

public class Main {
    public static void main(String[] args) {



        Hovercraft vehicle1 = new Hovercraft(
                "Blue",
                6,
                100,
                true,
                true,
                false,
                25,
                50,
                true,
                2f);

        SemiTruck vehicle2 = new SemiTruck(
                "Red",
                2,
                8,
                50,
                true,
                false,
                true,
                30,
                45,
                "Trash",
                33,
                true);

        Car vehicle3 = new Car(
                "Yellow",
                3,
                50,
                100,
                "Car",
                true,
                false,
                false,
                50,
                100,
                "Clothes",
                "Bubblegum");

        Moped vehicle4 = new Moped(
                "Pink",
                1,
                1,
                10,
                true,
                false,
                false,
                15,
                25,
                "Blanket");



        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
        System.out.println(vehicle4);
    }
}