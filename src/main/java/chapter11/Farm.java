package chapter11;

public class Farm {
    public static void main (String[] args) {
        Animal duck = new Duck();
        ((Duck) duck).setSound("puck puck");

        ((Duck) duck).getSound();
    }

}
