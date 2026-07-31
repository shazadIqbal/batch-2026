package com.inheritanace;

public class Samsung extends Mobile{


    public Samsung() {
    }

    public Samsung(String model, String color, Integer storage) {
        super(model, color, storage);
    }

    @Override
    public void switchOn() {
        System.out.println("Hello Samsung");
    }

    @Override
    public void switchOff() {
        System.out.println("Good bye Samsung");
    }
}
