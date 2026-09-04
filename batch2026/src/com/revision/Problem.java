package com.revision;

import java.util.*;

public class Problem {

    public static void main(String[] args) {
        String s = "aabcaab";

        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int val = map.get(ch) + 1;
                map.put(ch,val);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println(map);


        //[a,1]
        //[a,2]




        // [a,b,c];
//        Set<Character> set = new LinkedHashSet<>();
//        for(char c : s.toCharArray()){
//            set.add(c);
//        }
//
//        for(char ch : set){
//            int count = 0;
//            for(char chr : s.toCharArray()){
//                if(ch == chr){
//                    count++;
//                }
//            }
//            System.out.println(ch + " -> "+ count);
//        }
//
//        System.out.println(set);


        // find the frequency of each character
        // output
        // a -> 4
        // b -> 2
        // c -> 1
        //s.indexOf('a');



    }
}
