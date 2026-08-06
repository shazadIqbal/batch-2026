package com.fooditems;

public class Pizza extends FoodItem {

    private boolean extraCheese;

    public Pizza(String itemName, boolean extraCheese) {
        super(itemName, 50);
        this.extraCheese = extraCheese;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public Double calculatePrice() {

        double price = getBasePrice();

        if (extraCheese) {
            price = price + 200;
        }

        return price;
    }

    @Override
    public void displayDetails() {

        System.out.println("Item Name: " + getItemName());
        System.out.println("Base Price: " + getBasePrice());

        if (extraCheese) {
            System.out.println("Additional Details: Extra Cheese");
        } else {
            System.out.println("Additional Details: No Extra Cheese");
        }

        System.out.println("Final Price: " + calculatePrice());
    }
}