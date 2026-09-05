import java.util.Arrays;

public class ArrayLearning {

    public static void main(String[] args) {
        // 1) Kth Largest
        findKthLargest(new int[]{5, 8, 8, 2, 10}, 2); // Expected: 8[cite: 1]

        // 2) Missing Number
        findMissingNumber(new int[]{2, 3, 1, 5}); // Expected: 4[cite: 1]

        // 3) Rotate Right
        rotateRight(new int[]{1, 2, 3, 4, 5}, 2); // Expected: [4, 5, 1, 2, 3][cite: 1]

        // 4) Find Pair with Given Sum
        findPair(new int[]{1, 4, 5, 6}, 10); // Expected: 4 + 6 = 10[cite: 1]

        // 5) Remove Duplicates
        removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 5}); // Expected: 1 2 3 4 5[cite: 1]

        // 6) Find Common Elements
        findCommon(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6}); // Expected: 3 4[cite: 1]

        // 7) Find Majority Element
        findMajority(new int[]{2, 2, 1, 2, 3, 2, 2}); // Expected: 2[cite: 1]

        // 8) Max Difference
        maxDifference(new int[]{2, 3, 10, 6, 4, 8, 1}); // Expected: 8[cite: 1]

        // 9) Leaders in Array
        printLeaders(new int[]{16, 17, 4, 3, 5, 2}); // Expected: 2 5 17[cite: 1]

        // 10) Product Except Self
        productExceptSelf(new int[]{1, 2, 3, 4}); // Expected: [24, 12, 8, 6][cite: 1]

        // 11) First Repeating
        firstRepeating(new int[]{10, 5, 3, 4, 3, 5, 6}); // Expected: 5[cite: 1]

        // 12) First Non-Repeating
        firstNonRepeating(new int[]{9, 4, 9, 6, 7, 4}); // Expected: 6[cite: 1]

        // 13) All Pairs with Given Sum
        findAllPairs(new int[]{1, 5, 7, -1, 5}, 6); // Expected: (1, 5), (7, -1), (1, 5)[cite: 1]

        // 14) Max Consecutive Ones
        maxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}); // Expected: 3[cite: 1]
    }

    // 1) Find Kth Largest distinct element
    public static void findKthLargest(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Bubble Sort (Sorts array in ascending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 2: Access the Kth largest directly from the right side
        System.out.println("1) Kth Largest -> " + arr[arr.length - k]);
    }

    // 2) Find Missing Number (from 1 to N)
    public static void findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        System.out.println("2) Missing Number -> " + (expectedSum - actualSum));
    }

    // 3) Rotate Right by K positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        System.out.println("3) Rotated Array -> " + Arrays.toString(rotated));
    }

    // 4) Find Pair with Given Sum
    public static void findPair(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("4) Pair Found -> " + arr[i] + " + " + arr[j] + " = " + target);
                    return;
                }
            }
        }
        System.out.println("4) No Pair Found");
    }

    // 5) Remove Duplicates
    public static void removeDuplicates(int[] arr) {
        System.out.print("5) No Duplicates -> ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // 6) Find Common Elements
    public static void findCommon(int[] A, int[] B) {
        System.out.print("6) Common Elements -> ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    // 7) Find Majority Element (> arr.length / 2)
    public static void findMajority(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                System.out.println("7) Majority Element -> " + arr[i]);
                return;
            }
        }
        System.out.println("7) No Majority Element");
    }

    // 8) Find Maximum Difference (larger element comes after smaller)
    public static void maxDifference(int[] arr) {
        int minElement = arr[0];
        int maxDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minElement > maxDiff) {
                maxDiff = arr[i] - minElement;
            }
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        System.out.println("8) Max Difference -> " + maxDiff);
    }

    // 9) Leaders in Array (greater than all elements to its right)
    public static void printLeaders(int[] arr) {
        System.out.print("9) Leaders -> ");
        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
        System.out.println();
    }

    // 10) Product of Array Except Self
    public static void productExceptSelf(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    prod *= arr[j];
                }
            }
            result[i] = prod;
        }
        System.out.println("10) Product Except Self -> " + Arrays.toString(result));
    }

    // 11) Find First Repeating Element
    public static void firstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("11) First Repeating -> " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("11) No Repeating Element");
    }

    // 12) Find First Non-Repeating Element
    public static void firstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println("12) First Non-Repeating -> " + arr[i]);
                return;
            }
        }
        System.out.println("12) No Non-Repeating Element");
    }

    // 13) Find All Pairs with Given Sum
    public static void findAllPairs(int[] arr, int target) {
        System.out.print("13) All Pairs -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                }
            }
        }
        System.out.println();
    }

    // 14) Find Maximum Consecutive Ones
    public static void maxConsecutiveOnes(int[] arr) {
        int maxCount = 0, current = 0;
        for (int num : arr) {
            if (num == 1) {
                current++;
                if (current > maxCount) {
                    maxCount = current;
                }
            } else {
                current = 0;
            }
        }
        System.out.println("14) Max Consecutive Ones -> " + maxCount);
    }
}