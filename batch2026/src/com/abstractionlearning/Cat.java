package com.abstractionlearning;

public class Cat extends Animal {

    public Cat() {
        System.out.println("In Cat constructor");
    }

    @Override
    public void sound() {
        System.out.println("Meow Meow!!");
    }
}