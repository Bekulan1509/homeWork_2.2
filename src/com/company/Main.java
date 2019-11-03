package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CreateObject();

    }


    public static String CreateObject() {
        System.out.println("please enter the pults: ");
        Scanner scanner = new Scanner(System.in);
        String object = scanner.nextLine();
        switch (object) {
            case "bulldozer":
                Bulldozer bulldozer = new Bulldozer("Volvo", (float) 5.9, "size of tires 325");
                bulldozer.print();
                break;
            case "fuelTruck":
                FuelTruck fuelTruck = new FuelTruck("it ships fuel\n", "the fuel truck owner is called John\n", "John goes about 20000000 kms for a year in this truck \n ");
                fuelTruck.print();
                break;
            case "dumpTruck":
                DumpTruck dumpTruck = new DumpTruck(" value of let the transport is 1000 $ for a year\n", "the truck can ship about 10 tons\n", "the dump truck owner is called Michel");
                dumpTruck.print();
                break;
        }
        return object;
    }
}
