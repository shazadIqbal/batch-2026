package com._plane;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Plane> hashSet = new HashSet<>();

        hashSet.add(new Plane("PIA"));
        hashSet.add(new Plane("Airblue"));
        hashSet.add(new Plane("FlyJinnah"));

        System.out.println(hashSet);


        Set<Plane> treeSet = new TreeSet<>();

        treeSet.add(new Plane("Qatar Airways"));
        treeSet.add(new Plane("Emirates"));
        treeSet.add(new Plane("Etihad Airways"));

//        Set<Plane> linkedHashSet = new LinkedHashSet<>();
//
//        linkedHashSet.add(new Plane("British Airways"));
//        linkedHashSet.add(new Plane("American Airlines"));
//        linkedHashSet.add(new Plane("Japan Airlines"));
//        System.out.println(linkedHashSet);
//        System.out.println(treeSet);


    }
}
