package com.polymorphism;

public class Bike extends Vehicle {


    public void switchOn(){
        System.out.println("bike is on");
    }

    public boolean switchOn(Double key){
        System.out.println("bike is on");
        return false;
    }

    public void switchOn(String password){
        if(password.equalsIgnoreCase("Admin")){
            System.out.println("bike is on");
        }
        System.out.println("wrong password");
    }

    public void switchOn(Integer pin){
        if(pin == 12345){
            System.out.println("bike is on");
        }
        System.out.println("wrong pin");
    }

    public void switchOn(Integer pin,String password){
        if(pin == 12345 && password.equalsIgnoreCase("Admin")){
            System.out.println("bike is on");
        }
        System.out.println("wrong pin");
    }

    public void switchOn(String password,Integer pin){
        if(pin == 12345 && password.equalsIgnoreCase("Admin")){
            System.out.println("bike is on");
        }
        System.out.println("wrong pin");
    }

    @Override
    public String details(String engineNo) {
        return super.details(engineNo);
    }
}
