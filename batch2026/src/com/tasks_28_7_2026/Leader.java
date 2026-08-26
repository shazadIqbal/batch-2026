package com.tasks_28_7_2026;

public class Leader {

        public static void main(String[] args) {

            int[] nums = {16, 17, 4, 3, 5, 2};

            for (int i = 0; i < nums.length; i++) {

                boolean isLeader = true;

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[i] <= nums[j]) {
                        isLeader = false;
                        break;
                    }
                }

                if (isLeader) {
                    System.out.println(nums[i]);
                }
            }}
}

