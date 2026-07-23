public class ReverseString {
    public static void main(String[] args) {

        String name = "MUNIZA";
        char[] ch = name.toCharArray();

        String reversed = "";


        for (int i = ch.length -1; i >= 0 ; i--) {
            reversed += ch[i];

        }
        System.out.println(reversed);
    }
}
