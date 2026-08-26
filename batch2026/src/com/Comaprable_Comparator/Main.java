//package com.Comaprable_Comparator;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<Card> list = new ArrayList<>();
//
//        list.add(new Card(1234, "Ahmed", 111,"04/28"));
//        list.add(new Card(1235, "Hammad", 222,"04/28"));
//        list.add(new Card(1236, "Syed", 333,"04/28"));
//        list.add(new Card(1237, "Raza", 444,"04/28"));
//        list.add(new Card(1238, "Hamza", 555,"04/28"));
//
//        Collections.sort(list,new CardSorting());
//
//        Collections.sort(List, Comparator.comparing(Card::getCvv));
//
//        list.forEach(c -> System.out.println(c));
//
//        System.out.println(list);
//    }
//}
