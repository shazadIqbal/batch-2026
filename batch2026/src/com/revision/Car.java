package com.revision;

public class Car extends Vehicle{

    public Car() {
    }

    public Car(String name, Integer modelYear) {
        super(name, modelYear);
    }

    //
    public void test(){
        System.out.println("");
    }
    public void test(String a){
        System.out.println();
    }
    public void test(Integer a){
        System.out.println();
    }
    public void add(Integer age,String name){
        System.out.println();
    }

    public void add(String name,Integer roll){
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println("Car is display");
    }
}
