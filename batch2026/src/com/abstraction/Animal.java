package com.abstraction;


//class - class -> extends
//class - interface -> implements
// interface - interface -> extends
public abstract class Animal implements DesignDevice {

    public Animal() {
        System.out.println("In Abstract Constructor");
    }

    public abstract void sound();

}
