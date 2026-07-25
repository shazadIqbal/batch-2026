package com.static_25_07_2026;

public class Mobile {
    String name;
    String model;
    Integer battery;
    public static Integer count = 0;

    public Mobile(String name, String model, Integer battery) {
        this.name = name;
        this.model = model;
        this.battery = battery;
        count++;
    }

    public Mobile() {
      count++;
    }


    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", battery=" + battery +
                '}';
    }
}
