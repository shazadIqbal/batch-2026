package com.collections_3;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

// [1,_,4,2,0,1]
        List<String> names = new ArrayList<>();

        names.add("TAHA");
        names.add("ALI");
        names.add("ADIL");
        names.add("AHMED");
        names.add("ZAIN");
        names.add("ZAIN");


        Collections.sort(names);
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){

            String name = iterator.next();
            if(name.equalsIgnoreCase("ADIL")
                    || name.equalsIgnoreCase("TAHA")){

                iterator.remove();
            }
        }


        System.out.println(names);



//        for(String name : names){
//            System.out.println(name);
//            names.remove(name);
//        }





//        Map<Integer,Employee> map = new HashMap<>();
//
//        map.put(101,new Employee("ALI","IT"));
//        map.put(102,new Employee("ADIL","OPS"));
//        map.put(103,new Employee("TAHA","ADMIN"));
//        map.put(104,new Employee("AHMED","IT"));
//        map.put(105,new Employee("ZAIN","IT"));
//
//
//        map.remove(101);
////        map.forEach((k,v)->{
////            System.out.println(k);
////            System.out.println(v);
////        }); o(n) O(1)
//
//        System.out.println(map.get(101));
//

//        String text = "Java Java Spring Java Python Spring";
//
//        Map<String,Integer> map = new HashMap<>();
//
//        for(String el : text.split( " ")){
//           map.put(el,map.getOrDefault(el,0) + 1);
//        }
//
//        System.out.println(map);
       // System.out.println(map.getOrDefault("Python",0));

       // System.out.println(map.get(""));
        //System.out.println(map.getOrDefault("Java",0));






    }
}
