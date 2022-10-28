package chapter10;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("mew mew mew");
    }

    public void scratch() {
        System.out.println("I'm a cat, I scratch things bal bala");
    }
}
