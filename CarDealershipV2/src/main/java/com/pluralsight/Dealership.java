package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Dealership implements ITextEncodable {

    private String name;
    private String address;
    private String phone;


    private ArrayList<Vehicle> inventory;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }

    public Dealership(String encodedData){
        this.inventory = new ArrayList<Vehicle>();

        String[] lines = encodedData.split(Pattern.quote("\n"));
        for(String line : lines){
            String[] col = line.split(Pattern.quote("|"));
            if(col.length == 3){ //this must be the first line...
                this.name = col[0];
                this.address= col[1];
                this.phone = col[2];
            }
            else{ //this must be a vehicle
                Vehicle v = new Vehicle(line);
                this.inventory.add(v);
            }
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void addVehicleToInventory(Vehicle vehicleToAdd){
        inventory.add(vehicleToAdd);

    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
        for(Vehicle v : this.inventory){
            if(v.getPrice() >= min && v.getPrice() <= max){
                result.add(v);
            }
        }
        return result;
    }

    public Vehicle getVehicleByVIN(int vin){
        for(Vehicle v : this.inventory){
            if(v.getVin() == vin){
                return v;
            }
        }
        return null;
    }
    public void removeVehicleFromInventory(int vin){
        Vehicle vehicleToRemove = this.getVehicleByVIN(vin);
        inventory.remove(vehicleToRemove);
    }
    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
        for(Vehicle v : this.inventory){
            if(v.getVehicleType().equalsIgnoreCase(vehicleType)){
                result.add(v);
            }
        }
        return result;
    }
    public ArrayList<Vehicle>getVehicleByMakeModel(String make, String model){
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory){
            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)){
                result.add(v);
            }
        }
        return result;
    }
    public ArrayList<Vehicle> getVehicleByOdometer(double min, double max) {
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getOdometer() >= min && v.getOdometer() <= max) {
                result.add(v);
            }
        }
        return result;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                result.add(v);
            }
        }
        return result;
    }
    public ArrayList<Vehicle> getVehicleByYear(double min, double max){
        ArrayList<Vehicle> result = new ArrayList<Vehicle>();
        for (Vehicle v : this.inventory) {
            if (v.getYear() >= min && v.getYear() <= max) {
                result.add(v);
            }
        }
        return result;
    }

    @Override
    public String encode() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getName()).append("|")
                .append(this.getAddress()).append("|")
                .append(this.getPhone()).append("\n");

        for(Vehicle v : this.inventory){
            sb.append(v.encode()).append("\n");
        }

        return sb.toString();

    }
}