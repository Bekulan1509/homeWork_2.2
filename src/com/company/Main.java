package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        createObject("Bulldozer");
        System.out.println(createObject("DumpTruck"));
        createObject("FuelTruck");


    }

    public static Truck createObject(String objectName) {
        switch (objectName) {
            case "Bulldozer":
                return new Bulldozer(6.6, "R19");
            case "DumpTruck":
                DumpTruck dumpTruck = new DumpTruck();
                dumpTruck.setHowManyTonnesItCanShipping("about 100000 kg");
                dumpTruck.setTheDumpTruckOwner("John");
                dumpTruck.setValueOfLetTransport("15000 kg");
                dumpTruck.setColor("green");
                dumpTruck.setWeight(50000);
                dumpTruck.setYear(2009);
                return new DumpTruck();
            case "FuelTRuck":
                FuelTruck fuelTruck = new FuelTruck();
                fuelTruck.setFuelTruckOwner("Jame");
                fuelTruck.setHowOftenItGoesForAYear("about 100000 km");
                fuelTruck.setWhatItShipping("Things");
                fuelTruck.setColor("white");
                fuelTruck.setYear(2010);
                fuelTruck.setWeight(60000);
                return new FuelTruck();
        }
        return null;
    }


}




