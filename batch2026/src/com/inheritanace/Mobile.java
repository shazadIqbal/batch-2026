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


    public void unlock(Integer pin){
        if(pin == 1234){
            System.out.println("Unlocked");
        }else{
            System.out.println("Incorrect Pin");
        }


    }



    private void displayImei(){
        System.out.println("100M3BE-401120-23");
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
