package com.string_24_07_2026;

public class StringBuilderProblems {
    public static void main(String[] args) {
        /**
         * check the string is palindrome
         */
        String str = "madam";
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
