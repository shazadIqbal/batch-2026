package com._plane;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Plane implements Comparable<HashSet>{

    // Attribute only name
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull HashSet o) {
        return 0;
    }
}