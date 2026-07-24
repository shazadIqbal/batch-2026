public class CountZeros {
    public static void main(String[] args) {

        int[] arr = {1,4,0,2,3,0,9,8,0,0,1,0,0};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                count++;
            }
        }
        System.out.println(count);

        }

    }
