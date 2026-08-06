package com.assignment;

public class Drink extends FoodItem{

    private String size;

    public Drink(String itemName, String size) {
        super(itemName, 20.0);
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
        if(this.size.equalsIgnoreCase("Medium")){
            return  getBasePrice()+40.0;
        }else if(this.size.equalsIgnoreCase("Large")){
            return getBasePrice()+80.0;
        }
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Drink is "+ getItemName() + " and price is "
                + calculatePrice() + "and size is " + this.getSize());
    }
}
