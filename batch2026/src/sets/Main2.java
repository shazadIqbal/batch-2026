package sets;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        String text = "Java Java String Java Python String";
//        String [] arr = text.split(" ");
//        for (String el : arr){
//            System.out.println(el);
//        }
//        // checking frequency of each word
        Map<String, Integer> map = new HashMap<>();
        for (String el : text.split("")) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        System.out.println(map);
    }
}
//
//        for (String el : arr){
////            if (map.containsKey(el)){
////                map.put(el, map.get(el)+1);
////            }else{
////                map.put(el, 1);
////            }
//
//        }
//        System.out.println(map);
//    }
//}
