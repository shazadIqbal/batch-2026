package com.static_25_07_2026;

public class UsingArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 6, 2};

        // Call the sort method
        int[] sortedArray = ArrayUtil.sort(numbers);

        // Call the display method
        ArrayUtil.display(sortedArray);
    }
}