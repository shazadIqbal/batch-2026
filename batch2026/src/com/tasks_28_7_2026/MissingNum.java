package com.tasks_28_7_2026;

public class MissingNum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,7,8};

        for (int i = 1; i <=8 ; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length ; j++) {

                if(arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if(found == false) {
                System.out.println("The missing number is: "+ i);
                break;
            }

        }
    }
}
