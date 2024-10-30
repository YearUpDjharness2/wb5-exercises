package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public double getValue(){
        switch (condition){
            case 1 -> System.out.println("Excellent condition");
            case 2 -> System.out.println("Good condition");
            case 3 -> System.out.println("Fair condition");
            case 4 -> System.out.println("Poor condition");
            default -> System.out.println("-ERROR!-");
        }
        double x=0;
        switch (condition){
            case 1 -> x=squareFoot*180;
            case 2 -> x=squareFoot*130;
            case 3 -> x=squareFoot*90;
            case 4 -> x=squareFoot*80;
            default -> System.out.println("-ERROR!-");
        }
        double lotValue = getLotSize()*.25;
        return (x*squareFoot)+lotValue;
    }

}

