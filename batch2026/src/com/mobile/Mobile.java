package com.mobile;

public class Mobile {

    String brand;
    String color;
    String model;
    Integer storage;

    public Mobile(String brand, String color, String model, Integer storage) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.storage = storage;
    }

    public void switchOn(){

        System.out.println("Mobile is switched on.");
    }

    public void switchOff(){

        System.out.println("Mobile is switched off.");
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }
}

