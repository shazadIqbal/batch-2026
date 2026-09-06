package com.Test_03_09_26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {

        String str = "fcebaacba";

        Character result = firstNonRepeatingCharacter(str);
        System.out.println(result);


    }

    private static Character firstNonRepeatingCharacter(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

       for(Map.Entry<Character,Integer> entry : map.entrySet()){
           if(entry.getValue().equals(1)){
               return entry.getKey();
           }
       }
       return  null;
    }
}
