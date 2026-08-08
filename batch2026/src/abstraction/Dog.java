package abstraction;

public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}