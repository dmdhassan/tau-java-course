package chapter10;

public class Market {
    public static void main (String args[]) {
        Apple apple = new Apple();
        apple.removeSeed();
        apple.makeJuice();

        Fruit sarkodie = new Banana();

        ((Banana) sarkodie).makeJuice();

    }
}
