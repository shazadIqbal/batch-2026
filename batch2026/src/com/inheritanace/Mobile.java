package com.inheritanace;

public class Mobile {
    String model;
    String color;
    Integer storage;

    public Mobile(String model, String color, Integer storage) {
        this.model = model;
        this.color = color;
        this.storage = storage;
    }

    public Mobile() {
    }

    public void switchOn(){
        System.out.println("Mobile is switching on");
    }

    public void switchOff(){
        System.out.println("Mobile is switching off");
    }


    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                '}';
    }
}
