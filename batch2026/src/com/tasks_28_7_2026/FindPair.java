package com.tasks_28_7_2026;

public class FindPair {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        int sum = 7;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length ; j++) {

                if(arr[i]+arr[j] == sum){
                    System.out.println(arr[i]+"+"+arr[j]+"="+sum);

                    found = true;
                }
                
            }

        }

        if(found == false){
            System.out.println("No such pair found");
        }

    }
}
