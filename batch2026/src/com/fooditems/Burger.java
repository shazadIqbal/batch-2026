package com.fooditems;

public class Burger extends FoodItem {

    private boolean extraPatty;

    public Burger(String itemName, boolean extraPatty) {
        super(itemName, 100);
        this.extraPatty = extraPatty;
    }

    public boolean isExtraPatty() {
        return extraPatty;
    }

    public void setExtraPatty(boolean extraPatty) {
        this.extraPatty = extraPatty;
    }

    @Override
    public Double calculatePrice() {

        double price = getBasePrice();

        if (extraPatty) {
            price = price + 250;
        }

        return price;
    }

    @Override
    public void displayDetails() {

        System.out.println("Item Name: " + getItemName());
        System.out.println("Base Price: " + getBasePrice());

        if (extraPatty) {
            System.out.println("Additional Details: Extra Patty");
        } else {
            System.out.println("Additional Details: No Extra Patty");
        }

        System.out.println("Final Price: " + calculatePrice());
    }
}