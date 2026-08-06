package com.access_modifiers;

public class Animal {
    String name;
    String type;


     public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal() {
    }

    public void eat(){
        System.out.println("Animal is eating");
        //fetch
    }

    private void sound(){
        System.out.println("Sound of animal");
        //fetch
    }

    protected void breed(){
        System.out.println("Checking breed");
    }


    private void fetchAnimalFromGoogle(String name){
        // code to get from google
        // store the image

    }

}
