package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        FoodItem[] items;
//
//        // polymorphism
//        FoodItem pizza = new Pizza("fajita",true);
//        //pizza.displayDetails();
//
//        FoodItem burger = new Burger("Beef Burger",true);
//        //burger.displayDetails();
//
//        FoodItem drink = new Drink("Cola","large");
//        //drink.displayDetails();
//
//        FoodItem dessert = new Desert("Cake",3);
//        //dessert.displayDetails();
//
//        items = new FoodItem[]{pizza, burger, drink, dessert};
//
//        double total = 0.0;
//        for(FoodItem item : items){
//            item.displayDetails();
//            total += item.calculatePrice();
//        }
//        System.out.println(total);
//        Double total = pizza.calculatePrice() + burger.calculatePrice()
//                + drink.calculatePrice() + dessert.calculatePrice();
//        System.out.println("Your grand total is "+ total);



        List<FoodItem> itemList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("press 1 for pizza");
        System.out.println("press 2 for burger");
        System.out.println("press 3 for Drink");
        System.out.println("press 4 for Dessert");
        System.out.println("press 5 for Total");

        while(flag){
            Integer option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Please tell me pizza flavour");
                    String name = sc.next();
                    System.out.println("Do you want extra cheese ? Y/N");
                    Boolean extraCheese = sc.next().equalsIgnoreCase("Y");
                    itemList.add(new Pizza(name,extraCheese));
                    break;

                case 5:
                    flag = false;
                    for(FoodItem item : itemList){
                        item.displayDetails();
                    }
                    break;

            }
            System.out.println("do you want anything else ?");






        }




    }

}
