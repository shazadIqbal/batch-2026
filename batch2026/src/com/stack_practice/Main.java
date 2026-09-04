package com.stack_practice;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // []
        //int a = 10;
        // home , profile , message
        // 2+3
        // methodA , methodB , methodC

        // pop
        // peek
        // push

        //Navigation list LIFO
        Stack<String> stack = new Stack<>();

        stack.push("Home");
        stack.push("Profile");
        stack.push("Dashboard");

        System.out.println(stack.peek());

        System.out.println(stack.pop());


        for(String s : stack){
            System.out.println(s);
        }


    }
}
