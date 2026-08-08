package com.assignment;

public  class FoodItem {

    private  String itemName;
    private Double basePrice;

    public FoodItem() {
    }

    public FoodItem(String itemName, Double basePrice) {
        this.itemName = itemName;
        this.basePrice = basePrice;
    }

    public  String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public  Double calculatePrice(){
        return this.basePrice;
    }

    public void displayDetails(){
        System.out.println("Food Item is "+this.itemName + " and price is "+this.basePrice);
    }
}
