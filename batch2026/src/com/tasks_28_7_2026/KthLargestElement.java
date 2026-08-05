package com.tasks_28_7_2026;

public class KthLargestElement {
    public static void main(String[] args) {

        int[] arr = {1,8,8,5,12,16,3,4,7,9};

        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            }
        for(int el : arr) {
            System.out.println(el + "");
        }
        int k = 3;
        System.out.println("The Kth largest element is: "+arr[k-1]);
    }
}
