package com.revision;

import com.static_25_07_2026.ArrayUtil;

public class Test {
    public static void main(String[] args) {

        //{3,2,2,3} // p= 0 // 3
        //{_,_,_,_}
        // {2,2,2,3}
        int[] arr = {0,1,2,2,3,0,4,2};
        int[] arr2 = new int[arr.length];
        // [0,1,3,0,4,0,0,0]
        int val = 2;

       int k = removeElement(arr,val);
        System.out.println(k);
    }


    public static int removeElement(int[] nums, int val) {

        int[] arr = new int[nums.length];
        int index = 0;
        for(int el : nums){
            if(el != val){
                arr[index++] = el;
            }
        }
        return index;
    }


}
