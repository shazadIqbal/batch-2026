package com.tasks_28_7_2026;

public class RotatingArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        
        int k = 3;

        for (int j = 0; j < k; j++) {

            int temp = arr[arr.length-1];

            for (int i = arr.length - 1; i > 0 ; i--) {
                arr[i] = arr[i-1];
            }

            arr[0] = temp;
        }
        for(int el: arr){
            System.out.println(el + "");
        }

    }
}
