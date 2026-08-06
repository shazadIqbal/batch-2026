package com.fooditems;

public class FoodItem {

    private String itemName;
    private double basePrice;

    public FoodItem(String itemName, double basePrice) {
        this.itemName = itemName;
        this.basePrice = basePrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Double calculatePrice() {
        return basePrice;
    }

    public void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Final Price: " + calculatePrice());
    }
}