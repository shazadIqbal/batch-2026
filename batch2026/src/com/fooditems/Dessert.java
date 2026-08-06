package com.fooditems;

public class Dessert extends FoodItem{

    private Integer quantity;

    public Dessert(String itemName, Integer quantity) {
        super(itemName, 100);
        this.quantity = quantity;
        if (quantity > 2){
            setBasePrice(getBasePrice() * getQuantity() * 0.9);
        }
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public Double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("The desert is " + getItemName()+ " price is "
                + getBasePrice() + "and the quantity is "+ getQuantity());
    }
}
