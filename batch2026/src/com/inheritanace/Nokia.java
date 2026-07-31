package com.inheritanace;

public class Nokia extends Mobile {


    public Nokia() {
    }

    public Nokia(String model, String color, Integer storage) {
        super(model, color, storage);
    }

    @Override
    public void switchOn() {
        System.out.println("Welcome Nokia");
    }

    @Override
    public void switchOff() {
        System.out.println("Good bye nokia");
    }


}
