package chapter10;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Gboh Gboh Woof! Woof!");
    }

    public static void fetch() {
        System.out.println("I'm a dog, I fetch things");
    }

}
