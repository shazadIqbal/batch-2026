package sets;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Problem {
    public static void main(String[] args) {
        String s = "aabcaab";
        //[a,b,c];
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        System.out.println(set);

        for (char ch : set) {
            int count = 0;
            for (char el : s.toCharArray()) {
                if (ch == el) {
                    count++;
                }
            }
            System.out.println(ch + " -> " + count);
        }
        System.out.println();

        // easier method using Map

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else
            {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        System.out.println();


    Map<Character, Integer> maap = new HashMap<>();
        for(char chr : s.toCharArray()){
        if(maap.containsKey(chr)){
            int val = maap.get(chr) + 1;
            maap.put(chr, val);
        }else
        {
            maap.put(chr, 1);
        }
    }
        System.out.println(maap);
}

}