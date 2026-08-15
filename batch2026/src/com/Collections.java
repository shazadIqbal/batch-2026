package com;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ahmed");
        names.add("Taha");
        names.add("Rehman");
        names.add("Mohsin");

        System.out.println(names);

//        for (String name : names) {
//            if (name.startsWith("A") || name.startsWith("a")) {
//                System.out.println(name);
//            }
//        }

        for (String name : names) {
            if (name.length() > 4) {
                System.out.println(name);
            }
        }
    }
}
