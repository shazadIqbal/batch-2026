package com;

import java.util.HashMap;
import java.util.Map;

public class Mapp {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ali");
        map.put(2, "Ahmed");
        map.put(3, "Taha");

        System.out.println(map.get(3));

//        for (Mapp.Entry<Integer, String> record : map.entrySet()) {
//
//            System.out.println(record.getKey());
//            System.out.println(record.getValue());
//        }
    }
}