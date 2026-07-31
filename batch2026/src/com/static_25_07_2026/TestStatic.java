package com.static_25_07_2026;

public class TestStatic {
    public static void main(String[] args) {

        int[] arr = {5, 0, 2, 0, 8, 1, 0, 9};

        int pointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = temp;
                pointer++;
            }
            ArrayUtil.display(arr);
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

    }



}
