package com.fooditems;

public class Drink extends FoodItem {

    private String size;

    public Drink(String itemName, String size) {
        super(itemName, 20);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public Double calculatePrice() {

        double price = getBasePrice();

        if (size.equalsIgnoreCase("Medium")) {
            price = price + 40;
        } else if (size.equalsIgnoreCase("Large")) {
            price = price + 80;
        }

        return price;
    }

    @Override
    public void displayDetails() {

        System.out.println("Item Name: " + getItemName());
        System.out.println("Base Price: " + getBasePrice());
        System.out.println("Additional Details: Size = " + getSize());
        System.out.println("Final Price: " + calculatePrice());
    }
}