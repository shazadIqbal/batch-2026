package com.revision;

import java.util.HashMap;
import java.util.Map;

public class CollectionPractice {
    public static void main(String[] args) {

        //declare and initialize
        Map<Integer,String> map = new HashMap<>();

        //how to add values in map
        map.put(1,"APPLE");
        map.put(2,"ORANGE");
        map.put(3,"BANANA");
        map.put(4,"GRAPE");


        //how to iterate values
        for(String v :  map.values()){
            System.out.println(v);
        }

        // iterate values with foreach
        map.values().forEach(v-> System.out.println(v));

        map.keySet().forEach(k-> System.out.println(k));
        // iterate on entry , means each record
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // iterate on entry using map foreach
        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });




    }
}
