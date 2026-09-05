package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrac {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Taha");
        names.add("Ali");
        names.add("Adil");
        names.add("Ahmed");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){

            String name = iterator.next();
            if (name.equalsIgnoreCase("Adil") || name.equalsIgnoreCase("Taha")){
                iterator.remove();
            }
        }
        System.out.println(names);


//        for (String name : names){
//            System.out.println(name);
//
//        }




    }
}
