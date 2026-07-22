public class Ahsan {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4};
        int sum=0;
        for (int el : arr){
            sum+=el;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println(sum);

    }
}
