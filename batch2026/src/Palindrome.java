public class Palindrome {
    public static void main(String[] args) {

        String name = "madam";

        char[] ch = name.toCharArray();

        boolean result = isPalindrome(name);
        System.out.println(result);


    }
     public static boolean isPalindrome(String name){

        char[] ch = name.toCharArray();

        String reversed = "";


        for (int i = ch.length -1; i >= 0 ; i--) {
            reversed += ch[i];


        }
         if (reversed.equals(name)){
             return true;
         }else{
             return false;
         }

        }
    }


