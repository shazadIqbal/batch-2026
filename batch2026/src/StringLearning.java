public class StringLearning {
    public static void main(String[] args) {
        String s1 = "stepway"; //literal
        String str = new String("stepway"); //object
        //String is special data type because its immutable(cant be changed)

        /** comparison
         when we create String object using literals then it
         should check from constant pool if its not present then
         it will create it ,String are case sensitive
         **/

        String str1 = "hello";
        String str2 = "hello";

        if(str1 == str2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        String name = "Stepway";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.contains("way"));

        for(char ch : name.toCharArray()){
            System.out.print(ch);
        }


    }
}
