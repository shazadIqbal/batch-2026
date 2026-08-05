package com.assignment;

public class Drink extends FoodItem{

    private String size;

    public Drink(String itemName, String size) {
        super(itemName, 20.0);
        this.size = size;
        if(this.size.equalsIgnoreCase("Medium")){
            setBasePrice(getBasePrice()+40.0);
        }else if(this.size.equalsIgnoreCase("Large")){
            setBasePrice(getBasePrice()+80.0);
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public Double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Drink is "+ getItemName() + " and price is "
                + getBasePrice() + "and size is " + this.getSize());
    }
}
