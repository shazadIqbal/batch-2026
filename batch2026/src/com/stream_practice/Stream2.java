package com.stream_practice;

import com.abstraction.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {

        Promotion promo1 = new Promotion("AZADI",PromotionType.PERCENTAGE,"10");
        Promotion promo2 = new Promotion("AZADI1000",PromotionType.FIXED,"1000");
        Promotion promo3 = new Promotion("T20",PromotionType.PERCENTAGE,"20");
        Promotion promo4 = new Promotion("T20FLAT",PromotionType.FIXED,"200");


        List<Shop> shopList = new ArrayList<>();

        shopList.add(new Shop("BONANZA",
                "C101",
                ShopType.GARMENT,
                Floor.GROUNDFLOOR,
                Arrays.asList(promo1,promo4)));


        shopList.add(new Shop("KFC",
                "D120",
                ShopType.FOOD,
                Floor.GROUNDFLOOR,
                Arrays.asList(promo1,promo3)));

        shopList.add(new Shop("BATA",
                "C102",
                ShopType.SHOES,
                Floor.FIRSTFLOOR,
                new ArrayList<>()));

        shopList.add(new Shop("MAKEUP CITY",
                "D201",
                ShopType.MAKEUP,
                Floor.SECONDFLOOR,
                Arrays.asList(promo4)));





    }
}
