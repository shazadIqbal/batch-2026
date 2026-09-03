package com._02_09;

import java.util.Stack;

public class StackLearning {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Home page");
        stack.push("Info");
        stack.push("Contact Us");

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println("--------------------");


        for (String s: stack){
            System.out.println(s);
        }
    }
}
