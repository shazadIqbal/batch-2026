public class Practice4 {

    public static void main(String[] args) {
            int[] nums = {1 , 2 , 3 , 4 , 2 , };
        System.out.println(nums.length);

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("Majority Element: " + candidate);
    }
}