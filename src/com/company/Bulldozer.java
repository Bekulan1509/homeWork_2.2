package com.company;

public class Bulldozer extends Truck implements Printible {
    private String mark;
    private float value;
    private String sizeOfTires;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getSizeOfTires() {
        return sizeOfTires;
    }

    public void setSizeOfTires(String sizeOfTires) {
        this.sizeOfTires = sizeOfTires;
    }

    public Bulldozer(String mark, float value, String sizeOfTires) {
        this.mark = mark;
        this.value = value;
        this.sizeOfTires = sizeOfTires;
    }

    @Override
    public void print() {
        System.out.println(mark+" "+sizeOfTires+" "+value);

    }
}
