public class StringFrequence {
    public static void main(String[] args) {

        String word = "iteration";
        char[] ch = word.toCharArray();

        char letter = 'i';

        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if(letter == ch[i]){
                count ++;
            }

        }
        System.out.println(count);

    }
}
