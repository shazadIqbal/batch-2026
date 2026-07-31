package com.static_25_07_2026;

public class ArrayUtil {

    //{4,3,6,2}
    //{3,4,6,2}
    //{3,4,2,6}
    //{3,2,4,6}
    //{2,3,4,6}
    public static int[] sort(int[] array){
        int temp =0;
        for (int i = 0; i < array.length - 1 ; i++) {

                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
        }
        return array;
    }

    public static void display(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
