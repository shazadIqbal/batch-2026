public class StringProblem {
    public static void main(String[] args) {
//        String name = "kabir";
//        char chr = 'l';
//        String reverse = "";
//        char[] arr = name.toCharArray();
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            reverse += arr[i];
//        }
//        System.out.println(reverse);

        // palindrome


        int[] arr ={1,4,0,2,3,0,9,8,0,0,1,0,0};
        String name = "madam";
        boolean result = isPalindrome(name);
        System.out.println(result);

    }

    private static boolean isPalindrome(String name) {
        String reverse = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            reverse += name.charAt(i);
        }
        return reverse.equalsIgnoreCase(name) ? true : false;

    }
}
