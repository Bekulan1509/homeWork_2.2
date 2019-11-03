package com.company;

public class DumpTruck extends Truck implements Printible{
    private String valueOfLetTransport;     //стоимость арендованного транспорта
    private String howManyTonnesItCanShipping;
    private String theDumpTruckOwner;

    public String getValueOfLetTransport() {
        return valueOfLetTransport;
    }

    public void setValueOfLetTransport(String valueOfLetTransport) {
        this.valueOfLetTransport = valueOfLetTransport;
    }

    public String getHowManyTonnesItCanShipping() {
        return howManyTonnesItCanShipping;
    }

    public void setHowManyTonnesItCanShipping(String howManyTonnesItCanShipping) {
        this.howManyTonnesItCanShipping = howManyTonnesItCanShipping;
    }

    public String getTheDumpTruckOwner() {
        return theDumpTruckOwner;
    }

    public void setTheDumpTruckOwner(String theDumpTruckOwner) {
        this.theDumpTruckOwner = theDumpTruckOwner;
    }

    public DumpTruck(String valueOfLetTransport, String howManyTonnesItCanShipping, String theDumpTruckOwner) {
        this.valueOfLetTransport = valueOfLetTransport;
        this.howManyTonnesItCanShipping = howManyTonnesItCanShipping;
        this.theDumpTruckOwner = theDumpTruckOwner;
    }

    @Override
    public void print() {
        System.out.println(valueOfLetTransport+" "+howManyTonnesItCanShipping+" "+theDumpTruckOwner);
    }
}
