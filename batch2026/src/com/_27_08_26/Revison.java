//package com._27_08_26;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Revision {
//
//    public static void main(String[] args) {
//
//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Apple");
//        map.put(2, "Banana");
//        map.put(3, "Mango");
//
//        // 1. Using for-each loop to print values
//        for (String v : map.values()) {
//            System.out.println(v);
//        }
//
//        // 2. Using forEach and lambda
//        map.values().forEach(v -> System.out.println(v));
//
//        // 3. Using entrySet() to print keys
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//        }
//    }
//}