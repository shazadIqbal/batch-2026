package com.fooditems;

public class Drink extends FoodItem {

    private String size;

    public Drink(String itemName, String size) {
        super(itemName, 20);
        this.size = size;

        if (this.size.equalsIgnoreCase("Medium")){
            setBasePrice(getBasePrice() + 40);
        } else if (this.size.equalsIgnoreCase("Large")) {
            setBasePrice(getBasePrice()+ 80);
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
        System.out.println("Drink is"+ getItemName()+" and the price is " + getBasePrice() +"and the size is " + getSize());
    }
}
