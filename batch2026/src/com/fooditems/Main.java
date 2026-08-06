package com.fooditems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FoodItem[] items;

        FoodItem pizza = new Pizza(" fajita ", true);
//        pizza.displayDetails();

        FoodItem burger = new Burger(" Beef ", true);
//        burger.displayDetails();

        FoodItem drink = new Drink(" Pepsi ","Medium");
        drink.displayDetails();

        FoodItem dessert = new Dessert("Brownie", 3);
//        dessert.displayDetails();

        items = new FoodItem[]{pizza, burger, drink, dessert};



        double total = 0.0;
         for (FoodItem item: items){
             item.displayDetails();
             total += item.calculatePrice();
         }
        System.out.println("The total price is "+ total );

//        Double total = pizza.calculatePrice() + burger.calculatePrice()
//                + drink.calculatePrice() + dessert.calculatePrice();
//        System.out.println("Your total is "+ total);







//        System.out.println("press 1 for pizza");
//        System.out.println("press 2 for burger");
//        System.out.println("press 3 for drink");
//        System.out.println("press 4 for dessert");
//
//        while(true){
//            Integer option = sc.nextInt();
//
//            switch(){
//                case 1;
//            }
//        }
    }
}
