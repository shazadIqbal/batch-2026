package com.stream_practice;

import java.util.List;

public class Shop {
    private String name;
    private String shopNumber;
    private ShopType shopType;
    private Floor floor;
    private List<Promotion> promotionList;


    public Shop(String name, String shopNumber, ShopType shopType, Floor floor, List<Promotion> promotionList) {
        this.name = name;
        this.shopNumber = shopNumber;
        this.shopType = shopType;
        this.floor = floor;
        this.promotionList = promotionList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public ShopType getShopType() {
        return shopType;
    }

    public void setShopType(ShopType shopType) {
        this.shopType = shopType;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public List<Promotion> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", shopNumber='" + shopNumber + '\'' +
                ", shopType=" + shopType +
                ", floor=" + floor +
                ", promotionList=" + promotionList +
                '}';
    }
}
