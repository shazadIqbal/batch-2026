package com.Test_03_09_26;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharHashMap {
    public static void main(String[] args) {

        // Count the number of a, e, p, i

        String str = "Hello this is programming, Welcome to Java";

        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : str.toCharArray()) {

            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'p' || ch == 'i') {

                if (map.containsKey(ch)) {
                    // one way of doing this
                    map.put(ch,map.get(ch)+1);
                    // another way of doing this
//                    int count = map.get(ch) + 1;
//                    map.put(ch, count);
                } else {
                    map.put(ch, 1);
                }
                // shortest way of doing this
//                map.put(ch,map.getOrDefault(ch,0) +1);
            }
        }

        System.out.println(map);
    }
}
