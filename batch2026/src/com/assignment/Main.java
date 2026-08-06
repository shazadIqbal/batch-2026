package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<FoodItem> itemList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){

            System.out.println("press 1 for pizza");
            System.out.println("press 2 for burger");
            System.out.println("press 3 for Drink");
            System.out.println("press 4 for Dessert");

            Integer option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Please tell me pizza flavour");
                    String name = sc.next();
                    System.out.println("Do you want extra cheese ? Y/N");
                    Boolean extraCheese = sc.next().equalsIgnoreCase("Y");
                    itemList.add(new Pizza(name,extraCheese));
                    break;

                case 2:
                    System.out.println("Which Burger do you want?");
                    String burgerName = sc.next();
                    System.out.println("Do you want extra patty ? Y/N");
                    Boolean extraPatty = sc.next().equalsIgnoreCase("Y");
                    itemList.add(new Burger(burgerName,extraPatty));
                    break;

                case 3:
                    System.out.println("Which Drink do you want?");
                    String drinkName = sc.next();
                    System.out.println("Do you want small / medium / large ? ");
                    String size = sc.next();
                    itemList.add(new Drink(drinkName,size));
                    break;

                case 4:
                    System.out.println("Which Dessert do you want?");
                    String desertName = sc.next();
                    System.out.println("How much do you want?");
                    Integer desertQty = sc.nextInt();
                    itemList.add(new Desert(desertName,desertQty));
                    break;


            }
            System.out.println("do you want anything else ? Y/N");
            if(sc.next().equalsIgnoreCase("N")){
                System.out.println("Thank you for your order");
                flag = false;
                int total = 0;
                for(FoodItem item : itemList){
                    item.displayDetails();
                    total+= item.calculatePrice();
                }
                System.out.println("Your total amount is :"+total);
            }



        }




    }

}
