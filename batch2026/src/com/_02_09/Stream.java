package com._02_09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("ZOheb");
        names.add("Ruslan");
        names.add("Ahmer");
        names.add("Ahmed");
        names.add("Anas");
        names.add("Zainab");

//        for (String n: names){
//
//            System.out.println(n);
//        }
//        names.forEach(n-> System.out.println(n));

//        List<String> newNames = new ArrayList<>();
//
//        for (String name: names){
//            if(name.startsWith("A")){
//                newNames.add(name);
//            }
//        }
//        System.out.println("-----------");
//        System.out.println(newNames);

        List<String> result = names.stream()
                .filter(n-> n.startsWith("A"))
                .collect(Collectors.toList());



//        String result = getFirst(names);
//        System.out.println(result);
    }

    public static String getFirst(List<String> names){
        for(String name: names){
            if(name.startsWith("A")){
                return name;
            }
        }
        return null;
    }
}

