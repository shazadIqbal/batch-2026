package MapPractice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

//        List<Integer> numbers =
//                Arrays.asList(2, 99, 44, 1, 2, 2, 3,0, 4, 4, 5);

        Set<Integer> unique =
                new TreeSet<>(numbers);

        System.out.println(unique);

        Map<Integer, String> map = new HashMap<>();

        System.out.println(map.put(1, "Ali"));
        System.out.println(map.put(1, "Ahmed"));
//        map.put(1, "Ali");
//        map.put(1, "Ahmed");
////        map.replace(1, "Hammad");
//        System.out.println(map.replace(1, "Hammad"));

//        for (String value : map.values()) {
//            System.out.println(value);
//        }
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

////        Map<Integer , Employee> map = new HashMap<>();
////
////        map.put(101, new Employee("Ali" , "IT"));
////        map.put(102, new Employee("Adil" , "Finance"));
////        map.put(103, new Employee("Zain" , "IT"));
////        map.put(104, new Employee("Zain" , "IT"));
////
////        map.forEach((k, v) -> {
////            System.out.println(k);
////            System.out.println(v);
////        });
//
//
//
////        Map<String , Integer> map = new HashMap<>();
////
////
        String text ="Java Java Spring Java";
        String [] arr = text.split(" ");
        for (String el : arr) {

            if (map.containsKey(el)) {
                map.put(el, map.get(el)+1);
            } else {
                map.put(el,1);
        }
        }

////        System.out.println(map);
//
//
////        for (String el : text.split(" ")) {
////            map.put(el,map.getOrDefault(el,0) +1);
////        }
////
////        System.out.println(map);
//
//        List<String> names = new ArrayList<>();
//        names.add("Hammad");
//        names.add("Ahmed");
//        names.add("Naday");
//        names.add("Ali");
//
////        for ( String n : names)
////        System.out.println(n);
////
////        names.forEach(el -> System.out.println(names));
//
//
//        Iterator<String> iterator = names.iterator();
//
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            if (name.equalsIgnoreCase("Adil")
//                    || name.equalsIgnoreCase("Taha")) {
//
//                iterator.remove();
//
//            }
//        }
//
//        System.out.println(names);
//
//        Map<Integer, String> map = new HashMap<>();
//
//        System.out.println(map.put(1, "Ali"));
//        System.out.println(map.put(1, "Ahmed"));


    }
}
