public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {12,15,22,43};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];

        }
        System.out.println("sum ="+ sum);
    }
}
