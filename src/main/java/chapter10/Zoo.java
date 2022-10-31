package chapter10;

public class Zoo {
    public static void main(String args[]) {
        Animal rocky = new Dog();
        rocky.makeSound();

        rocky = new Cat();
        rocky.makeSound();

        ((Cat) rocky).scratch();
    }
}
