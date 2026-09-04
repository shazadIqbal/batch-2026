package com.stack_practice;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("TAHA");
        names.add("ALI");
        names.add("ZAIN");
        names.add("AHMED");
        names.add("SHAHZAD");


//        String result = getFirst(names);
//        System.out.println(result);


        //names.forEach(n-> System.out.println(n));

        // streams api
        // intermediate
        // terminal foreach , collect , findfirst
      String result =  names.stream()
                        .filter(name -> name.startsWith("A"))
                        .findFirst().orElse(null);


        System.out.println(result);
//
//
//        System.out.println(result);
//        List<String> result = new ArrayList<>();
//        for(String name : names){
//            if(name.startsWith("A")){
//                result.add(name);
//            }
//        }

    }


    public static String getFirst(List<String> names){
        for(String name : names){
            if(name.startsWith("A")){
                return name;
            }
        }
        return null;
    }
}
