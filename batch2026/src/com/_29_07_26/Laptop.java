package com._29_07_26;

public class Laptop {

    String color;
    Integer battery;
    public static String brand;

    static{
        brand="HP";
    }

    public Laptop(String color, Integer battery) {
        this.color = color;
        this.battery = battery;
    }
}
