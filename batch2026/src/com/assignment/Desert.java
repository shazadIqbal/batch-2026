package com.assignment;

public class Desert extends FoodItem{
    private Integer qty;

    public Desert(String itemName, Integer qty) {
        super(itemName, 50.0);
        this.qty = qty;
        if(qty > 2){
            setBasePrice((getBasePrice() * getQty()) * 0.90);
        }
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public Double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Dessert is "+ getItemName() + " and price is "
                + getBasePrice() + "and quantity is " + getQty() );
    }
}
