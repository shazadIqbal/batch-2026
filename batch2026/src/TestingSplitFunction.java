public class TestingSplitFunction {
    public static void main(String[] args) {

        String sentence = "I am learning Java";
        String[] words  = sentence.split(" ");

        for (String word: words){
            System.out.println(word);

        }

    }
}
