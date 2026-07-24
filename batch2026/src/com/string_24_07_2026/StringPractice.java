package com.string_24_07_2026;

public class StringPractice {
    public static void main(String[] args) {
        String s = "Hello"; //by literal
        String s1 = new String("hello"); //by new keyword

        // StringBuilder and StringBuffer (mutable string)
        // StringBuilder is not thread safe, while buffer is thread safe
        // name = "test"

        StringBuilder sb = new StringBuilder("Stepway");
        sb.append(" is ");
        sb.append(" yellow ");

        System.out.println(sb);

        /**
         * int a = 5;
         * int b = 10;
         * swap the values
         * print a will be 10
         * print b will be 5
         */

    }
}
