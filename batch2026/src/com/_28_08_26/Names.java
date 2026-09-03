package com._28_08_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Names {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("ALi");
        names.add("Ahmed");
        names.add("Ayesha");
        names.add("Hina");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){

            String name = iterator.next();

            if (name.equalsIgnoreCase("Hina")
            || name.equalsIgnoreCase("Ayesha")){
                iterator.remove();
            }
        }

        System.out.println(names);

//        for(String name: names){
//            System.out.println(name);
//        }
//        list.forEach(el -> System.out.println(el));
    }
}
