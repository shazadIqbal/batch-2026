package sets;

import java.util.HashMap;
import java.util.Map;

public class CollectionPractice {
    public static void main(String[] args) {

        //declare and initialize
        //how to add values in map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Banana");
        map.put(4, "Grape");

        //sout(map);
        // 1) how to iterate values
        for (String v : map.values()){
            System.out.println(v);
        }
        System.out.println();
        // 2) iterate values with forEach... 1 & 2 will print same.
        map.values().forEach(v-> System.out.println(v));

        System.out.println();
        // 3) iterate on entry using map forEach
        map.forEach((k, v)->{
            System.out.println(k);
            System.out.println(v);
        });

        System.out.println();
        // 4) iterate on entry , means each record...  3 & 4 will print same
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
