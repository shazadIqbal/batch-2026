package com.stream_practice;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str = "abcaabecf";

        Character result = firstNonRepeatingCharacter(str);
        System.out.println(result);


    }

    private static Character firstNonRepeatingCharacter(String str){


        Map<Character,Long> map = str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(char ch : str.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }

        return null;

    }
}
