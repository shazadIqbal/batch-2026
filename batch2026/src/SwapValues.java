public class SwapValues {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        int tempVariable = a;

        a = b;

        b = tempVariable;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
