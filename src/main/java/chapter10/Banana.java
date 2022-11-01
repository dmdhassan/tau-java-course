package chapter10;

public class Banana extends Fruit{
    public Banana() {
        setCalories("7Kcal");
    }

    public void peel() {
        System.out.println("peeling");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothy is made");
    }
}
