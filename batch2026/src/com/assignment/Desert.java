package com.assignment;

public class Desert extends FoodItem{
    private Integer qty;

    public Desert(String itemName, Integer qty) {
        super(itemName, 50.0);
        this.qty = qty;

    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public Double calculatePrice() {
        if(qty > 2){
            return (getBasePrice() * getQty()) * 0.90;
        }
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Dessert is "+ getItemName() + " and price is "
                + calculatePrice() + "and quantity is " + getQty() );
    }
}
