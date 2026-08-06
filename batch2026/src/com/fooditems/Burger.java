package com.fooditems;

public class Burger extends FoodItem{

    private boolean extraPatty;

    public Burger(String itemName, boolean extraPatty) {
        super(itemName, 100);
        this.extraPatty = extraPatty;
        if(extraPatty){
            setBasePrice(getBasePrice()+ 250);
        }
    }

    public boolean isExtraPatty() {
        return extraPatty;
    }

    public void setExtraPatty(boolean extraPatty) {
        this.extraPatty = extraPatty;
    }

    @Override
    public Double calculatePrice() {

        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Food item is"+getItemName() + "and the price is "+ getBasePrice());
        if (extraPatty){
            System.out.println("with extra patty");
        }
    }
}
