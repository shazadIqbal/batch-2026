package com.fooditems;

public class Dessert extends FoodItem {

    private Integer quantity;

    public Dessert(String itemName, Integer quantity) {
        super(itemName, 100);
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public Double calculatePrice() {

        double price = getBasePrice() * quantity;

        if (quantity > 2) {
            price = price * 0.90;
        }

        return price;
    }

    @Override
    public void displayDetails() {

        System.out.println("Item Name: " + getItemName());
        System.out.println("Base Price: " + getBasePrice());
        System.out.println("Additional Details: Quantity = " + getQuantity());
        System.out.println("Final Price: " + calculatePrice());
    }
}