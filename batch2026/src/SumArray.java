public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,4};

        int sum = 0;

        for (int el : arr){
            sum+=el;
        }

        System.out.println(sum);
    }
}
