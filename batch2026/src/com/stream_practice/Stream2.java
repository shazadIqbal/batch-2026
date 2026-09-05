package com.stream_practice;


import java.util.*;
import java.util.stream.Collectors;

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

        shopList.add(new Shop("BABA CITY",
                "D202",
                ShopType.GARMENT,
                Floor.FIRSTFLOOR,
                Arrays.asList(promo2)));


//        List<String> shopNames = getShopNamesWithFloor(shopList,Floor.SECONDFLOOR);
//
//        shopNames.forEach(System.out::println);
//
//        Shop shopName = getShopByShopName(shopList,"KFC");
//
//        String shopNumber = getShopNumberByShopName(shopList,"KFC");
//
//        System.out.println(shopNumber);
//
//        Long count = getShopCountByFloor(shopList,Floor.GROUNDFLOOR);
//        System.out.println(count);

//        Set<Promotion> result = getAllFixedPromotion(shopList);
//        result.forEach(System.out::println);
//
        List<String> result = getShopNamesForPromoType(shopList,PromotionType.PERCENTAGE);
        System.out.println(result);;

    }

    private static List<Shop> getAllGroundFloorShops(List<Shop> shopList){
//        List<Shop> result = new ArrayList<>();
//        for(Shop shop : shopList){
//            if(Floor.GROUNDFLOOR.equals(shop.getFloor())){
//                result.add(shop);
//            }
//        }
//        return result;

        return shopList.stream()
                .filter(s->Floor.GROUNDFLOOR.equals(s.getFloor()))
                .collect(Collectors.toList());


    }

    private static List<Shop> getAllShopsWithType(List<Shop> shopList, ShopType shopType){
//        List<Shop> result = new ArrayList<>();
//        for (Shop shop : shopList){
//            if(shopType.equals(shop.getShopType())){
//                result.add(shop);
//            }
//        }
//        return result;
        return shopList.stream()
                .filter(s -> shopType.equals(s.getShopType()))
                .collect(Collectors.toList());


    }

    private static List<String> getShopNamesWithFloor(List<Shop> shopList , Floor floor){
//        List<String> result = new ArrayList<>();
//        for(Shop shop : shopList){
//            if(floor.equals(shop.getFloor())){ //null
//                result.add(shop.getName());
//            }
//        }
//        return result;
        return shopList.stream()
                .filter(s -> floor.equals(s.getFloor()))
                .map(Shop::getName)
                .collect(Collectors.toList());

    }

    private static Shop getShopByShopName(List<Shop> shopList , String name){

//        for(Shop shop : shopList){
//            if(name.equalsIgnoreCase(shop.getName())){
//                return shop;
//            }
//        }
//        return null;

        return shopList.stream()
                .filter(s -> name.equalsIgnoreCase(s.getName()))
                .findAny().orElse(null);


    }

    private static String getShopNumberByShopName(List<Shop> shopList , String name){

//        for(Shop shop : shopList){
//            if(name.equalsIgnoreCase(shop.getName())){
//                return shop.getShopNumber();
//            }
//        }
//
//        return null;

        return shopList.stream()
                .filter(s -> name.equalsIgnoreCase(s.getName()))
                .map(Shop::getShopNumber)
                .findAny().orElse(null);
    }

    private static Long getShopCountByFloor(List<Shop> shopList ,Floor floor){
//        Long count = 0L;
//        for (Shop shop : shopList){
//            if(floor.equals(shop.getFloor())){
//                count++;
//            }
//        }
//        return count;

        return shopList.stream()
                .filter(s -> floor.equals(s.getFloor()))
                .count();



    }

    private static Boolean isShopPresent(List<Shop> shopList, String name){

        return  shopList.stream()
                .anyMatch(s -> name.equalsIgnoreCase(s.getName()));

    }

    private static List<Promotion> getAllPromotionByShopName(List<Shop> shopList, String shopName){
//        List<Promotion> promotionList = new ArrayList<>();
//        for(Shop shop : shopList){
//            if(shopName.equalsIgnoreCase(shop.getName())){
//               promotionList.addAll(shop.getPromotionList());
//            }
//        }
//        return promotionList;
       // flatmap

       return shopList.stream()
               .filter(s->shopName.equalsIgnoreCase(s.getName()))
               .flatMap(s->s.getPromotionList().stream())
               .collect(Collectors.toList());



    }

    private static Set<Promotion> getAllFixedPromotion(List<Shop> shopList){
            Set<Promotion> promotionList = new HashSet<>();

//            for(Shop shop : shopList){
//                for(Promotion promo : shop.getPromotionList()){
//                    if(promo.getPromotionType().equals(PromotionType.FIXED)){
//                        promotionList.add(promo);
//                    }
//                }
//            }
//
//            return promotionList;

            return shopList.stream()
                    .flatMap(s->s.getPromotionList().stream())
                    .filter(p->PromotionType.FIXED.equals(p.getPromotionType()))
                    .collect(Collectors.toSet());


    }


    private static List<String> getShopNamesForPromoType(List<Shop> shopList , PromotionType promotionType){

//        List<String> result = new ArrayList<>();
//
//        for(Shop shop : shopList){
//            for (Promotion promotion : shop.getPromotionList()){
//
//                if(promotionType.equals(promotion.getPromotionType())){
//                    result.add(shop.getName());
//                    break;
//                }
//            }
//
//        }
//
//        return result;

        return shopList
                .stream()
                .filter(s->s.getPromotionList().stream()
                        .anyMatch(p->promotionType.equals(p.getPromotionType())))
                .map(Shop::getName)
                .collect(Collectors.toList());


    }




    private static Map<Floor,Integer> countShopByFloors(List<Shop> shopList){



    }






}
