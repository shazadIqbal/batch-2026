package com.assignment;

public class Burger extends FoodItem{
    private Boolean extraPatty;


    public Burger(String itemName, Boolean extraPatty) {
        super(itemName, 100.0);
        this.extraPatty = extraPatty;
        if(extraPatty){
            setBasePrice(getBasePrice()+250.0);
        }
    }

    public Boolean getExtraPatty() {
        return extraPatty;
    }

    public void setExtraPatty(Boolean extraPatty) {
        this.extraPatty = extraPatty;
    }

    @Override
    public Double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.print("Burger type is "+ getItemName() + " and price is "+ getBasePrice());
        if(extraPatty){
            System.out.println(" with extra patty");
        }
    }
}
