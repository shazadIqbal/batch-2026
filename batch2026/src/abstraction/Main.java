package abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Animal> animallist = new ArrayList<>();
        Animal cat = new Cat();
        cat.sound();
        cat.eat();


        System.out.println("Hello");
    }
}
