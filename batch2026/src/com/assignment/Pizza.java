package com.assignment;

public class Pizza extends FoodItem{

    private boolean extraCheese;

    public Pizza(String itemName, boolean extraCheese) {
        super(itemName, 50.0);
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
        if(this.extraCheese){
            return getBasePrice() + 200.0;
        }
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.print("Pizza flavour is "+ getItemName() + " and price is "+ calculatePrice());
        if(extraCheese){
            System.out.println(" with extra cheese");
        }
    }
}
