package com.fooditems;

public class Pizza extends FoodItem {

    private boolean extraCheese;

    public Pizza(String itemName, boolean extraCheese) {
        super(itemName, 50);
        this.extraCheese = extraCheese;
        if(extraCheese){
            setBasePrice(getBasePrice()+ 200);
        }

    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public Double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Food item is"+ getItemName() + "and the price is "+ getBasePrice());

        if(extraCheese){
            System.out.println("With extra cheese");;
        }
    }
}
