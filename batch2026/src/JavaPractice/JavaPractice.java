package JavaPractice;

public class JavaPractice {

    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {

                System.out.println("First Non-Repeating Element = " + arr[i]);

                return;
            }
        }

        System.out.println("No Non-Repeating Element");
    }
}