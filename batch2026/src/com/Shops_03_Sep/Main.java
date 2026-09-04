package com.Shops_03_Sep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // List of shops with multiple promotions
        List<Shop> shopList = new ArrayList<>();

        // Promotions
        Promotion promo1 = new Promotion(
                "AZADI",
                PromotionType.PERCENTAGE,
                "200"
        );

        Promotion promo2 = new Promotion(
                "AZADI1000",
                PromotionType.FIXED,
                "1000"
        );

        Promotion promo3 = new Promotion(
                "T20",
                PromotionType.PERCENTAGE,
                "20"
        );

        Promotion promo4 = new Promotion(
                "T20FLAT",
                PromotionType.FIXED,
                "200"
        );


        // Add shops
        shopList.add(new Shop(
                "Zara",
                Floor.GROUND,
                ShopType.CLOTHING,
                "G-101",
                Arrays.asList(promo1, promo4)
        ));

        shopList.add(new Shop(
                "Tech World",
                Floor.GROUND,
                ShopType.ELECTRONICS,
                "G-102",
                Arrays.asList(promo1)
        ));

        shopList.add(new Shop(
                "Food Corner",
                Floor.SECOND,
                ShopType.FOOD,
                "M-201",
                Arrays.asList(promo1, promo3)
        ));

        shopList.add(new Shop(
                "Foot Locker",
                Floor.FIRST,
                ShopType.SHOES,
                "F-301",
                Arrays.asList(promo4)
        ));

        shopList.add(new Shop(
                "Beauty Store",
                Floor.FIRST,
                ShopType.COSMETICS,
                "F-302",
                Arrays.asList(promo1)
        ));

        shopList.add(new Shop(
                "Book Haven",
                Floor.SECOND,
                ShopType.BOOKS,
                "M-202",
                Arrays.asList(promo2)
        ));


        // STREAM EXAMPLE:
        // Get names of all shops on the GROUND floor
        List<String> result = shopList.stream()
                .filter(s -> Floor.GROUND.equals(s.getFloor()))
                .map(Shop::getName)
                .collect(Collectors.toList());

        System.out.println("Ground Floor Shop Names:");
        System.out.println(result);


        // METHOD EXAMPLES

        List<Shop> groundFloorShops =
                getAllGroundFloorShops(shopList);

        System.out.println("\nAll Ground Floor Shops:");
        System.out.println(groundFloorShops);


        List<Shop> clothingShops =
                getAllClothingShops(shopList, ShopType.CLOTHING);

        System.out.println("\nAll Clothing Shops:");
        System.out.println(clothingShops);


        List<String> firstFloorShopNames =
                getShopNamesWithFloor(shopList, Floor.FIRST);

        System.out.println("\nFirst Floor Shop Names:");
        System.out.println(firstFloorShopNames);
    }


    // Get all shops on the Ground Floor
    private static List<Shop> getAllGroundFloorShops(
            List<Shop> shopList) {

        List<Shop> result = new ArrayList<>();

        for (Shop shop : shopList) {

            if (Floor.GROUND.equals(shop.getFloor())) {
                result.add(shop);
            }
        }

        return result;
    }


    // Get all shops of a particular type
    private static List<Shop> getAllClothingShops(
            List<Shop> shopList,
            ShopType shopType) {

        List<Shop> result = new ArrayList<>();

        for (Shop shop : shopList) {

            if (shopType.equals(shop.getType())) {
                result.add(shop);
            }
        }

        return result;
    }


    // Get shop names based on floor
    private static List<String> getShopNamesWithFloor(
            List<Shop> shopList,
            Floor floor) {

        return shopList.stream()
                .filter(shop -> floor.equals(shop.getFloor()))
                .map(Shop::getName)
                .collect(Collectors.toList());
    }
}