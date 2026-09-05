//package stack_practice;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Mall {
//
//    private String name;
//
//    private List<Shop> shops;
//
//    public Mall(String name) {
//        this.name = name;
//        shops = new ArrayList<>();
//    }
//
//    public void addShop(Shop shop) {
//        shops.add(shop);
//    }
//
//    public List<Shop> getShops() {
//        return shops;
//    }
//
//    // Find shop by shop number
//    public Shop findShopByNumber(int number) {
//
//        for (Shop shop : shops) {
//
//            if (shop.getNumber() == number) {
//                return shop;
//            }
//        }
//
//        return null;
//    }
//
//    // Find shops by ShopType
//    public List<Shop> findShopsByType(ShopType shopType) {
//
//        List<Shop> result = new ArrayList<>();
//
//        for (Shop shop : shops) {
//
//            if (shop.getShopType() == shopType) {
//                result.add(shop);
//            }
//        }
//
//        return result;
//    }
//
//    // Find shops by floor
//    public List<Shop> findShopsByFloor(Floor floor) {
//
//        List<Shop> result = new ArrayList<>();
//
//        for (Shop shop : shops) {
//
//            if (shop.getFloor() == floor) {
//                result.add(shop);
//            }
//        }
//
//        return result;
//    }
//
//    // Find shops by ShopType AND Floor
//    public List<Shop> findShopsByTypeAndFloor(
//            ShopType shopType,
//            Floor floor) {
//
//        List<Shop> result = new ArrayList<>();
//
//        for (Shop shop : shops) {
//
//            if (shop.getShopType() == shopType
//                    && shop.getFloor() == floor) {
//
//                result.add(shop);
//            }
//        }
//
//        return result;
//    }
//
//    // Find shop with highest discount
//    public Shop findShopWithHighestDiscount(double price) {
//
//        Shop highestShop = null;
//
//        double highestDiscount = 0;
//
//        for (Shop shop : shops) {
//
//            double discount = shop.getHighestDiscount(price);
//
//            if (discount > highestDiscount) {
//
//                highestDiscount = discount;
//                highestShop = shop;
//            }
//        }
//
//        return highestShop;
//    }
//}