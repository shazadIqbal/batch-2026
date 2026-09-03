package com._28_08_26;

import java.util.HashMap;
import java.util.Map;

public class MainSort {
    public static void main(String[] args) {
//        Map<Integer, Employee> map = new HashMap<>();
//
//        map.put(101,new Employee("Ali", "IT"));
//        map.put(101,new Employee("Adil", "ADMIN"));
//        map.put(101,new Employee("Ali", "OPS"));
//        map.put(101,new Employee("Ali", "IT"));
//
//        map.forEach((k, v) -> {
//            System.out.println(k);
//            System.out.println(v);
//        });
//
        String text = "Java Java Spring Java";
        String[] arr = text.split(" ");
        // you can write this in here as well for(String el : text.split(" "))

        Map<String, Integer> map = new HashMap<>();


        for(String el : arr){
            map.put(el, map.getOrDefault(el,0) + 1);
//            if(map.containsKey(el)){
//                map.put(el, map.get(el) +1);
//            }else{
//                map.put(el,1);
//            }
        }
        System.out.println(map);

    }
}
