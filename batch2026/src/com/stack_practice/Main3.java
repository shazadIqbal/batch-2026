package com.stack_practice;

public class Main3 {
    public static void main(String[] args) {


//        Calculate calculate = (Integer num1, Integer num2) -> {
//         return num1 + num2;
//        };
//
//        System.out.println(calculate.add(5,4));

        ModifyName modifyName = (String text) -> {
            return text.toUpperCase();
        };


        modifyName.upperCase("Hello");





    }
}
