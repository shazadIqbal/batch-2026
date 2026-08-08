package com.abstractionlearning;

public abstract class Animal {

    public Animal() {
        System.out.println("In Abstract Constructor");
    }

    public abstract void sound();

    public void eat() {
        System.out.println("Animal is eating");
    }
}