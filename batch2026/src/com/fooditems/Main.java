package com.fooditems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodItem pizza = new Pizza("Fajita", true);
        FoodItem burger = new Burger("Beef", true);
        FoodItem drink = new Drink("Pepsi", "Medium");
        FoodItem dessert = new Dessert("Brownie", 3);

        double total = 0;

        System.out.println("---------------------------------------");
        System.out.println("           Food Delivery Bill");
        System.out.println("---------------------------------------");

        while (true) {

            System.out.println();
            System.out.println("Press 1 for Pizza");
            System.out.println("Press 2 for Burger");
            System.out.println("Press 3 for Drink");
            System.out.println("Press 4 for Dessert");
            System.out.println("Press 5 to finish order");

            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println();
                    pizza.displayDetails();
                    total += pizza.calculatePrice();
                    System.out.println("---------------------------------------");
                    break;

                case 2:
                    System.out.println();
                    burger.displayDetails();
                    total += burger.calculatePrice();
                    System.out.println("---------------------------------------");
                    break;

                case 3:
                    System.out.println();
                    drink.displayDetails();
                    total += drink.calculatePrice();
                    System.out.println("---------------------------------------");
                    break;

                case 4:
                    System.out.println();
                    dessert.displayDetails();
                    total += dessert.calculatePrice();
                    System.out.println("---------------------------------------");
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Grand Total: " + total);
                    System.out.println("---------------------------------------");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}