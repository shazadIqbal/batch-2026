//package com.revision;
//
//import java.util.*;
//import java.util.Collections;
//
//public class CollectionPractice {
//    public static void main(String[] args) {
//
//        Map<Integer , String> map = new HashMap<>();
//        map.put(1,"Apple");
//        map.put(2,"Orange");
//        map.put(3,"Banana");
//        map.put(4,"Grape");
//
//        for (String v : map.values()) {
//            System.out.println(v);
//        }
//
//
//
//
////        List<Student1> student1List = new ArrayList<>();
////
////        student1List.add(new Student1("Taha" , Gender.M));
////        student1List.add(new Student1("Alina" , Gender.F));
////        student1List.add(new Student1("Adil" , Gender.M));
////        student1List.add(new Student1("Ahsan" , Gender.M));
////        student1List.add(new Student1("Hira" , Gender.F));
//
//
//        Collections.sort(student1List);
//        student1List.forEach(student1 -> System.out.println(student1));
//
////        Map<Gender,Integer> map = new HashMap<>();
////        for (Student1 s : student1List) {
////            if (map.containsKey(s.getGender())) {
////                int val = map.get (s.getGender())+1;
////                map.put(s.getGender(),val);
////            } else {
////                map.put(s.getGender(),1);
////            }
////        }
////
////        System.out.println(map);
//
//
//
////        String s = "aabcaab";
////
////        Map<Character,Integer> map =  new HashMap<>();
////
////        for (char ch : s.toCharArray()) {
////            if (map.containsKey(ch)) {
////                map.put(ch, map.get(ch) +1);
////            } else {
////                map.put(ch,1);
////            }
////        }
////        System.out.println(map);
//
////        Map<Integer , String> map = new HashMap<>();
////
////        map.put(1,"Apple");
////        map.put(2,"Orange");
////        map.put(3,"Banana");
////        map.put(4,"Grape");
////
////        //how to  iterate value
////
////        for (String v : map.values()) {
////            System.out.println(v);
////        }
////
////        //iterate values with foreach
////        map.values().forEach(v -> System.out.println(v));
////
////        //iterate on entry using map foreach
////
////        map.forEach((k,v) ->{
////            System.out.println(k);
////            System.out.println(v);
////        });
//
////        String s = "aabcaab";
////
////        char[] ch  = s.toCharArray();
////
////        int count = 0;
////
////        for (int i=0 ; i<s.length() ; i++) {
////            for (int j=0 ; j<s.length() ; j++) {
////                if (ch[j]==ch[i]) {
////                    count++;
////                }
////            }
////            System.out.println("our charatat " + ch[i] + "is repeated that times" + count);
////            count = 0;
////            System.out.println("");
////        }
//
//    }
//}
