package com.stack_practice;

import java.util.Stack;

public class Main2 {

    // ( [ { } ] )

    // ( [ {


    // ( [ ) ]
    // ( [

    // () [] {}
    //

    // )[]{}
    public static void main(String[] args) {

        boolean answer = isValid("([)]");
        System.out.println(answer);

    }



    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '[' || ch=='{' ){
                stack.push(ch);
            }else{

                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if(ch == ')' && top != '(' ||
                        ch == ']' && top != '[' ||
                        ch == '}' && top != '{'
                ){
                    return false;
                }

            }

        }

        return stack.isEmpty();
    }
}
