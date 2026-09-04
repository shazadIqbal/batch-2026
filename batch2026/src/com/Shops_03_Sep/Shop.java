package com.Shops_03_Sep;

import java.util.List;

public class Shop {

    private String name;
    private Floor floor;
    private ShopType type;
    private String shopNumber;
    private List<Promotion> promotions;

    public Shop(String name, Floor floor, ShopType type, String shopNumber, List<Promotion> promotions) {
        this.name = name;
        this.floor = floor;
        this.type = type;
        this.shopNumber = shopNumber;
        this.promotions = promotions;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public ShopType getType() {
        return type;
    }

    public void setType(ShopType type) {
        this.type = type;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", type=" + type +
                ", shopNumber='" + shopNumber + '\'' +
                ", promotions=" + promotions +
                '}';
    }
}