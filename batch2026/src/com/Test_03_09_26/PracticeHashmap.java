package com.Test_03_09_26;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashmap {
    public static void main(String[] args) {

        // Count the frequency of a, e, i

        String text = "These are the vowels a e i o u";

        Map<Character, Integer> map = new HashMap<>();

        for (Character ch: text.toCharArray()){

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }
        }
        System.out.println(map);
    }

}
