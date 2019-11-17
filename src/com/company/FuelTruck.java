package com.company;

public class FuelTruck extends Truck implements Printible {
    private String whatItShipping;
    private String fuelTruckOwner;
    private String howOftenItGoesForAYear;

    public FuelTruck() {

    }

    public String getWhatItShipping() {
        return whatItShipping;
    }

    public void setWhatItShipping(String whatItShipping) {
        this.whatItShipping = whatItShipping;
    }

    public String getFuelTruckOwner() {
        return fuelTruckOwner;
    }

    public void setFuelTruckOwner(String fuelTruckOwner) {
        this.fuelTruckOwner = fuelTruckOwner;
    }

    public String getHowOftenItGoesForAYear() {
        return howOftenItGoesForAYear;
    }

    public void setHowOftenItGoesForAYear(String howOftenItGoesForAYear) {
        this.howOftenItGoesForAYear = howOftenItGoesForAYear;
    }

    public FuelTruck(String whatItShipping, String fuelTruckOwner, String howOftenItGoesForAYear) {
        this.whatItShipping = whatItShipping;
        this.fuelTruckOwner = fuelTruckOwner;
        this.howOftenItGoesForAYear = howOftenItGoesForAYear;
    }

    @Override
    public void print() {
        System.out.println(whatItShipping + " " +
                " " + fuelTruckOwner + " " +
                " " + howOftenItGoesForAYear);

    }
}
